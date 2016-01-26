class GarbageTruck {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb); //reachable, is not eligible for collection
		sb = null; //nulling reference, is eligible for collection
		System.out.println(sb); //output is null
	}
}
