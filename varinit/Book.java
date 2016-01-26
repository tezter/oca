public class Book {
	private String title; //instance reference variable
	public String getTitle() {
		return title;
	}
	public static void main(String[] args) {
		Book b = new Book();
		System.out.println(b.getTitle()); //output is null
	}
}
