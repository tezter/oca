public class BookNullPointer {
	private String title; //instance reference variable
	public String getTitle() {
		return title;
	}
	public static void main(String[] args) {
		BookNullPointer b = new BookNullPointer();
		String s = b.getTitle(); //compiles and runs
		String t = s.toLowerCase(); //runtime exception!
		
	}
}
