package methodparameters;

class Robot{

   public void speak (String speech) {

      System.out.println(speech);
   }

   public void jump (int height) {

      System.out.println("I jumped " + height + " meters in the air");
   }

   public void move (String direction, double distance) {

      System.out.println("moving " + distance + " meters in direction " + direction);
   }

}

public class MethodParameters {

   public static void main(String[] args) {

      String greeting = "Hello there humanz";
      Robot robot1 = new Robot();

      robot1.speak("Hi, I am a robot!");
      robot1.jump(20);
      robot1.move("West", 12.2);

      robot1.speak(greeting);

   }
}