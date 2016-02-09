class GuesAnimal {
	public static void main(String[] args) {
		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colorWaveLenght = 1.630;
		if (weight >= 500) {
			animal = "elephant";
		}
	
		if (colorWaveLenght > 1.621) {
			animal = "gray " + animal;
		}

		if (sex <= 'f') {
			animal = "female" + animal;
		}

		System.out.println("The animal is a " +animal); // The animal is a gray elephant
	}
}

