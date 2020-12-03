package models;

import java.util.ArrayList;

public class Medication {

	private int id;
	private String name;
	private String description;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Medication(int id, String name, String description, String price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Medication() {
		
	}
	

	public String AddMedication(ArrayList<Medication> medications, Medication medication) {
		
		try {
			 medications.add(medication);
			 return "Medication added";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String editMedication(ArrayList<Medication> medications,Medication medication,int index) {
		try {
			 medications.set(index, medication);
			return "medication updated";
					
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	public String deleteMedication(ArrayList<Medication> medications,int index) {
		try {
			medications.remove(index);
			return "medication removed";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String afficheMedication(ArrayList<Medication> medications) {
		try {
			String m="";
			for (Medication medication : medications) {
				m += "\n "+medication.toString();
			} 
			return m;
			 
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}

	
	
	
	
}
