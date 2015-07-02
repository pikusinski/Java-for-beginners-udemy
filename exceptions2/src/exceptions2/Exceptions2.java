package exceptions2;

import java.io.IOException;
import java.text.ParseException;
import java.io.FileNotFoundException;

class Test {

   public void run() throws IOException, ParseException {

      //throw new IOException();
      throw new ParseException("Error at line " ,2);
   }

   public void input() throws IOException, FileNotFoundException {


   }
}

public class Exceptions2 {

   public static void main(String[] args) {

      Test test = new Test();

      //First example
      /*try{

         test.run();
      }
      catch(IOException e){

         e.printStackTrace();
      }

      catch(ParseException e) {

         e.printStackTrace();
      }*/


      //Second example
/*      try{
         test.run();
      }

      catch(IOException | ParseException e) {

         e.printStackTrace();
      }*/

      //Third example

      try {

         test.run();
      }

      catch (Exception e) {

         e.printStackTrace();
      }
   }
}
