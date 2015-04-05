package interfaces;

public class Machine implements Info{

   private String name = "Steve 2000";
   private int id = 7;
   
   public void start () {

      System.out.println("Machine has been started");
   }

   @Override
   public void showInfo () {

      System.out.println("Machine ID is: " + id);
   }   
}