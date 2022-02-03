package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Pallavi.R.Patil
 */
@Entity
public class AttDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String employeeid;
	private String adate;
	private String logon;
	private String logoff;
	public AttDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttDetail(int aid, String employeeid, String adate, String logon, String logoff) {
		super();
		this.aid = aid;
		this.employeeid = employeeid;
		this.adate = adate;
		this.logon = logon;
		this.logoff = logoff;
	}
	/**
	 * 
	 * @return int returns integer which is Aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * 
	 * @param Employee accepts AttDetail Aid
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * 
	 * @return String returns integer which is Employeeid
	 */
	public String getEmployeeid() {
		return employeeid;
	}
	/**
	 * 
	 * @param Employee accepts AttDetail Employeeid
	 */
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	/**
	 * 
	 * @return String returns string which is Adate
	 */
	public String getAdate() {
		return adate;
	}
	/**
	 * 
	 * @param Employee accepts AttDetail Adate
	 */
	public void setAdate(String adate) {
		this.adate = adate;
	}
	/**
	 * 
	 * @return String returns string which is Logon
	 */
	public String getLogon() {
		return logon;
	}
	/**
	 * 
	 * @param Employee accepts AttDetail Logon
	 */
	public void setLogon(String logon) {
		this.logon = logon;
	}
	/**
	 * 
	 * @return String returns string which is Logoff
	 */
	public String getLogoff() {
		return logoff;
	}
	/**
	 * 
	 * @param Employee accepts AttDetail Logoff
	 */
	public void setLogoff(String logoff) {
		this.logoff = logoff;
	}
	@Override
	public String toString() {
		return "AttDetail [aid=" + aid + ", employeeid=" + employeeid + ", adate=" + adate + ", logon=" + logon
				+ ", logoff=" + logoff + "]";
	}
	
}