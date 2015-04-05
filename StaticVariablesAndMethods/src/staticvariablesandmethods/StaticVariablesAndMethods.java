package staticvariablesandmethods;

class Thing {

   public String name;
   public static String description;

   public void showName () {

      System.out.println(name);
   }

   public static void showInfo () {

      System.out.println(description);
   }
}

public class StaticVariablesAndMethods {

   public static void main(String[] args) {

      Thing.description = "I am a thing";
      Thing thing1 = new Thing();
      Thing thing2 = new Thing();

      thing1.name = "bob";
      thing2.name = "!bob";

      thing1.showName();
      thing2.showName();
      Thing.showInfo();
   }
}
