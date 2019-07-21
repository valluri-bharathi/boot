package com.cg.tms_sprint5.service;

import java.util.Set;

import com.cg.tms_sprint5.entity.Employee;
import com.cg.tms_sprint5.enums.Skills;
import com.cg.tms_sprint5.exception.ProgramException;



	public interface TrainerService {

		/**
		 * 
		 */
		public boolean addSkillsToTrainer( int trainerId, Skills skill);

		/**
		 * 
		 */
		public boolean delSkillsToTrainer( int trainerId, Skills skills);

		/**

		 * @throws ProgramException 
		 * 
		 */
		public Employee getTrainerDetails(int trainerId) throws ProgramException;

		/**
		 * @throws DatabaseWriteException 
		 * @throws ProgramException 
		 * @throws CourseNotFoundException 
		 * 
		 */
		public Set<Employee> getAllTrainers() throws ProgramException;

		public boolean createTrainer(Employee trainer) throws ProgramException;
		

	}

