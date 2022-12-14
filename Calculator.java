
package calculator;

import java.util.Scanner;
public class Calculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
    
        
        
        System.out.println("[A]simple interest");
        System.out.println("[B]compound interest");
        
        
        System.out.println("TYPE A IF YOU WANT SIMPLE INTEREST");
        System.out.println("TYPE B IF YOU WANT COMPOUND INTEREST");
        
        
        System.out.print("CHOOSE WHAT CALCULATOR YOU WANT: ");
        char alpha = input.next().charAt(0);
        while(Character.toUpperCase('A') != 'A' || Character.toUpperCase('B') != 'B'){
                    System.out.println("Invalid Input.");
                    System.out.print("Try Again : ");
                    alpha = input.next().charAt(0);

        }
        switch(Character.toUpperCase(alpha)){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
                
                
                
        }
        
        
        
    }
    
}
