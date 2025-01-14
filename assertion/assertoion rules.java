void noReturn() { }
int aReturn() { return 1; }
void go() {
int x = 1;
boolean b = true;
// the following six are legal assert statements
assert(x == 1);
assert(b);
assert true;
assert(x == 1) : x;
assert(x == 1) : aReturn();
assert(x == 1) : new ValidAssert();
// the following six are ILLEGAL assert statements
assert(x = 1); // none of these are booleans
assert(x);
assert 0;
assert(x == 1) : ; // none of these return a value
assert(x == 1) : noReturn();
assert(x == 1) : ValidAssert va;
}


java -ea
java -enableassertions  Enable assertions.
java -da 
java -disableassertions Disable assertions (the default behavior of Java 6).
java -ea:com.foo.Bar Enable assertions in class com.foo.Bar.
java -ea:com.foo... Enable assertions in package com.foo and any of its subpackages.
java -ea -dsa Enable assertions in general, but disable assertions in system classes.
java -ea -da:com.foo... Enable assertions in general, but disable assertions in package
com.foo and any of its subpackages.