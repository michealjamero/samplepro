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
public class activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.next();
        System.out.print("Enter hourly rate:");
        float hrate = sc.nextFloat();
        System.out.print("Enter total hours worked: ");
        float hours = sc.nextFloat();

        
        System.out.println("---Wage Summary---");
        System.out.println("Employee: "+name);
        System.out.println("Hourly Rate:₱"+hrate);
        System.out.println("Hours Worked: "+ hours);
        System.out.println("Gross Weekly Wage:₱"+(hours * hrate));
        System.out.println("SSS Contribution (10%):₱"+(hours * hrate)*0.1);
        System.out.println("----------------------------");
        System.out.println("Net Weekly Wage:₱"+((hours * hrate)-((hours * hrate)*0.1)));
        
        
        
    }
}
