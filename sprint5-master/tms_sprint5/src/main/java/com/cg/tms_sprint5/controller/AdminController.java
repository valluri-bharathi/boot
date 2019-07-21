package com.cg.tms_sprint5.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tms_sprint5.entity.Employee;
import com.cg.tms_sprint5.exception.ErrorMessages;
import com.cg.tms_sprint5.exception.ProgramException;
import com.cg.tms_sprint5.service.TrainerService;
import com.sun.media.jfxmedia.logging.Logger;

@RestController
public class AdminController {
	@Autowired
	private TrainerService service;
	private final logger LOGGER = LoggerFactory.getLogger(Admincontroller.class);

	// public void setService(TrainerService service) {
	// this.service = service;
	// }

	// To get details of all employees in database
	@GetMapping(value = "/employees/getall", produces = "application/json")
	public @ResponseBody Set<Employee> getAllTrainers() throws ProgramException {
		Logger.INFO("employee details");
		Set<Employee> employee = service.getAllTrainers();
		if (employee == null) {
			throw new ProgramException(ErrorMessages.MESSAGE1);
		}
		return employee;
	}

	// To create employee
	@PostMapping(value = "/trainers/create", consumes = "application/json")
	public String createTrainer(@RequestBody Employee trainer) throws ProgramException {
		Logger.INFO("employee got created");
		boolean flag = service.createTrainer(trainer);
		if (flag == true) {
			return "successfully added";
		}

		else {
			throw new ProgramException(ErrorMessages.MESSAGE12);
		}
	}
}
