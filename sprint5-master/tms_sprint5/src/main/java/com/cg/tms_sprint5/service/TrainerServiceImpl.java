package com.cg.tms_sprint5.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms_sprint5.dao.CrudService;
import com.cg.tms_sprint5.dao.TrainerServiceDaoImpl;
import com.cg.tms_sprint5.entity.Employee;
import com.cg.tms_sprint5.enums.Skills;
import com.cg.tms_sprint5.exception.ProgramException;

@Service
public class TrainerServiceImpl implements TrainerService {
	CrudService<Employee> crudOperation = new TrainerServiceDaoImpl();
	@Autowired
	private CrudService crudService;

	public Set<Employee> getAllTrainers() throws ProgramException {
		Set<Employee> employee = crudService.retrieveAll();
		return employee;
	}

	public boolean createTrainer(Employee trainer) throws ProgramException {
		boolean result = false;
		result = crudService.create(trainer);
		return result;
	}

	public boolean addSkillsToTrainer(int trainerId, Skills skill) {
		return false;
	}

	public boolean delSkillsToTrainer(int trainerId, Skills skills) {
		return false;
	}

	public Employee getTrainerDetails(int trainerId) throws ProgramException {
		Employee trainer = crudOperation.retrieve(trainerId);
		return trainer;
	}
}
