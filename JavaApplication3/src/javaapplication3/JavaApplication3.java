/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hour,rate,amount,tax=0,ramount;
        Scanner cin=new Scanner(System.in);
        System.out.print("Hour=");
        hour=cin.nextDouble();
        System.out.print("Rate=$");
        rate=cin.nextDouble();
        amount=hour*rate;
        System.out.println("Amount=$"+amount);
        if(amount>500)
        {
            tax=amount*0.05;
        }
        System.out.println("Tax=$"+tax);
        ramount=amount-tax;
        System.out.println("Real Amount=$"+ramount);
        
    }
    
}
