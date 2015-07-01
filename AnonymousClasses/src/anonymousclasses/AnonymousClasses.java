package anonymousclasses;

class Machine {

   public void start() {

      System.out.println("starting machine ...");
   }
}

interface Plant {

   public void grow();
}

public class AnonymousClasses {

   public static void main(String[] args) {

      Machine machine1 = new Machine() {

         @Override public void start() {

            System.out.println("Oh snapping!");
         }
      };
      machine1.start();

      Plant plant1 = new Plant(){

         @Override
         public void grow() {

            System.out.println("Plant is growing");
         }
      };

      plant1.grow();
   }
}
