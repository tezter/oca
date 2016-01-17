class CastTest1 {
	public static void main(String[] args) {
		Animal a = new Dog();
	if(a instanceof Dog) {
		((Dog)a).playDead(); }
// of, beide zijn hetzelfde, playDead zit alleen in subclass Dog, direct a.playDead werkt dus niet!!!
	if(a instanceof Dog){
		Dog c = (Dog) a;
		c.playDead(); }
}
}
