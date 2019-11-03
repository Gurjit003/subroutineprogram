/*
 * Gurjit Singh
 * Thursday October 31st - 2019
 * This program displays the first subroutines
 */

package subroutineprogram;

import java.util.Scanner;

public class Subroutineprogram  {   

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);    
        
        int num1, num2, num3;  // Variable declaration
        int option = 0;
        final String DATE = "October 31st - 2019";
        
        do {
            System.out.println("Menu:");
            System.out.println("");
            System.out.println("1. To calculate the sum of two numbers");
            System.out.println("2. To calculate the product of two numbers");
            System.out.println("3. To calculate the perimeter of a triangle");
            System.out.println("4. To calculate the area of a triangle");
            System.out.println("5. To calculate the volume of a square based pyramid");
            System.out.println("6. To exit the program");
            System.out.println("");
            
            option = input.nextInt(); // Receives input from the user
            
            if (option==1){
                System.out.println("Enter the first number:");
                num1 = input.nextInt();
                System.out.println("Enter the second number:");
                num2 = input.nextInt();
                System.out.println("The sum is " + addAndOut(num1,num2)); // Outputs the sum
                System.out.println("");
            }
            else if (option==2) {
                System.out.println("Enter the first number:");
                num1 = input.nextInt();
                System.out.println("Enter the second number:");
                num2 = input.nextInt(); 
                System.out.println("The product is " + multAndOut(num1,num2) ); // Outputs the product
                System.out.println("");
            }
            else if (option==3) {
                System.out.println("Enter the length of the first side:");
                num1 = input.nextInt();
                System.out.println("Enter the length of the second side:");
                num2 = input.nextInt(); 
                System.out.println("Enter the length of the third side:");
                num3 = input.nextInt(); 
                System.out.println("The perimeter is " + perimeterAndOut(num1,num2,num3) ); // Outputs the perimeter
                System.out.println("");
            }
            else if (option==4) {
                System.out.println("Enter the length of the base:");
                num1 = input.nextInt();
                System.out.println("Enter the height:");
                num2 = input.nextInt(); 
                System.out.println("The area is " + areaAndOut(num1,num2) ); // Outputs the area
                System.out.println("");
            }
            else if (option==5) {
                System.out.println("Enter the length of the base:");
                num1 = input.nextInt();
                System.out.println("Enter the height:");
                num2 = input.nextInt(); 
                System.out.println("The volume is " + volumeAndOut(num1,num2) ); // Outputs the volume
                System.out.println("");
            }
        } while(option!=6);
            System.out.println("You have chosen to exit, goodbye!");
            System.out.println("Date: " + DATE);
            System.out.println("");
    } 
    
    public static int addAndOut (int n1, int n2){ // Subroutine declaration for sum
        int sum = n1 + n2;
        
        return sum;
    }
    
    public static int multAndOut (int n1, int n2){ // Subroutine declaration for product
        int product = n1 * n2;
        
        return product;
    }
    public static int perimeterAndOut (int n1, int n2, int n3){ // Subroutine declaration for perimeter
        int perimeter = n1 + n2 + n3;
        
        return perimeter;
    }
    public static int areaAndOut (int n1, int n2){ // Subroutine declaration for area
        int area = (n1 * n2) / 2;
        
        return area;
    }
    public static int volumeAndOut (int n1, int n2){ // Subroutine declaration for volume
        int volume = ((n1 * n1) * n2) / 3;
        
        return volume;
    }
}
