package com.mph.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Pradheep.S
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private String email;
	private String password;
	private String role;
	private double phone;
	private String worklocation;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String email, String password, String role, double phone,
			String worklocation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.password = password;
		this.role = role;
		this.phone = phone;
		this.worklocation = worklocation;
	}
	/**
	 * 
	 * @return int returns integer which is Eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * 
	 * @param Employee accepts employee eid
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * 
	 * @return String returns string which is Ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * 
	 * @param Employee accepts employee ename
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * 
	 * @return String returns string which is Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param Employee accepts employee email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return String returns string which is Password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param Employee accepts employee password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return String returns string which is Role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * 
	 * @param Employee accepts employee role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * 
	 * @return Double returns double which is Phone
	 */
	public double getPhone() {
		return phone;
	}
	/**
	 * 
	 * @param Employee accepts employee phone
	 */
	public void setPhone(double phone) {
		this.phone = phone;
	}
	/**
	 * 
	 * @return String returns string which is Worklocation
	 */
	public String getWorklocation() {
		return worklocation;
	}
	/**
	 * 
	 * @param Employee accepts employee worklocation
	 */
	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + ", role="
				+ role + ", phone=" + phone + ", worklocation=" + worklocation + "]";
	}
	
	
}