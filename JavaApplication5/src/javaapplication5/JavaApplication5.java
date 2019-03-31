/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner cin=new Scanner(System.in);
        int number,amount,color,price;
        System.out.println("Used car in Cambodia");
        System.out.println("highlander 2004");
        
        System.out.println("1. White    Price=20000");
        System.out.println("2. Gold     Price=19000");
        System.out.println("3. Silver   Price=18000");
        System.out.println("4. Other    Price=17000");
        
        
       System.out.print("Color=");
       color=cin.nextInt();   
       switch(color)
        {
           case 1: price=20000;break;
           case 2: price=19000;break;
           case 3: price=18000;break;
           default:price=17000;
        }
       
       System.out.print("Number=");
       number=cin.nextInt();
       amount=price*number;
       System.out.println("Amount="+amount);
    }
    
}
