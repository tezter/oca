class Dog extends Animal{

   protected void move(){ //less restrictive than the overriden method
   super.move();// run the superclass version of the method, 
                  //and then come back down here and finish with my subclass additional method code.    
   System.out.println("Dogs can walk and run");
   }
   public void bark(){
      System.out.println("Dogs can bark");
   }
}
