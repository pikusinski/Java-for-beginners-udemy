package multidimensionalarrays;

public class MultidimensionalArrays {

   public static void main(String[] args) {

   	int[] oneDimentionalArray = {1,3,5,2};

   	int[][] twoDimensionalArray = {
   		{1, 3, 5, 2},
   		{1, 2, 4, 6, 8, 55, 3}
   	};

   	for(int arrayIndex = 0; arrayIndex < twoDimensionalArray.length; arrayIndex++){

   		for(int valueIndex = 0; valueIndex < twoDimensionalArray[arrayIndex].length; valueIndex++){

   			System.out.println(twoDimensionalArray[arrayIndex][valueIndex]);
   		}
   	}
 
   }
   
}