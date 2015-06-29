package encapsulation.and.api.docs;

class Plant {

   private String name;
   public static final int ID = 7;

   public String getName () {

      return name;
   }

    public void setName (String name){

      this.name = name;
   }

   public String getData () {

      return "some data" + calculateGrowthForecast();
   }

   public int calculateGrowthForecast () {

      return 9;
   }
}

public class EncapsulationAndAPIDocs {

   public static void main(String[] args) {

   }
}
