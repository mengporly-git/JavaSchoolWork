/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qty;
        double price, amount, change,rchange, money, total = 0,ch;
        Scanner cin = new Scanner(System.in);
        System.out.print("Price=$ ");
        price = cin.nextDouble();
        System.out.print("Qry= ");
        qty = cin.nextInt();
        amount = price * qty;
        System.out.println("Amouunt=$ " + amount);
        System.out.println("Payment:");

        int i = 1;
        do {
            System.out.print("Money" + i + ":");
            money = cin.nextDouble();
            total += money;
            i++;
        } while (total <= amount);

        System.out.println("Money Received=" + total);
        System.out.println("=============================================");
        
       change = total - amount ;
       ch=(int)change;
       System.out.println("Change=$ "+(int)ch);
       rchange=((total-amount)-ch)*4000;
       System.out.println("ChangeReils= "+rchange);

    }

}
