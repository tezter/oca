class StringTest {
	public static void main(String[] args) {
		String x = "Java";
		String y = x;

		System.out.println(y); //Java
		x = x + "Rules";
		System.out.println(y); //Java
		System.out.println(x); // Java Rules
	}
}
