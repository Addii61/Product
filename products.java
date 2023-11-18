/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducts;

/**
 *
 * @author cui
 */
public class products {
    protected String name;
    protected double price;
    protected int quantity;
    public products(String n, double p,int q){
    this.name=n;
    this.price=p;
    this.quantity=q;
}
    public void set(String name){
        this.name=name;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void setquantity(int quantity){
        this.quantity=quantity;
    }
    public String getname(){
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void display(){
        System.out.println("Name of product:"+this.getname()+"\nPrice of product is:"+this.getPrice()+"\nQuantity of product is:"+this.getQuantity());
    }
    /*@Override
   public String toString(){
        return String.format("Name of product:%S\nPrice of Product:%f\nQuantity of product:%d\n",this.getname(),this.getPrice(),this.getQuantity());
    }*/
}
