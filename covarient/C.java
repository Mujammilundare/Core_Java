class A { }
class B extends A { }


class C {
    A methodTest() { return new A(); }
}

class D extends C {
    A methodTest() { return new B(); }
}