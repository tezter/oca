class Char {
	public static void main(String[] args) {
		char a = 0x892;           //hexadecimal literal
  		char b = 982;               //int literal
		char c = (char)70000;   //cast is required; 70000 is out of char range
		char d = (char) -98;    //legal

		System.out.println("0x892 :" +a);
		System.out.println("982 :" +b);
		System.out.println("(char)70000 :" +c);
		System.out.println("(char) -98 :" +a);

	}
}
