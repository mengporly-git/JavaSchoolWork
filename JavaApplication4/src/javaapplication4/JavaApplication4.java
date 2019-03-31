/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choose,iphone=0,number,amount;
        
        System.out.println("1. iPhoneX");
        System.out.println("2. iPhone8+");
        System.out.println("3. iPhone8");
        Scanner cin=new Scanner(System.in);
        System.out.print("Please choose: ");
        choose=cin.nextInt();
        
        if (choose==1){
            iphone=1000;
            System.out.println("You choose iPhoneX price=$1000");
        }
        else if (choose==2){
                iphone=900;
                System.out.println("You choose iPhoneX price=$1000");
        }
        else if(choose==3){
                iphone=800;
                System.out.println("You choose iPhoneX price=$1000");
        }
        else
            System.out.println("I don't have this phone!");
         
        
        System.out.print("Number=");
        number=cin.nextInt();
        amount=number*iphone;
        System.out.println("Amount="+amount);
        }
        
    }
    

