class Dog {
	public static void main(String[] args) {
		Dog[] myDogs = new Dog[6]; //creates an arrau pf 6 Dog references
		for(int x = 0; x < myDogs.length; x++) {
			myDogs[x] = new Dog(); //assign a new Dog to index position x
		}
	}
}
