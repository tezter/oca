class Foo {
	static int size = 7;
	static void changeIt(int size) {
	size = size + 200;
	System.out.println("size in changeIt() = " +size);//207
}
	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("size = " + size);//7
		changeIt(size);
		System.out.println("size after changeIt() = " +size);//7
	}
}
