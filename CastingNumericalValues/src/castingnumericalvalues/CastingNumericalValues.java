package castingnumericalvalues;

public class CastingNumericalValues {

   public static void main(String[] args) {

      byte byteValue = 27;
      int value = 888;
      short shortValue = 55;
      long longValue = 3728;
      float floatValue = 38.9f;
      float floatValue = (float)99.3;
      double doubleValue = 3882.232311;

      System.out.println(Byte.MAX_VALUE);

      intValue = (int)longValue;
      doubleValue = intValue;

      System.out.println(doubleValue);

      intValue = (int)floatValue;

      System.out.println(intValue);


      //Produces strange result
      //128 is to big for a byte
      byteValue = (byte)128;
      System.out.println(byteValue);
   }
}
