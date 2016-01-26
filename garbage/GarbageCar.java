class GarbageCar {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("bye");
		System.out.println(s1);//hello is not eligible for collection
		s1 = s2; //redirect s1 to refer to bye
		// Now the StringBuffer "hello" is eligible for collection
		System.out.println(s1);//output is bye, not eligible for colection
	}
}
