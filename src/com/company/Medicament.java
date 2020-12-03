package com.company;

import java.util.ArrayList;

public class Medicament {

    private int id;
    private String nameProduct;
    private String description;
    private int price;

    public Medicament(int id, String nameProduct, String description, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Medicament(){

    }

    @Override
    public String toString() {
        return "Id:" + id + "\n Name Product :" + nameProduct + "\n Description Product :" + description + "\n Price :" + price;
    }

    public String addMedicament(ArrayList<Medicament> medicaments, Medicament medicament){
        try{
           medicaments.add(medicament);
           return "Medicament Added";
        }catch(Exception ex){
            return ex.getMessage();
        }
    }

    public String editMedicament(ArrayList<Medicament> medicaments, Medicament medicament, int index){
        try {
           medicaments.set(index, medicament);
           return "Medicament Edited !";
        }catch (Exception ex){
           return  ex.getMessage();
        }
    }

    public String deleteMedicament(ArrayList<Medicament> medicaments, int index){
        try {
           medicaments.remove(index);
           return "Medicament Deleted !";
        }catch (Exception ex){
            return ex.getMessage();
        }
    }

    public String afficheMedicament(ArrayList<Medicament> medicaments){
        try{
            String md = "";
            for(Medicament medicament : medicaments){
                md += medicament.toString();
            }
            return md;
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
}
