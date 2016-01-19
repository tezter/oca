class Init {
Init(String s) {System.out.println("String arg const");}
Init() { System.out.println("no-arg constructor");}
static { System.out.println("1st static initialization block");}
{ System.out.println("first instance initialization block");}
static { System.out.println("second static initialization block");}
{ System.out.println("second instance initialization block");}

public static void main(String[] args) {
new Init();
new Init("String");
new Init();
}
}
