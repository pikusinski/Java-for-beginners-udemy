
package polymorphism;

public class Polymorphism {

   public static void main(String[] args) {

      Plant plant1 = new Plant();

      Tree tree = new Tree();

      Plant plant2 = tree;

      plant2.grow();

      tree.sheadLeaves();
      //Will not run since the variable type is "wrong",
      // plant2.sheadLeaves();

      doGrow(plant1);

   }

   public static void doGrow(Plant plant){

      plant.grow();
   }
}
