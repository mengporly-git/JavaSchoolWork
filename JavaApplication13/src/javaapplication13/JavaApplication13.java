/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        int num;
        boolean t=false;
        System.out.print("How many number:");
        num=cin.nextInt();
        
        int a[]=new int[num];
        for(int i=0;i<a.length;i++)
        {
            int j=i+1;
            System.out.print("Num"+j+":");
            a[i]=cin.nextInt();
        }
        Random rnd=new Random();
        int result=rnd.nextInt(5)+1;
        System.out.println("Result:"+result);
        for(int i=0;i<a.length;i++)
        {
            if (a[i]==result)
            {
                System.out.println("You Won");
                t=true;
                break;
            }
        }
            if (t==false)
                System.out.println("You Lost");
        
    }
    
}
