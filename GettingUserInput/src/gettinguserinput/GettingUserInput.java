package gettinguserinput;

import java.util.Scanner;

public class GettingUserInput {

   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter any line of text here and press return: ");
    String userText = input.nextLine();

    System.out.println("Please enter a int: ");
    int userInt  = input.nextInt();

    System.out.println("Please enter a floating point number: ");
    double userFloat = input.nextDouble();

    System.out.println("You entered the string:\n" + userText);
    System.out.println("You have entered the number:\n" + userInt);
    System.out.println("You have entered the flaoting point number:\n" + userFloat);

   }   
}