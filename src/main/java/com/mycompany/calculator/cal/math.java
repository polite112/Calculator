package com.mycompany.calculator.cal;
import java.util.Scanner;
/**
 *
 * @author PfumelaNtsena
 */
public class math {
    public static void main(String args[]){
        int number1;
        int number2;
        int answer;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number 1");
        number1 = scan.nextInt();
        
        System.out.println("Enter number 2");
        number2 = scan.nextInt();
        
        System.out.println("Calculated answers:");
        
        answer = number1 + number2;
        System.out.println("Addition " + answer);
        answer = number1 - number2;
        System.out.println("Subtraction " + answer);
        answer = number1 * number2;
        System.out.println("Multiplication " + answer);
        answer = number1 / number2;
        System.out.println("Division "+ answer);
    }
}
