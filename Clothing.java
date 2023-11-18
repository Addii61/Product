/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducts;

/**
 *
 * @author cui
 */
public class Clothing extends products{
    protected String Size;
    protected String Material;
    public Clothing(String n,double p,int q,String s,String m){
        super(n,p,q);
        this.Size=s;
        this.Material=m;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
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
        System.out.println("Size of Cloth:"+this.getSize()+"\nMaterial of Cloth:"+this.getMaterial());
        
        System.out.println("------------------------");
    }
    /*@Override
    public String toString(){
      return super.toString()+String.format("Size of Clothing Product:%s\nMaterial of Product:%s",this.getSize(),this.getMaterial());
    }*/
}
