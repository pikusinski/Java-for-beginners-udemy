package tostring;

class Frog {

   private String name;
   private int id;


   public Frog (int id, String name) {

      this.id = id;
      this.name = name;
   }
   //This can create a string representation for the object. think debugging 
   public String toString () {

      StringBuilder str = new StringBuilder();

      str.append("ID of frog: ");
      str.append(id);
      str.append("\nName of frog: ");
      str.append(name);
      
      return str.toString();
   }

}

public class ToString {

   public static void main(String[] args) {

      Frog frog1 = new Frog(7, "Marcin");

      System.out.println(frog1);

   }
}