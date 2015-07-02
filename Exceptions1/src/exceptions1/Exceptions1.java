package exceptions1;

import java.io.File;
import java.io.FileReader;
public class Exceptions1 {

   public static void main(String[] args) {

      File file = new File("text.txt");

      try{
         FileReader fr = new FIleReader(file);
      }

      catch(FileNotFoundException e ) {

         e.printStackTrace();
      }
   }
}
