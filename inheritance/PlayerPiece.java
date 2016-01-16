class PlayerPiece extends GameShape implements Animatable {
public void movePiece () {
System.out.println("moving game piece");
}
public void animate() { //implementatie van animate(); van interface Animatable
System.out.println("animating"); 
}
}
