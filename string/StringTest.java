class StringTest {
	public static void main(String[] args) {
		String s = "abc";
		String s2 = s + "def";
		System.out.println(s);
		System.out.println(s.concat(" concat"));
		System.out.println("concat without ref " +s);
		System.out.println(s.replace('a', 'X'));
		System.out.println(s2);
		System.out.println(s.toString());
	}
}
