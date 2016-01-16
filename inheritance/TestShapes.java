class TestShapes {
    public static void main(String[] args) {
      PlayerPiece shapez = new PlayerPiece();
      GameShape shapecast = new PlayerPiece(); 
      testI ti = new testI();
      ti.animate();
      shapez.displayShape();
      shapez.movePiece();
      shapez.animate();
      ((PlayerPiece)shapecast).movePiece(); //casting
//shapecast.movePiece(); //gaat niet werken, moviePiece method bestaat niet in GameShape class

     PlayerPiece player = new PlayerPiece();
     TilePiece tile = new TilePiece();
     doShapes(player);
     doShapes(tile);
     doPieces(player);
//doTiles(); //waarom werkt  dit niet
tile.movePiece(); //waarom werkt dit niet?? tile extendde PlayerPiece niet, maar GameShape
     tile.getAdjacent();
doPieces(tile);
doTiles(tile);
}
    public static void doShapes(GameShape shape) {
     shape.displayShape();
}
    public static void doPieces(PlayerPiece piece) {
      piece.movePiece();
      piece.displayShape();
//tile.movePiece(); //werkt niet want static method
}
    public static void doTiles(TilePiece tiles) {
tiles.displayShape();
tiles.movePiece();
}
}
