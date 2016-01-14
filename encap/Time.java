
import java.lang.*;
public class Time {


public Time(int k,int m){

}

//Time a = new Time(3,15); 
//Time b = a;



private int hour;
public int minute = 1;
private int second; //  waarom gaat dit goed in displayTime()??
//private char ery = "error"

public void displayTime() {
System.out.println("The time is: " + hour + ":" + minute + ":" + second);
}
public void setHour(int h){
System.out.println("1");
if (h >12){
System.out.println("2");
throw new IllegalArgumentException("input is invalid");
}
//if (h <12){
hour = h;
//}
//else {
//hour = 31337;
//ery = hour;
//}
}
public int getHour() {
return hour;
}

}

