package com.company;

import java.util.ArrayList;

public class Client extends Person{

    private int nbVente;


    public Client(int id, String firstname, String lastname, int phone, String email, int nbVente) {
        super(id, firstname, lastname, phone, email);
        this.nbVente = nbVente;
    }

    public int getNbVente() {
        return nbVente;
    }

    public void setNbVente(int nbVente) {
        this.nbVente = nbVente;
    }

    public Client(){

    }

    @Override
    public String toString() {
        return "Client : \n nombre Vente: " + nbVente ;
    }

    public String addPerson(ArrayList<Person> persons, Client client){
        try{
            return super.addPerson(persons, client);
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editPerson(ArrayList<Person> persons, Client client, int index){
        try {
            return super.editPerson(persons, client, index);
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
