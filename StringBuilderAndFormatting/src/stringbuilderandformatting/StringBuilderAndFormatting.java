package stringbuilderandformatting;

public class StringBuilderAndFormatting {

   public static void main(String[] args) {

      String info = "";

      //Inefficient because we create new strings all the time!

      info += "My name is Marcin";

      info += " ";

      info += "I am a front-end web developer";

      System.out.println(info);

      StringBuilder stringBuilder = new StringBuilder("");

      stringBuilder.append("My name is still Marcin");
      stringBuilder.append(" ");
      stringBuilder.append("I am still a front-end web developer");

      System.out.println(stringBuilder.toString());

      StringBuilder strB = new StringBuilder("");

      strB.append("I am a goat")
      .append(" ")
      .append("and I love cans!");

      System.out.println(strB.toString());

      ///////Formatting Strings

      System.out.println("Here is some text\t That was a tab \nThat was a new line");

      System.out.printf("Total cost %-10d; quantity is %d \n", 20, 3931);

      for (int i = 0; i < 10; i++){

         System.out.printf("Hello %5d, %s %.3f\n", i, "Here is some text", 2.44);
      }
   }
}
