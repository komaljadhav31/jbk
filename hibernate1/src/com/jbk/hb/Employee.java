package com.jbk.hb;
// Generated Apr 22, 2020 11:51:34 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee", catalog = "students")
public class Employee implements java.io.Serializable {

	private Integer empid;
	private String empame;
	private String empcity;
	private String epemail;

	public Employee() {
	}

	public Employee(String empame, String empcity, String epemail) {
		this.empame = empame;
		this.empcity = empcity;
		this.epemail = epemail;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "empid", unique = true, nullable = false)
	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Column(name = "empame", nullable = false, length = 45)
	public String getEmpame() {
		return this.empame;
	}

	public void setEmpame(String empame) {
		this.empame = empame;
	}

	@Column(name = "empcity", nullable = false, length = 45)
	public String getEmpcity() {
		return this.empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	@Column(name = "epemail", nullable = false, length = 45)
	public String getEpemail() {
		return this.epemail;
	}

	public void setEpemail(String epemail) {
		this.epemail = epemail;
	}

}
