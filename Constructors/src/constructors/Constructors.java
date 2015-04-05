package constructors;

class Machine {

   private String name;
   private int code;

   public Machine () {
    
      this("hi", 20);
      System.out.println("constructor run");
      System.out.println(name);
      System.out.println(code);
   }

   public Machine (String machineName) {

      name = machineName;
      code = 404;
      System.out.println("String constructor running");
      System.out.println(name);
      System.out.println(code);
   }

   public Machine (String machineName, int machineCode) {

      name = machineName;
      code = machineCode;

      System.out.println("full constructor run");
      System.out.println(name);
      System.out.println(code);
   }
}

public class Constructors {

   public static void main(String[] args) {

      Machine defaultGusi = new Machine();
      Machine gusi = new Machine("Pikusi");
      Machine fullGusi = new Machine("Pikusinski", 1337);
   }
}
