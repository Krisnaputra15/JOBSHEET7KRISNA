/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaPercabangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CobaPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Krisna Putra Mariyanto / X RPL 5 / 18";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if (a <5)System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIf.. 2");
        if (a==5) System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIf.. 3");
        if (a>5) 
            System.out.println("nilai a lebih dari 5");
        
        System.out.println("\nIF..ELSE..");
        if (a<5) {
            System.out.println("isi variabel a : " +a);
            System.out.println("nilai a kurang dari 5");
       }else {
               System.out.println("nilai variabel a lebih dari atau sama dengan 5");
        }
        
        System.out.println("\nIF..ELSEIF..ELSE.. 1");
        if (a<5) {
            System.out.println("nilai a kurang dari 5"); }
      
        else {
            System.out.println("nilai a lebih dari 5"); }
        
        System.out.println("\nIF..ELSEIF..ELSE.. 2");
        if (a<2) {
            System.out.println("nilai a kurang dari 2");}
        else if (a<4) {
             System.out.println("nilai a kurang dari 4");}
        else if (a<6) {
             System.out.println("nilai a kurang dari 6");}
        else if (a == 6) {
             System.out.println("nilai a sama dengan 6");}
        else {
             System.out.println("nilai a lebih dari 6");}
        
        System.out.println("\nNested IF");
        if (a<7) {
            System.out.println("nilai a kurang dari 7");}
        if (a > 2) {
            System.out.println("nilai a lebih dari 2");}
        if (a<4) {
            System.out.println("nilai a kurang dari 4");}
        
        System.out.println("\nSWITCH..CASE");
        switch(a) {
            case 1 : System.out.println("nilai a => 1"); break;
            case 2 : System.out.println("nilai a => 2"); break;
            case 3 :
            case 4 : System.out.println("nilai a => 3 atau 4"); break;
            case 5 : System.out.println("nilai a => 5"); break;
            default : System.out.println("nilai a bukan diantara 1 - 5");
        }
        
        }
        
    
                
        
        
        
        
                    
        }
    
    
    
