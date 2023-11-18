/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducts;

/**
 *
 * @author cui
 */
public class Electronics extends products{
    protected String Brand;
    protected String Material;
    public Electronics(String n,double p,int q,String b,String m){
        //products p1=new products(n,p,q);
        super(n,p,q);
        this.Brand=b;
        this.Material=m;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Brand Name:"+this.getBrand()+"\nProduct material:"+this.getMaterial());
        System.out.println("---------------------");
    }
    /*@Override
    public String toString(){
        return super.toString()+String.format("Brand Name:%S\nProduct Material:%S",this.getBrand(),this.getMaterial());
    }*/
}
