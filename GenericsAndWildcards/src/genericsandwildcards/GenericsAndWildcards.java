package genericsandwildcards;

import java.util.ArrayList;

class Machine {

   @Override
   public String toString() {

      return "I am a machine!";
   }
}

class Camera extends Machine {

   @Override
   public String toString() {

      return "I am a Camera!";
   }

   public void start() {

      System.out.println("Machine starting...");
   }

}

public class GenericsAndWildcards {

   public static void main(String[] args) {

      ArrayList<String> list = new ArrayList<String>();

      list.add("one");
      list.add("Two");
      list.add("Three");
      showList(list);

      ArrayList<Machine> mList = new ArrayList<Machine>();

      mList.add(new Machine());
      mList.add(new Machine());

      showMachineList(mList);

       ArrayList<Camera> cList = new ArrayList<Camera>();

      cList.add(new Camera());
      cList.add(new Camera());

      showCameraList(cList);

      showAnyList(cList);
      showAnyList(mList);
   }

   public static void showList (ArrayList<String> list) {

      for(String value: list){

         System.out.println(value);
      }
   }

   public static void showMachineList (ArrayList<Machine> mList) {

      for(Machine value: mList) {

         System.out.println(value);
      }
   }

   public static void showCameraList (ArrayList<Camera> cList) {

      for(Camera value: cList) {

         System.out.println(value);
      }
   }

   public static void showAnyList (ArrayList<?> someList) {

      for(Object value: someList) {

         System.out.println(value);
      }
   }
}
