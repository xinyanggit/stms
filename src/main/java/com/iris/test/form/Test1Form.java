package com.iris.test.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="test1form")
public class Test1Form implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int tid;
	private String cname;
	private int psn_code;
	
	@Id
	@SequenceGenerator(name="seq_test1form",sequenceName="seq_test1form",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_test1form")
	@Column(name="t_id")
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	@Column(name="cname")
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Column(name="psn_code")
	public int getPsn_code() {
		return psn_code;
	}
	public void setPsn_code(int psn_code) {
		this.psn_code = psn_code;
	}
	
	
}
