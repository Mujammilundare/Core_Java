
class Animal { }
 class Dog extends Animal { }
 class DogTest {
       public static void main(String [] args) {
       
       Animal a = new Animal();
       Dog d = new Dog();
       
      // Every animal can't be Dog so be careful with downcasting
       // other wise it may throw ClassCastException at runtime.
       Dog d1 = a; // won't compile, as downcast needs explicit casting

      Animal a1 = d; // upcast ok with no explicit cast
       Dog d2 = (Dog) a1; // downcast needs explicit casting, works fine.

      // Animal can't EVER be a String
       String s = (String) animal; // this line won't compile
    }
 }


