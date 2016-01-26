import java.util.Date;
public class GarbageFactory {
	public static void main(String[] args) {
		Date d = getDate();
		deComplicatedStuff();
		System.out.println("d = " +d);
	}

public static Date getDate() {
	Date d2 = new Date();
 	StringBuffer now = new StringBuffer(d2.toString());
	System.out.println(now);
	}
}
