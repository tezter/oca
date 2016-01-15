import java.lang.*;

public class Time {
   private int hour;
   private int minute;
   private int second;

   public void setTime(int h, int m, int s) {
      this.hour = h;
      this.minute = minute;
      this.second = s;
      displayTime();
   }

   public void setTime(int h, int m) {
      this.hour = h;
      this.minute = m;
      this.second = 0;
      displayTime();
   }

   public void displayTime() {
      System.out.println("The time is: " + hour + ":" + minute + ":" + second);
   }

   public void setHour(int h) {
//      hour = h;
      System.out.println("1");
      if (h >12){
         System.out.println("2");
         throw new IllegalArgumentException("input is invalid");
      }
      hour = h;
   }

   public int getHour() {
      return hour;
   }
}
