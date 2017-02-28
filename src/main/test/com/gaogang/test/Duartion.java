package com.gaogang.test;

import java.io.Serializable;

public class Duartion implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String key;
	private String label;
	private String description;
	private String has_discount;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHas_discount() {
		return has_discount;
	}
	public void setHas_discount(String has_discount) {
		this.has_discount = has_discount;
	}
	
}
