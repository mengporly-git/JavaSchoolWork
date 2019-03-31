/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int java,c,eng,total,avg;
        Scanner cin=new Scanner(System.in);
        System.out.print("Java=");
        java=cin.nextInt();
        System.out.print("C#=");
        c=cin.nextInt(); 
        System.out.print("English=");
        eng=cin.nextInt();
        total=java+c+eng;
        avg=total/3;
        System.out.println("Total="+total);
        System.out.println("Average="+avg);
        
       
    }
    
}
