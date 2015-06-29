
package polymorphism;

public class Tree extends Plant {

   @Override
   public void grow() {

      System.out.println("Tree Growing");
   }

   public void sheadLeaves() {

      System.out.println("Sheading");
   }
}
