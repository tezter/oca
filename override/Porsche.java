//import java.util.io.*;
class Porsche extends Car {
public void start(){
System.out.println("start Porsche");
}
public static void main(String[] args) //throws Exception{
Car a = new Car();
Car c = new Porsche();
Porsche p = new Porsche();
//try{
a.start(); // start Super
c.start(); //ok, start sub, override
//}catch(Exception e){

//}
p.start(); //ok, start sub
}
}
