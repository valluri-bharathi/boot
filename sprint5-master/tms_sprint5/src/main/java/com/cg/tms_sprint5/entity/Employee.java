package com.cg.tms_sprint5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	public Employee() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLOYEE")
	@SequenceGenerator(sequenceName = "seq_employee", allocationSize = 1, name = "SEQ_EMPLOYEE")
	@Column(name = "employeeid")
	private int employeeid;
	//@Column(name = "employeename")
	private String employeename;
	@OneToOne
	@JoinColumn(name = "roleid")
	//@Column(name = "role")
	private Roles role;

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;

	}

	public Employee(String employeename, Roles roleId) {
		super();
		this.employeename = employeename;
		this.role = roleId;
	}

	@Override
	public String toString() {
		return "employeeid=" + employeeid + ", employeename=" + employeename + ", roleId=" + role.getRoleId() + "";
	}

}
