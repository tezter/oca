class InDec {
	static int players = 0;
		public static void main(String[] args) {
			System.out.println("players online: " +players++); // 0
			System.out.println("The value of players is " +players); // 1
			System.out.println("The value of players is now " + ++players); // 2
	}
}
