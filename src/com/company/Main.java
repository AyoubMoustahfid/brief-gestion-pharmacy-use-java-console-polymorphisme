package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Medicament> medicaments = new ArrayList<Medicament>();
        ArrayList<Person> clients = new ArrayList<Person>();
        ArrayList<Person> pharmaciens = new ArrayList<Person>();

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        boolean var = true;

        while(var){
            /*  Depart de la gestion les programme
             * ------- Menu Principal ------
             * --->>> la gestion Medicament
             * --->>> la gestion Book
             * */

            System.out.println("======= Mednu de les gestion programmes =======");
            System.out.println("(1) Gestion medicament");
            System.out.println("(2) gestion Client");
            System.out.println("(3) gestion Pharmacien");

            int choix = scanner.nextInt();

            switch (choix){
                case 1:
                    boolean variable1 = true;
                    while(variable1){
                        // Gestion Medicament
                        // Method CRUD(ADD, UPDATE, DELETE)
                        // Search Any product in medicaments

                        System.out.println("(1) add medicament");
                        System.out.println("(2) delete medicament");
                        System.out.println("(3) update medicament");
                        System.out.println("(4) show all medicaments");
                        System.out.println("(5) search about any medicament in list medicament");
                        System.out.println("(6) retour à les Choix");

                        System.out.println("CHoix :");

                        int choixPharmacien = scanner.nextInt();
                        switch (choixPharmacien){
                            case 1 :
                                System.out.println("add id product: \n");
                                int id = medicaments.size() + 1;
                                System.out.println(id);
                                
                                System.out.println("add name Product: \n");
                                String nameProduct = scanner.next();
                                
                                System.out.println("add description Product: \n");
                                scanner.nextLine();
                                String descriptionProduct = scanner.nextLine();
                                
                                System.out.println("Add price product: \n");
                                int price = 0;
                                boolean isNumber;
                                do {
                                	 if(scanner.hasNextInt()) {
                                    	 price = scanner.nextInt();
                                         System.out.println("DH");
                                         isNumber = true;
                                    }else {
                                    	System.out.println("Please enter number betwenn [0-9]");
                                    	isNumber = false;
                                    	scanner.next();
                                    }
                                }while(!(isNumber));
                                System.out.println(price);
                               
                                Medicament medicament = new Medicament(id, nameProduct, descriptionProduct, price);
                                medicament.addMedicament(medicaments, medicament);
                                // afficher message d'ajoute le produit medicament
                                System.out.println(Error.WARN.toString());

                                break;

                            case 2:
                                System.out.println("Medicament deleted !!");
                                int idIndex = scanner.nextInt();
                                 Medicament deleteMedicament = new Medicament();
                                 deleteMedicament.deleteMedicament(medicaments, idIndex - 1);
                                System.out.println("Select medicament to delete");
                                break;

                            case 3:
                            	System.out.println("select index medicament to update");
                                int ii = scanner.nextInt() -1;
                                for (int i = 0; i < medicaments.size(); i ++){
                                    if(ii == i){
                                        System.out.println("Enter index medicament");
                                        int newId = scanner.nextInt();

                                        System.out.println("new Name the Product :");
                                        String newName  = scanner.next();

                                        System.out.println("new Description the product :");
                                        String newDescription = scanner.next();

                                        System.out.println("new Price the product :");
                                        int newPrice = scanner.nextInt();
                                        System.out.println("DH");

                                        Medicament updateMedicament = new Medicament(newId, newName, newDescription, newPrice);
                                        updateMedicament.editMedicament(medicaments, updateMedicament, newId - 1);
                                        System.out.println("Product Updated");
                                    }else{
                                        System.out.println("no id is associated try again more");
                                    }
                                }

                                System.out.println("Update successfly");
                                break;

                            case 4:
                                System.out.println("Show Mediacament");
                                Medicament showMedicament = new Medicament();
                                String data = showMedicament.afficheMedicament(medicaments);
                                System.out.println(data);
                                break;

                            case 5 :
                                System.out.println("Search your medicament");
                                String search = scanner.next();

                                System.out.println("-----------------------------------------------");
                                System.out.printf("%10s %10s %10s %10s %10s", "ID dans table", "ID", "name ", "description", "price");
                                System.out.println();
                                System.out.println("-----------------------------------------------");

                              for (int i = 0; i < medicaments.size(); i++){
                                  if(medicaments.get(i).getNameProduct().contains(search)){
                                    @SuppressWarnings("unused")
									Medicament searchMedicament = new Medicament();
                                      System.out.println(medicaments.get(i).toString());
                                      System.out.println();
                                      System.out.println("Yes is excesste");
                                      System.out.println("------------------------------");
                                  }else{
                                      System.out.println("this medicament is not in stock");
                                  }
                              }
                              break;

                            case 6:
                                System.out.println("End");
                                variable1 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("Choix invalid !!!!");
                                break;
                        }
                    }

                    break;

                case 2:
                    boolean variable2 = true;
                    while (variable2){
                        // Gestion Client
                        // ADD Client
                        // if client fedÃ©le else not fedÃ©le
                        System.out.println("(1) add client");
                        System.out.println("(2) delete client");
                        System.out.println("(3) update client");
                        System.out.println("(4) retour Ã  les Choix");

                        System.out.println("Choix :");
                        int choixClient = scanner.nextInt();

                        switch (choixClient){
                            case 1:
                                int id = clients.size() + 1;
                                System.out.println("add firstname Client: \n");
                                String firstname = scanner.next();

                                System.out.println("add lastname Client: \n");
                                String lastname = scanner.next();

                                System.out.println("add phone CLient: \n");
                                int phone = scanner.nextInt();

                                System.out.println("add email Client: \n");
                                String email = scanner.next();

                                System.out.println("Add Some Vente Client : \n");
                                int nbVente = scanner.nextInt();

                                Client client = new Client(id, firstname, lastname, phone, email, nbVente);
                                client.addPerson(clients, client);


                              
                                // if condition pour validation long de nombre téléphone avec la methode Opération ternaire  
                                String result = phone >= 10 ? "Client Added" : "error in length number the phone ";
                                System.out.println(result);
                                
                                // if condition pour afficher message est ce que le client il est fedéle ou non avec la methode Opération ternaire 
                                String resultVente = nbVente >= 3 ? "cette person une client fedéle :) :)" : "cette person n' a pas une client fedéle ";
                                System.out.println(resultVente);

                                break;

                            case 2:
                                System.out.println("Delete Client");
                                System.out.println("----------------------------------------------");

                                System.out.println("select client to deleted !!");
                                System.out.println("Are you sure (yes)  or  (no) ???");
                                String delete = scanner.next();

                                switch (delete){
                                    case "yes":
                                        int idDelete = scanner.nextInt();
                                        Client deleteCient = new Client();
                                        deleteCient.deletePerson(clients, idDelete - 1);
                                        System.out.println("deletes succussfly");
                                        break;

                                    default:
                                        System.out.println("Not Sure");
                                        break;
                                }

                                break;

                            case 3:
                                System.out.println("Enter Id :");
                                int newId = scanner.nextInt();

                                System.out.println("Enter new firstname :");
                                String newFirstname = scanner.next();

                                System.out.println("Enter new lastname :");
                                String newLastname = scanner.next();

                                System.out.println("Enter new Phoen :");
                                int newPhone = scanner.nextInt();

                                System.out.println("Enter new Email :");
                                String newEmail = scanner.next();

                                System.out.println("Enter new Number Vente :");
                                int newNbVente = scanner.nextInt();

                                Client updateClient = new Client(newId, newFirstname, newLastname, newPhone, newEmail, newNbVente);
                                updateClient.editPerson(clients, updateClient, newId - 1);

                                System.out.println(" Client Updated !!");
                                break;
                                
                           
                            case 4:
                            
                           
                            Collections.sort(clients, nameComparator );
                            System.out.println(clients);
                            	break;
                            	
                            case 5:
                                System.out.println("End");
                                variable2 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("Choix invalid !!!!");
                                break;

                        }
                    }

                    break;

                case 3:
                    boolean variable3 = true;

                    while (variable3){
                        // Gestion Pharmacien
                        // ADD Pharmacien
                        System.out.println("(1) add pharmacien");
                        System.out.println("(2) delete pharmacien");
                        System.out.println("(3) update pharmacien");
                        System.out.println("(4) retour à les Choix");

                        System.out.println("Choix :");
                        int choixPharmacien = scanner.nextInt();
                        switch (choixPharmacien){
                            case 1:
                                int id = clients.size() + 1;
                                System.out.println("add firstname Pharmacien: \n");
                                String firstname = scanner.next();

                                System.out.println("add lastname Pharmacien: \n");
                                String lastname = scanner.next();

                                System.out.println("add phone Pharmacien: \n");
                                int phone = scanner.nextInt();

                                System.out.println("add email Pharmacien: \n");
                                String email = scanner.next();


                                Pharmacien pharmacien = new Pharmacien(id, firstname, lastname, phone, email);
                                pharmacien.addPerson(pharmaciens, pharmacien);


                                // if condition pour validation long de nombre téléphone avec la methode Opération ternaire  
                                String result = phone >= 10 ? "Client Added" : "error in length number the phone ";
                                System.out.println(result);

                                break;

                            case 2 :
                                System.out.println("Delete Client");
                                System.out.println("----------------------------------------------");
                                System.out.println("select client to deleted !!");
                                System.out.println("Are you sure (yes)  or  (no) ???");
                                String delete = scanner.next();

                                switch (delete){
                                    case "yes":
                                        int idDelete = scanner.nextInt();
                                        Pharmacien deletePharmacien = new Pharmacien();
                                        deletePharmacien.deletePerson(pharmaciens, idDelete - 1);
                                        System.out.println("deletes succussfly");
                                        break;

                                    default:
                                        System.out.println("Not Sure");
                                        break;
                                }

                                break;

                            case 3 :
                                System.out.println("Enter Id :");
                                int newId = scanner.nextInt();

                                System.out.println("Enter new firstname :");
                                String newFirstname = scanner.next();

                                System.out.println("Enter new lastname :");
                                String newLastname = scanner.next();

                                System.out.println("Enter new Phoen :");
                                int newPhone = scanner.nextInt();

                                System.out.println("Enter new Email :");
                                String newEmail = scanner.next();


                                Pharmacien updatePharmacien = new Pharmacien(newId, newFirstname, newLastname, newPhone, newEmail);
                                updatePharmacien.editPerson(pharmaciens, updatePharmacien, newId - 1);

                                System.out.println("Pharmacien Updated !!");
                                break;
                            
                          
                            case 4:
                                System.out.println("End");
                                variable3 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("Choix invalid !!!!");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("=+++++++++++  END ================");
                    System.out.println(0);
                    break;

                default:
                    System.out.println("Choix invalid !!!!!!");
                    break;
            }
        }

    }
    
	public static Comparator<Person> nameComparator = new Comparator<Person>() {

        public int compare(Person c1, Person c2) {
           String clientName = c1.getFirstname(), clientLName = c2.getLastname();
           

           //ascending order
           return clientName.compareTo(clientLName);

        }


    };
}
