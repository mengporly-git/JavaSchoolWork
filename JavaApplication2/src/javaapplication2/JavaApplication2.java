/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication2 {

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
        System.out.print("QTY=");
        qty=cin.nextInt();
        System.out.println("=================================================");
        amount=qty*price;
        tax=amount*0.1;
        pay=tax+amount;
        System.out.print("ProductID\tPrice\tQty\tAmount\tTax\tPayment\n");
        System.out.print(productID);
        System.out.print("\t\t"+price);
        System.out.print("\t"+qty);
        System.out.print("\t"+amount);
        System.out.print("\t"+tax);
        System.out.print("\t"+pay);
        
    }
    
}
