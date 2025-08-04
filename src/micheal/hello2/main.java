package micheal.hello2;

import java.util.Scanner;
import micheal.hello2.jamerosBangking.bangking.bangking;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bangking bc = new bangking(); 
                int attempts = 0;
                boolean success = false;

                while (attempts < 3) {
                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        success = true;
                        break; 
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT! Attempt " + attempts + " of 3.");
                    }
                }

                if (!success) {
                    System.out.println("Maximum login attempts reached. Exiting...");
                }
                break;

            case 2:
               
                break;

            case 3:
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }

        sc.close();
    }
}
