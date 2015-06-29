package upcastingdowncasting;

class Machine {

   public void start () {

      System.out.println("Machine started");
   }
}

class Camera extends Machine {

   public void start () {

      System.out.println("Canera started");
   }

   public void snap () {

      System.out.println("Photo Taken");
   }
}

public class UpcastingDowncasting {

   public static void main(String[] args) {

      Machine machine1 = new Machine();

      Camera camera1 = new Camera();

      machine1.start();

      camera1.start();
      camera1.snap();

      //UPCASTING=========
      Machine machine2 = camera1;
      machine2.start();
      //Error
      //  machine2.snap();
      //Type does not let us use camera methods, although we're referring to a camera

      //Downcasting
      Machine machine3 = new Camera();
      Camera camera2 = (Camera)machine3;

      camera2.snap();
      camera2.start();

      Machine machine4 = new Machine();

      //No can do. RUntime error
      //Camera camera3 = (Camera)machine4;
      //camera3.start();

      //Note, can't downcast to unrelated types.
   }
}
