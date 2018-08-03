/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaranBahan2Resep;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "Krisna Putra Mariyanto / X RPL 5 / 18";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("\nSaran Resep dari Bahan Milik Anda");
       System.out.println("Bahan pertama : ");
       System.out.println("1. Pisang");
       System.out.println("2. Telur");
       System.out.print("Masukkan no pilihan anda : ");
       int bahan1 = scanner.nextInt();
       
       if (bahan1 == 1 || bahan1 == 2){
           System.out.println("1. susu");
           System.out.println("2. Minyak goreng");
           System.out.println("3. Tidak ada");
       }
       else {
           System.out.println("1. Minyak goreng");
           System.out.println("2. Roti");
           System.out.println("3. Tidak ada");}
           
           System.out.print("Masukkan no Pilihan anda : ");
           int bahan2=scanner.nextInt();
           
    }else
       System.out.println("Mohon Maaf, pilihan tidak ditemukan, " 
               + "tidak dapat memberikan bahan resep"); 

    
    
           
           
                   
       }
              
       
       
        
        
    }
    
}
