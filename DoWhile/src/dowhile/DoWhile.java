package dowhile;

import java.util.Scanner; 

public class DoWhile {

   public static void main(String[] args) {

   	Scanner input = new Scanner(System.in);
   	int value;

   	do{

   		System.out.println("Please enter an integer: ");
   		value = input.nextInt();
   	}

   	while(value != 5);

   	System.out.println("Got correct number of 5");
   }   
}