/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniquiz;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Miniquiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gp = 0,golongan,bt=0,bp = 0,Total;
        String nip,nma;
        
         Scanner inputan= new Scanner(System.in);
        
        System.out.println("Gaji Pegawai");
        System.out.println("=======================================");
        System.out.println("Masukkan Nomer Induk Pegawai : ");
        nip=inputan.nextLine();
        System.out.println("Masukkan Nama : ");
        nma=inputan.nextLine();
        System.out.println("Masukkan Golongan [1/2/3/4] : ");
        golongan=inputan.nextInt();
       
        switch(golongan){
            case 1:
               gp= 2000000;
               bt= gp*40/100;
               bp= 40000;
               break; 
            case 2: 
                gp=2500000;
                bt= gp*40/100;
                bp= 40000;
                break;
            case 3:
                gp=3000000;
                bt= gp*50/100;
                bp= 50000;
                break;
            case 4:
                gp=4000000;
                bt= gp*60/100;
                bp= 55000;
                break;
            default:
             System.out.println("Golongan yang diinputkan tidak tersedia");
                break;
        
    }
        Total = gp+bt-bp;
        
         System.out.println("Gaji Pokoknya : Rp."+gp);
        System.out.println("Besar Tunjangan : Rp."+bt);
        System.out.println("Besar Potongan : Rp."+bp);
        System.out.println("Gaji Total : "+Total);
        
    
}}
