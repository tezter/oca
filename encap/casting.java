class A {

    public void printFrom(){
        System.out.println("Inside A");
    }
}
class B extends A {

    public void printFrom(){
        System.out.println("Inside B");
    }

    public void doBStuff() {}

}

class C extends A {
   public void doCStuff() {}
}

public class MainClass {

    public static void main(String []args){

        A a = new A();
	A b = new B();
        A c = new C();

        ((B)b).doBStuff();
        ((C)c).doCStuff();
//	a. //welke methode's heeft a? printFromA?
	//ik wil ook printFromB uitvoeren
//	((B)b).printFrom();
	


Wat is het verschil tussen
A a = new B();
A a = new A();

