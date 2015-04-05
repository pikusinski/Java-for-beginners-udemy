package arrays;

public class Arrays {

   public static void main(String[] args) {
      
      int value 	= 7;
      int[] values;

      values = new int[3];

      System.out.println(values[0]);

      values[0] = 10;
      values[1] = 20;
      values[2] = values[0] + values[1];

      System.out.println(values[0] + " + " + values[1] + " Equals to:\n" + values[2]);

      System.out.println("The values of the array are");

      for(int intCounter = 0; intCounter < values.length; intCounter++){

      	System.out.println("--> " + values[intCounter]);
      }

      int[] numbers = {2,4,6,7,2,1,3,6,1,6,2,3,6,2,4,5,6,2,6,2};
      int   counter = 0;

      System.out.println("Random array values are: ");

      for(int numbersIndex = 0; numbersIndex < numbers.length; numbersIndex++){

      	System.out.println("--> " + numbers[numbersIndex]);
      	counter += numbers[numbersIndex];
      }

      System.out.println("THe random numbers array sum is: " + counter);
   }
}
