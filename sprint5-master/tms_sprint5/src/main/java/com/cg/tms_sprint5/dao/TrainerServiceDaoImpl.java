package com.cg.tms_sprint5.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.tms_sprint5.entity.Employee;
import com.cg.tms_sprint5.exception.ProgramException;

@Repository
@Transactional
public class TrainerServiceDaoImpl implements CrudService<Employee> {
	@PersistenceContext
	private EntityManager entityManager;

	public Set<Employee> retrieveAll() throws ProgramException {
		Query employees = entityManager.createQuery("Select e from Employee e");
		List<Employee> result = employees.getResultList();
		Set<Employee> hashSet = new HashSet<Employee>();
		hashSet.addAll(result);
		return (Set<Employee>) hashSet;
	}

	public boolean create(Employee trainer) throws ProgramException {
		entityManager.persist(trainer);
		return true;
	}

	// @Override
	public boolean update(Employee o) {
		return false;
	}

	// @Override
	public Employee retrieve(int trainerId) throws ProgramException {
		Set<Employee> trainerSet = retrieveAll();
		for (Employee trainer : trainerSet) {
			if (trainerId == (trainer.getEmployeeid())) {
				return trainer;
			}
		}

		return null;
	}

	// @Override
	public boolean delete(Employee o) {
		return false;
	}

}
