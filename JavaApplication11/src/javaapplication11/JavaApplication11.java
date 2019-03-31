/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        int n,search;
        boolean t = false;
        System.out.print("How many elements:");
        n=cin.nextInt();

        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            int j=i+1;
            System.out.print("Element "+j+":");
            a[i]=cin.nextInt();
        }
        System.out.println("====================================");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
        int f;
        System.out.print("\nSearch=");
        search=cin.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(search==a[i])
            {
                
                System.out.println("Found in index"+i);
                t=true;
               // break;
                
            }
        }
        //if(t==false)
           // System.out.println("Not Found");
    }
    
}
