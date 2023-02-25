package com.mycompany.car.seal;

import java.util.*;


public class CarSeal extends Car{

    public static void main(String[] args) {
       
        ArrayList ListCar = new ArrayList();
        String name_e_const = "Aisha";
        String pass_e_const = "123";
        
        boolean w1 = true; 
        while(w1){
        System.out.print("\n** WELCOME TO CAR AND RENTAL SYSTEM**\n"+
                "1-employee"+"\n"+
                "2-customer"+"\n"+
                "your choic : ");
        
            Scanner scan = new Scanner(System.in);
            int  choic = scan.nextInt();
            
            System.out.println("--------------\n");
            
            if(choic == 1){
                
                System.out.println("* Employee * \n");
                
                System.out.print("Name : ");
                String name_e = scan.next();
                 System.out.print("\npassword : ");
                String pass_e = scan.next();
                
                if( (name_e == null ? name_e_const == null : name_e.equals(name_e_const)) && (pass_e == null ? pass_e_const == null : pass_e.equals(pass_e_const))){
                    
                    boolean w2 = true;
                    while(w2){
                    System.out.print("\n*Employee list* \n 1-add cars \n 2-update car information \n 3-delete car \n 4-print all the cars \n 5-Exit \n your choic : ");
                    
                    int choic_employe_list = scan.nextInt();
                    
                    if(choic_employe_list == 1){
                        
                            
                        System.out.println("*Add car * \n");
                        System.out.print("Car ID : ");
                        int id = scan.nextInt();
                        System.out.print("Car name : ");
                        String name_car = scan.next();
                        System.out.print("Price : ");
                        int price = scan.nextInt();
                        System.out.print("Color : ");
                        String color = scan.next();
                        
                        Car c = new Car(id , name_car , price , color);
                        
                        ListCar.add(c);
                        
                        
                    }else if(choic_employe_list == 2){
                        
                           System.out.println("*Update car Information* \n");
                           System.out.println("Enter Car ID : ");  
                           int id_confirm = scan.nextInt();
                           
                           for(int i = 0 ; i<ListCar.size(); i++){
                               
                               Car t =  ((Car) (ListCar.get(0)));
                               int test = 0;
                               if(t.ID == id_confirm){
                                    
                                        test = 1;
                                        System.out.print("Car ID : ");
                                        int id = scan.nextInt();
                                        System.out.print("Car name : ");
                                        String name_car = scan.next();
                                        System.out.print("Price : ");
                                        int price = scan.nextInt();
                                        System.out.print("Color : ");
                                        String color = scan.next();
                                        Car c = new Car(id , name_car , price , color );
                                        ((Car)ListCar.get(i)).set_ID(id);
                                        ((Car)ListCar.get(i)).set_name(name_car);
                                        ((Car)ListCar.get(i)).set_color(color);
                                        ((Car)ListCar.get(i)).set_price(price);
                                        
                               }
                               if(test == 0){
                                   System.out.println("not found this car");
                               }
                           }
                        
                        
                    }else if(choic_employe_list == 3){
                           System.out.println("* Delete  car * \n");
                        System.out.println("Car ID : ");
                        int id_confirm = scan.nextInt();
                        
                         for(int i = 0 ; i<ListCar.size(); i++){
                               
                               Car t =  ((Car) (ListCar.get(0)));
                               int test = 0;
                               if(t.ID == id_confirm){
                                    
                                        test = scan.nextInt();
                                       
                                        ListCar.remove(i);
                                        
                               }
                               if(test == 0){
                                   System.out.println("not found this car \n");
                               }
                           }
                         
                    }else if(choic_employe_list == 4){
                        
                        for(int i = 0 ; i < ListCar.size() ; i++){
                            
                            System.out.println(" ID " + "|" + " name " + "|" + " price " + "|" + " color ");
                            ( (Car) ListCar.get(i)).tostring();
                        }
                        
                        
                    }else if(choic_employe_list == 5){
                        w2 = false;
                    }
                    
                }}else{
                    System.out.println("\ninvaild login \n");
                }
                
                
            }else if(choic == 2){
                
                
                 System.out.println("*Customer * \n");
                  
                System.out.print("Name : ");
                String name = scan.next();
                 System.out.print("phone : ");
                String phone = scan.next();
                
                 System.out.print("address : ");
                String address = scan.next();
                
                    
                  boolean w3 = true;
                  while(w3){
                    System.out.print("*Customer list* \n 1-Buying \n 2-rent \n 3-Exit \n your choic : ");
                    
                    int choic_customer_list = scan.nextInt();
                    
                    System.out.print("------------\n");
                    
                    if(choic_customer_list == 1){
                            
                      
                        for(int i = 0 ; i < ListCar.size() ; i++){
                            
                            System.out.println("ID" + "|" + "name" + "|" + "price" + "|" + "color");
                            ( (Car) ListCar.get(i)).tostring();
                        }
                        
                        System.out.print("Enter ID : ");
                        int id = scan.nextInt();
                        
                           for(int i = 0 ; i<ListCar.size(); i++){
                               
                               Car t =  ((Car) (ListCar.get(0)));
                               int test = 0;
                               if(t.ID == id){
                                    
                                        test =1;
                                       
                                        System.out.println("\n** THE BILL**");

                                        System.out.println("\nname : " + name);
                                        
                                        System.out.println("phone : " + phone);
                                        
                                        System.out.println("address : " + address);
                                        
                                        System.out.println("car name: " + t.get_name());
                                        
                                        System.out.println("car color : " + t.get_color());
                                        
                                        System.out.println("Tax(15%) : " + (t.get_price()*0.15)+" SR");
                                        
                                        System.out.println("Price : " + (t.get_price()+(t.get_price()*0.15))+" SR");
                                        
                                        
                                        System.out.println(" *Thank you*  \n Do you want to buy or rental car enter(1) Exit(0): ");
                                        
                                        int b = scan.nextInt();
                                        
                                        if(b == 1){
                                            w1 = false;
                                        }else{
                                            w3 = false;
                                        }
                               }
                               if(test == 0){
                                   System.out.println("not found this car\n");
                               }
                           }
                        
                           
                        
                    }else if(choic_customer_list == 2){
                        
                        
                        for(int i = 0 ; i < ListCar.size() ; i++){
                            
                            System.out.println("ID" + "|" + "name" + "|" + "price" + "|" + "color");
                            ( (Car) ListCar.get(i)).tostring();
                        }
                        
                        System.out.print("\nEnter ID : ");
                        int id = scan.nextInt();
                        System.out.print("\nHow many dayes : ");
                        int day = scan.nextInt();
                        
                        
                           for(int i = 0 ; i<ListCar.size(); i++){
                               
                               Car t =  ((Car) (ListCar.get(0)));
                               int test = 0;
                               if(t.ID == id){
                                    
                                        test = 1;
                                      
                                        System.out.println("\n** THE BILL**");

                                        System.out.println("name : " + name);
                                        
                                        System.out.println("phone : " + phone);
                                        
                                        System.out.println("address : " + address);
                                        
                                        System.out.println("Day :" + (day));
                                        
                                        System.out.println("car name: " + t.get_name());
                                        
                                        System.out.println("Price: " + (t.get_price()));
                                        
                                        System.out.println("car color : " + t.get_color());
                                        
                                        System.out.println("Tax(15%) : " + ((t.get_price()*0.15)+" SR"));
                                        
                                        System.out.println("Price with days:" + ((t.get_price()*day)/2));
                                        
                                        System.out.println("Final Price : " +(((t.get_price()*day)/2)+((t.get_price()/3)*0.15))+" SR");
                                        
                                        
                                        System.out.println("Thank you* \n Do  you want to buy rental car(1) Exit(0):");
                                        
                                        int b = scan.nextInt();
                                        
                                        if(b == 1){
                                            w1 = false;
                                        }else{
                                            w3 = false;
                                        }
                               }
                               if(test == 0){
                                   System.out.println("not found this car");
                               }
                           }
                    }else if(choic == 3){
                        w1 = false;
                    }
                  }
            }
          
    }
    }
    public CarSeal(int id, String name, int price, String color) {
        super(id, name, price, color);
    }
    
}
