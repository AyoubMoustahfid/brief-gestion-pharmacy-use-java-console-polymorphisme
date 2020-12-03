package models;

import java.util.ArrayList;


public class Person {

	private int id;
	private String Firstname;
	private String LastName;
	private String telephone;
	private String Email;

	public Person(int id, String firstname, String lastName, String telephone, String email) {
		super();
		this.id = id;
		Firstname = firstname;
		LastName = lastName;
		this.telephone = telephone;
		Email = email;
	}

	public Person() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", Firstname=" + Firstname + ", LastName=" + LastName + ", telephone=" + telephone
				+ ", Email=" + Email + "]";
	}
	
	public String addPerson(ArrayList<Person> listPerson, Person person) {
		try {
			listPerson.add(person);
			return "Person Added";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
		
		public String editPerson(ArrayList<Person> listPerson, Person person, int index) {
		try {
			
			listPerson.set(index, person);
			return "Person Edited !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
		
		public String deletePerson(ArrayList<Person> listPerson, int index) {
		try {
			
			listPerson.remove(index);
			return "Person Removed !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
		public String affichePerson(ArrayList<Person> listPerson) {
		try {
			String s="";
			for (Person person : listPerson) {
				s += "\n "+person.toString();
			} 
			return s;
			 
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}

}
