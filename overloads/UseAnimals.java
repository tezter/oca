class UseAnimals {
	public void doStuff(Animal a) {
		System.out.println("In the Animal Version");
}
	public void doStuff(Horse h) {
		System.out.println("In the Horse Version");
}
	public static void main(String[] args) {
		UseAnimals ua = new UseAnimals();
		Animal a = new Animal();
		Horse h = new Horse();
		Animal ah = new Horse();
		ua.doStuff(a);
		ua.doStuff(h);
		ua.doStuff(ah);
}
}
