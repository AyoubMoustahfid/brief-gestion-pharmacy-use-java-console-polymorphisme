package models;

import java.util.ArrayList;

public class Pharmacist extends Person {

	public Pharmacist() {
	}

	public Pharmacist(int id, String firstname, String lastName, String telephone, String email) {
		super(id, firstname, lastName, telephone, email);
	}
	
	
	public String addPerson(ArrayList<Person> listPerson, Pharmacist pharmacist) {
		
		try {
			return super.addPerson(listPerson, pharmacist);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	public String affichePerson(ArrayList<Person> listPerson) {
		try {
			return super.affichePerson(listPerson);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	public String editPerson(ArrayList<Person> listPerson, Pharmacist pharmacist, int index) {
		
		try {
			return super.editPerson(listPerson, pharmacist, index);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	@Override
	public String deletePerson(ArrayList<Person> listPerson, int index) {
		
		try {
			return super.deletePerson(listPerson, index);
		} catch (Exception e) {
			return e.getMessage(); 
		}
	}

	
}
