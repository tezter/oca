public class BookRevised {
	private String title; //instance reference variable
	public String getTitle() {
		return title;
	}
	public static void main(String[] args) {
		BookRevised b = new BookRevised();
		String s = b.getTitle();
		if (s !=null) {
			String t = s.toLowerCase();
		}
	}
}
