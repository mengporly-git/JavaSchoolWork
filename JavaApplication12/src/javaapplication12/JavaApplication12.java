/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner cin=new Scanner(System.in);
        
        
        do{
            System.out.println("Please insert number to bet from (1-5)");
            System.out.print("Bet Number:");
            num=cin.nextInt();
            Random rnd=new Random();
            if (num>0 && num<=5){
                int result=rnd.nextInt(5)+1;
                System.out.println("Result"+result);
                if (num==result)
                    System.out.println("You Won");
                else
                    System.out.println("You Lost");
            }
            else 
                System.out.println("Insert Again");
        }while(num<0 || num>5);
    }
    
}
