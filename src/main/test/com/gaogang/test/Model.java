package com.gaogang.test;

import java.io.Serializable;
import java.util.List;

public class Model implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private List<String> model_list;
	private List<Duartion> duartion_list;
	public List<String> getModel_list() {
		return model_list;
	}
	public void setModel_list(List<String> model_list) {
		this.model_list = model_list;
	}
	public List<Duartion> getDuartion_list() {
		return duartion_list;
	}
	public void setDuartion_list(List<Duartion> duartion_list) {
		this.duartion_list = duartion_list;
	}
	
	
}
