package readingfilesusingscanner;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadingFilesUsingScanner {

   public static void main(String[] args) throws FileNotFoundException{

      String fileName = "C:/Users/Makos1/Desktop/example.txt";

      File textFile = new File(fileName);

      Scanner in = new Scanner(textFile);

      while(in.hasNextLine()) {

         String line = in.nextLine();
         System.out.println(line);
      }
      in.close();
   }
}
