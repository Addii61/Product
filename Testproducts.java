/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproducts;

/**
 *
 * @author cui
 */
public class Testproducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Electronics E1=new Electronics("Fan",4000.00,2,"ISO","Solid");
        Clothing C1=new Clothing("Cotton",3000,1,"Cotton","Great");
        Books B1=new Books("Ccc",3400,5,"Shakir Shuja Abadi",20000);
        /*System.out.println(E1.toString());
        System.out.println(C1.toString());
        System.out.println(B1.toString());*/
        E1.display();
        C1.display();
        B1.display();
    }
    
}
