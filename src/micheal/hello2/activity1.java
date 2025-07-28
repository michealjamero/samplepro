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
public class activity1 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        String name;
        int subject;
        float grade;
        double total = 0;
        
        System.out.print("Enter student's name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        subject = sc.nextInt();

        for (int i = 1; i <= subject; i++) {
            System.out.print("Enter grade for sub" + i + ": ");
            grade = sc.nextFloat();
            total += grade;
        }

        double average = total / subject;

        System.out.printf("\nAverage: %.2f\n", average);

        if (average >= 75) {
            System.out.println("Remarks: PASSED");
        } else {
            System.out.println("Remarks: FAILED");
        }

        sc.close();
    }
}