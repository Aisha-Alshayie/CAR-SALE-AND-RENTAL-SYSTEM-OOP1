
package com.mycompany.car.seal;


public class Car {

public int ID ;
    
    public String name;
    
    public int price;
    
    public String color;
    
    
    
    public Car( int id , String name , int price , String color){
            
        this.ID = id;
        
        this.name = name;
        
        this.price = price;
        
        this.color = color;
        
        
        
    }
    
    public void  set_ID(int id){
            
        this.ID = id;
    }
    
    public void  set_name(String name){
            
        this.name = name;
    }
    
    
    public void  set_price(int price){
            
        this.price = price;
    }
    
    
    public void  set_color(String color){
            
        this.color = color;
    }
    
    public int  get_ID(){
            
       return  (this.ID);
    }
    
    public String  get_name(){
            
      return   this.name;
    }
    
    
    public int  get_price(){
            
       return  this.price;
    }
    
    
    public String  get_color(){
            
        return this.color;
    }
    
    
    public void tostring(){ 
        
        System.out.print(" "+this.ID + "| " + this.name + " |  " +  this.price + "  |  " + this.color+"\n");
     
         
    }
    
}
