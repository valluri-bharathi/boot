package com.cg.tms_sprint5.dao;

import java.util.Set;

import com.cg.tms_sprint5.entity.Employee;
import com.cg.tms_sprint5.exception.ProgramException;


public interface CrudService<T> {

	/**
	 * 
	 */
	public Set<Employee> retrieveAll() throws ProgramException;
	
	public boolean create(Employee employee) throws ProgramException;

	/**
	 * 
	 */
	public boolean update(T o) throws ProgramException ;

	/**
	 * @throws ProgramException 
	 * 
	 */
	public T retrieve(int o) throws ProgramException;

	/**
	 * @throws ProgramException 
	 * 
	 */
	public boolean delete(T o) throws ProgramException;

	/**
	 * @throws ProgramException 
	 * 
	 */
	

	

	

}