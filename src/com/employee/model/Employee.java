package com.employee.model;
/**
 * 
 * @author aranza
 * 
 * @param addressEmployee
 *
 */
public class Employee {
	private int idEmployee;
	private String nameEmployee;
	private byte ageEmployee;
	private String addressEmployee;
	private double salaryEmplooye;
	private String departmentEmployee;
	
	public Employee() {}
	public Employee(int idEmployee, String nameEmployee, byte ageEmployee, String addressEmployee,double salaryEmployee, String departmentEmployee) {
		
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public byte getAgeEmployee() {
		return ageEmployee;
	}
	public void setAgeEmployee(byte ageEmployee) {
		this.ageEmployee = ageEmployee;
	}
	public String getAddressEmployee() {
		return addressEmployee;
	}
	public void setAddressEmployee(String addressEmployee) {
		this.addressEmployee = addressEmployee;
	}
	public double getSalaryEmplooye() {
		return salaryEmplooye;
	}
	public void setSalaryEmplooye(double salaryEmplooye) {
		this.salaryEmplooye = salaryEmplooye;
	}
	public String getDepartmentEmployee() {
		return departmentEmployee;
	}
	public void setDepartmentEmployee(String departmentEmployee) {
		this.departmentEmployee = departmentEmployee;
	}
	public String toString() {
	return "idEmployee:"+this.idEmployee+"nameEmployee:"+this.nameEmployee+"ageEmployee:"+this.ageEmployee+"addressEmployee:"+this.addressEmployee+"salaryEmployee:"+this.salaryEmplooye+"departmentEmployee:"+this.departmentEmployee;
	}
}
