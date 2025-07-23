/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micheal.hello2;

import java.util.Scanner;

/**
 *
 * @author PC 30
 */
public class MichealHELLO2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        String name;
        int birthyear;
        
        System.out.print("Enter name Here:");
        name = input.nextLine();
        
        System.out.print("Enter age Here:");
        birthyear = input.nextInt();
        int age = 2025 - birthyear;
        
        
   System.out.println("HELLO "+name+", your age is "+(2025-birthyear));
   
   if(age >= 18){
       System.out.println("votable");
   }else{
       System.out.println("Minority");
   }
    }
    
}

