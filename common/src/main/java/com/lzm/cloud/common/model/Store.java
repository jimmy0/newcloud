package com.lzm.cloud.common.model;

import java.util.Date;

public class Store {

	private String id;
	private String name;
	private Integer amounts;
	private Date ctime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmounts() {
		return amounts;
	}

	public void setAmounts(Integer amounts) {
		this.amounts = amounts;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", amounts=" + amounts + ", ctime=" + ctime + "]";
	}
	
	

}
