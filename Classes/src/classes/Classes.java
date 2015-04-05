package classes;

class Person {

   String name;
   int    age;

   void speak () {

      System.out.println("My name is " + name + " and I am " + age + " years old!");
   }

   void sayHello () {

      System.out.println("Hello, I'm " + name);
   }

   int calculateYearsLeftToRetirement () {

      int yearsLeft = 65 - age;

      return yearsLeft;
   }

   int getAge () {

      return age;
   }

   String getName () {

      return name;
   }
}

public class Classes {

   public static void main(String[] args) {
   
      Person person1 = new Person();

      person1.name = "Marcin";
      person1.age  = 25;

      person1.sayHello();
      person1.speak();

      int years = person1.calculateYearsLeftToRetirement();
      System.out.println(years);

      int age = person1.getAge();
      System.out.println(age);

      String name = person1.getName();
      System.out.println(name);
   }
}