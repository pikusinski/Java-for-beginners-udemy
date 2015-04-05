package settersandthis;

class Frog {

   private String name;
   private int age;

   public String getName () {

      return name;
   }

   public int getAge () {

      return age;
   }

   public void setName (String name) {

      this.name = name;
   }

   public void setAge (int age) {

      this.age = age;
   }
}

public class SettersAndThis {

   public static void main(String[] args) {

      Frog frog1 = new Frog();

      frog1.setName("Bertie");
      frog1.setAge(2);

      System.out.println(frog1.getName() + "\n" + frog1.getAge());
   }
}
