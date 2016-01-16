class Test {
public static void main(String[] args) {
Test t1 = new Test();
Test t2 = new Test();
if (!t1.equals (t2))
System.out.println("not equals");
//else
//System.out.println("else);
if (t1 instanceof Test)
System.out.println("t1 is an object");
}
}
