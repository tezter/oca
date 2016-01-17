public class ABTester {
public static void main(String[] args) {
A a = new A();
a.makeA();

A ab = new B();
ab.makeA();

A c = new B();
if(c instanceof B) {
((B)c).makeB();
}
A d = new B();
if(d instanceof B) {
B babe = (B) d;
babe.makeB();
}
}
}
