class RefTest {
//static int a = 1; //moet static zijn als je  vanuit static method wil benaderen
	public static void main(String[] args) {
		int a = 1;
		RefTest rt = new RefTest();
		System.out.println("a = " +a); //1
		rt.modify(a);
		System.out.println("a = " +a); //1
	}
	void modify(int number) {
		number = number + 1;
		System.out.println("number = " +number); //2
	}
}
