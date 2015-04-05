package inheritance;

public class Car extends Machine {
   
   public void whipeWindShield(){

      System.out.println("Whiping wind shield!");
   }

   @override;
   public void start(){

      System.out.println("Car stared");
   }
}