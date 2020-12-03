package models;

import java.util.ArrayList;

public class Client extends Person {

	private String badge;

	public Client(int id, String firstname, String lastName, String telephone, String email, String badge) {
		super(id, firstname, lastName, telephone, email);
		this.badge = badge;
	}

	public Client() {
	}

	

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	@Override
	public String toString() {
		return "Client [badge=" + badge + "]";
	}
	
	public String addPerson(ArrayList<Person> listPerson, Client client) {
		try {
			return super.addPerson(listPerson, client);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String editPerson(ArrayList<Person> listPerson, Client client, int index) {
		try {
			return super.editPerson(listPerson, client, index);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String deletePerson(ArrayList<Person> listPerson, int index) {
		try {
			return super.deletePerson(listPerson, index);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@Override
	public String affichePerson(ArrayList<Person> listPerson) {
		try {
			return super.affichePerson(listPerson);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
