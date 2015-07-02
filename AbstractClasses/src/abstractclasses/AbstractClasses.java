package abstractclasses;

abstract class Machine {

   private int id;

   public int getId () {

      return id;
   }

    public void setId (int id){

      this.id = id;
   }

   public abstract void start();

}

class Camera extends Machine {

   @Override
   public void start() {

      System.out.println("Starting camera...");
   }
}

class Car extends Machine {

   public void start() {

      System.out.println("Starting car...");
   }

}

public class AbstractClasses {

   public static void main(String[] args) {

      Camera cam1 = new Camera();

      cam1.setId(5);

      Car car1 = new Car();
      car1.setId(4);

      System.out.println(cam1.getId());
   }
}
