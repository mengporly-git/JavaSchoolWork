/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Por
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        int score[]=new int[5],s=0,avg,max,min;
        
        for(int i=0;i<score.length;i++)
        { int j=i+1;
            System.out.print("Score"+j+"=");
            score[i]=cin.nextInt();
            s+=score[i];
        }
        System.out.println("\n=====================================");
        for (int i=0;i<score.length;i++)
        {    int j=i+1;
            System.out.print("Score"+j+"\t");
        }
        System.out.print("\n");
        for (int i=0;i<score.length;i++)
        {           
            System.out.print(score[i]+"\t");
        }
         
                
        System.out.println("\n=====================================");
        avg=s/5;
        System.out.println("Total Scores="+s);
        System.out.println("Average="+avg);
        max=score[0];
        min=score[0];
        
        for(int i=0;i<score.length;i++)
        {
            if(max<score[i])
                max=score[i];
            if(min>score[i])
                min=score[i];
                
        }
        
        System.out.println("Max="+max);   
        System.out.println("Min="+min);
        
    }
    
}
