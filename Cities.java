import java.util.*;
public class Cities {
	public static void main(String[] args) {

		List<String> c = new ArrayList<String>(); //creates an ArrayList, c
		c.add("Oslo");	//add original cities
		c.add("Paris");
		c.add("Rome");
		int index = c.indexOf("Paris"); //find Paris index
		System.out.println(c + " " + index); //[Oslo, Paris, Rome] 1
		c.add(index, "London"); //add London before Paris
		System.out.println(c); //[Oslo, London, Paris, Rome]
		c.remove(index); //Remove London
		System.out.println(c);
	}
}
