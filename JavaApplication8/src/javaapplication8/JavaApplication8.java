/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int java,csharp,net,average,total,score;
        Scanner cin=new Scanner(System.in);
        
        do
        {
            System.out.print("Java=");
            java=cin.nextInt(); 
        }while(java<0 || java>100);
        
        do
        {
            System.out.print("C#=");
            csharp=cin.nextInt(); 
        }while(csharp<0 || csharp>100);
        
        do
        {
            System.out.print("Net=");
            net=cin.nextInt(); 
        }while(net<0 || net>100);
     
        total=java+csharp+net;
        average=total/3;
        System.out.println("Total Scores="+total);
        System.out.println("Average="+average);
       
        
    }
    
}
