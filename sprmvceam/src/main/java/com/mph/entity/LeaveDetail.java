package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Nisarga.GK
 */
@Entity
public class LeaveDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String ltype;
	private String reason;
	private String fromdate;
	private String todate;
	public LeaveDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveDetail(int lid, String ltype, String reason, String fromdate, String todate) {
		super();
		this.lid = lid;
		this.ltype = ltype;
		this.reason = reason;
		this.fromdate = fromdate;
		this.todate = todate;
	}
	/**
	 * 
	 * @return int returns integer which is Lid
	 */
	public int getLid() {
		return lid;
	}
	/**
	 * 
	 * @param Employee accepts LeaveDetail lid
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}
	/**
	 * 
	 * @return String returns string which is Ltype
	 */
	public String getLtype() {
		return ltype;
	}
	/**
	 * 
	 * @param Employee accepts LeaveDetail ltype
	 */
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	/**
	 * 
	 * @return String returns string which is Reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * 
	 * @param Employee accepts LeaveDetail reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 
	 * @return String returns string which is Fromdate
	 */
	public String getFromdate() {
		return fromdate;
	}
	/**
	 * 
	 * @param Employee accepts LeaveDetail fromdate
	 */
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	/**
	 * 
	 * @return String returns string which is Todate
	 */
	public String getTodate() {
		return todate;
	}
	/**
	 * 
	 * @param Employee accepts LeaveDetail todate
	 */
	public void setTodate(String todate) {
		this.todate = todate;
	}
	@Override
	public String toString() {
		return "LeaveDetail [lid=" + lid + ", ltype=" + ltype + ", reason=" + reason + ", fromdate=" + fromdate
				+ ", todate=" + todate + "]";
	}
	
	
}

/*+ ", eid=" + eid + "*/