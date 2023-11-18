/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproducts;

/**
 *
 * @author cui
 */
public class Books extends products{
    protected String Authors;
    protected int page;
    public Books(String n,double p,int q,String A,int page){
        super(n,p,q);
        this.Authors=A;
        this.page=page;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String Authors) {
        this.Authors = Authors;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Name of Author:"+this.getAuthors()+"\nPage of book"+this.getPage());
    }
    /*@Override
    public String toString(){
        return super.toString()+String.format("Name of Author:%S\nPages of book:%S",this.getAuthors(),this.getPage());
    }*/
    
}
