package com.company;

public enum Error {
  WARN("medicament is added");

	
	
	private final String add;

	
	Error(String add) {
		this.add = add ;

	}
	
	public String getAdd() {
		return add;
	}
    
	
	
	
	
	@Override
	public String toString() {
		return add;
	}
}
