/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniquiz2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Miniquiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,j,i;
    
    Scanner input= new Scanner (System.in);
    
    System.out.print ("Masukkan Skala ");
    if (!input.hasNextInt())
        {
            System.out.print ("Harus angka! Tidak bisa di proses");
        } 
        else
        {
        n=input.nextInt();
        i=1;
        while (i<=2*n-1) 
          {
            j=1;
            while (j<=n) {
                 
                if (i==1 || i==n ||(j==n && i<n) || (j==1 && i>=n) || (i==2*n-1))
 
                { //kenapa n/2+1 karna jika dimasukan angka 5 maka int akan membulatkan dari 5/2 menjadi 2
                    //lalu untuk menjadi huruf H harusnya ada di tengah pemotongannya maka harus n/2+1
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
                j++;
        }
             i++;
        System.out.println();
        }
    }
    
    }
    }


