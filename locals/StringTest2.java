class StringTest2 {
	public static void main(String[] args) {
		String s = "Fred";
		String t = s; //t and s refer to the same String object
		System.out.println(t); //Fred
		t.toUpperCase(); //brand new String object is created because modify
	}
}
