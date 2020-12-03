package com.company;

import java.util.ArrayList;

public class Pharmacien extends Person{

    public Pharmacien(int id, String firstname, String lastname, int phone, String email) {
        super(id, firstname, lastname, phone, email);
    }

    public Pharmacien() {
    }

    public String addPerson(ArrayList<Person> persons, Pharmacien pharmacien){
        try{
            return super.addPerson(persons, pharmacien);
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editPerson(ArrayList<Person> persons, Pharmacien pharmacien, int index){
        try {
            return super.editPerson(persons, pharmacien, index);
        }catch (Exception ex){
            return  ex.getMessage();
        }
    }

    public String deletePerson(ArrayList<Person> persons, int index){
        try {
            return super.deletePerson(persons, index);
        }catch (Exception ex){
            return ex.getMessage();
        }
    }

    public String affichePerson(ArrayList<Person> persons){
        try{
            return super.affichePerson(persons);
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
}
