import java.lang.*;

public class Tester {

public static void main(String[] args) {

Time time = new Time(3,15);
//Time time = new Time();
//int hour;
try{
time.setHour(13);
}catch(Exception e){
 System.out.println("translated naar normale taal : invalid input");
}
//hour = time.getHour();
//System.out.println(hour);
time.displayTime(); //  roept method aan
System.out.println(time.getHour());
}
}
