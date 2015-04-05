package publicprivateprotected;

public class Plant {

   public String name;
   public final static int ID = 2;

   private String type;
   protected String size;

   public Plant() {

      this.name = "Gary";
      this.type = "Tree";
      this.size = "Big as hell";
   }


}