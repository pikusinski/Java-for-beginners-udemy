package interfaces;

public class Interfaces {

   public static void main(String[] args) {

      Machine mac1 = new Machine();
      mac1.start();

      Person person1 = new Person("Gunilla Gunnarsdotter");
      person1.greet();
   }

   Info info = new Machine();
   info.showInfo();

   Info info2 = person1;
   info2.showInfo;
}