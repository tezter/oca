abstract class Ball implements Bounceable {
//public void bounce(){} //omdat class abstract is hoeft er geen implementatie plaats te vinden
public void setBounceFactor(int bf){}
//void moveIt(){} //moet public zijn, omdat alle methods in een interface dat ook zijn
public void moveIt(){}
public void doSphericalThing(){}
protected abstract void lambada();
}
