/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s=0,num;
        Scanner cin=new Scanner(System.in);
        System.out.print("Num=");
        num=cin.nextInt();
        System.out.print("n=");
        n=cin.nextInt();
        
        if(n<num)
            System.out.println("Invalided Input"); 
        
        else
        {
            for(int i=num;i<=n;i++)
            {
                System.out.print(i+"+");
                s+=i;
            }  
            System.out.println("="+s);
        }
    }
    
}
