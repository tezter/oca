class CastTest2 {
	public static void main(String[] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal() };
		for(Animal animal :a) {
		animal.makeNoise();
		if(animal instanceof Dog) {
		//animal.playDead();
//		Dog d = (Dog) animal;
//		d.playDead();
		((Dog)animal).playDead();
}
}
}
}
