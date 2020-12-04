package com.company;

import java.util.ArrayList;

public class Person {
    private int id;
    private String firstname;
    private String lastname;
    private int phone;
    private String email;

    public Person(int id, String firstname, String lastname, int phone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(){

    }

    
    
    @Override
    public String toString() {
        return "Id:" + id + "\n firstname :" + firstname + "\n lastname :" + "\n phone :" + phone + "\n Email :" + email;
    }

    public String addPerson(ArrayList<Person> persons, Person person){
        try{
            persons.add(person);
            return "Person Added";
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editPerson(ArrayList<Person> persons, Person person, int index){
        try {
            persons.set(index, person);
            return "Person Edited !";
        }catch (Exception ex){
            return  ex.getMessage();
        }
    }

    public String deletePerson(ArrayList<Person> persons, int index){
        try {
            persons.remove(index);
            return "Person Deleted !";
        }catch (Exception ex){
            return ex.getMessage();
        }
    }

    public String affichePerson(ArrayList<Person> persons){
        try{
            String pr = "";
            for(Person person : persons){
                pr += person.toString();
            }
            return pr;
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
}
