public class Time {

private int hour;
public int minute = 1;
private int second;

public void displayTime() {
System.out.println("The time is: " + hour + ":" + minute + ":" + second);
}
public void setHour(int h){
hour = h;
}
public int getHour() {
return hour;
}

}
