/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konyvek;

import java.util.Scanner;

/**
 *
 * @author t1
 */
public class Konyvek {

  public static void main(String[] args) {
     DB ab=new DB(); 
     Scanner bill = new Scanner(System.in, "cp1250");
     boolean tovabb = true;
     String szerzo, cim, eredeti;
     int ev;
    
     while (tovabb) {
         System.out.println("1-listázás 2-új 3-törlés 0-kilépés");
         System.out.print("Válasz: ");;
         String v = bill.nextLine();
         switch (v.charAt(0)) {
             case '1':
                 System.out.print("Év: ");
                 ev = bill.nextInt();
                 bill.nextLine();
                 ab.kiir(ev);
                 break;
             case '2':
                 
                 break;
             case '3':
                 
                 break;
             default:
                 tovabb = false;
                 
         }
     }
  }
   
}
