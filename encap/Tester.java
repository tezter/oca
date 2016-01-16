import java.lang.*;

public class Tester {

public static void main(String[] args) {

Time time = new Time();
//Time time = new Time();
//int hour;
//time.setTime(13, 24, 18);
//time.setTime(14, 15);

try{
time.setHour(12);
}catch(Exception e){
 System.out.println("translated naar normale taal : invalid input");
}
//hour = time.getHour();
//System.out.println(hour);
time.setMinute(34);
time.displayTime(); //  roept method aan
System.out.println(time.getHour());
//time.setMinute(33);
System.out.println(time.getMinute());
}
}
