//But, the following code will not compile because String is not a legal return type for 
//the getObject method in the subclass, Sub. String does not extends from either A or B.

class A {
}
class B extends A {
}

class Super {
  public A getObject() {
    System.out.println("Super::getObject");
    return new A();
  }
}

class Sub1 extends Super {
  public B getObject() {
    System.out.println("Sub::getObject");
    return new B();
  }

  public String getObject() {
    return "getObject()";
  }

  public static void main(String[] args) {
    Super s = new Sub1();
    s.getObject();
  }
}
