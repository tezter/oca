class InstanceTest {
	public static void main(String[] args) {
		String a = null;
		boolean b = null instanceof String;
		boolean c = a instanceof String;
		System.out.println(b + " " + c); //prints false false
	}
}
