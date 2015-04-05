package pkgswitch;

import java.util.Scanner;

public class Switch {

   public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command");
		String text = input.nextLine();

		switch(text){

			case "start": 
				
				System.out.println("Starting procedure");
				break;

			case "stop":

				System.out.println("Procedure stopped");
				break;

			default:

				System.out.println("Self destruct sequence activated. T -10 seconds");
		}
   }
}
