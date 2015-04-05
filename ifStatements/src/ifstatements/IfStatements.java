package ifstatements;

public class IfStatements {

   public static void main(String[] args) {

   	int loop = 0;

		if(2 == 4){

			System.out.println("Condition met");
		}
		else if(2 != 4){

			System.out.println("Condition is false for some stupid reason");
		}

		while(loop < 5){

			System.out.println("Looping: " + loop);

			if(loop == 5){

				break;
			}

			loop++;
			System.out.println("Running");
		}
   }
}