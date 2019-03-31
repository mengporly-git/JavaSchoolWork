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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int productID,qty;
        double price,amount,tax,pay;
        Scanner cin=new Scanner(System.in);
        System.out.print("ProductID=");
        productID=cin.nextInt();
        System.out.print("Price=$");
        price=cin.nextDouble();
        System.out.println("QTY=");
        qty=cin.nextInt();
        System.out.println("=================================================");
        amount=qty*price;
        tax=amount*0.1;
        pay=tax+amount;
        
        
        
        
        
    }
    
}
