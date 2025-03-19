package Day3;
import java.util.*;
class  Hotel{
	String Item ="Pizza";
	int price=250;
	String Quantity ="2";
	 
	void displayData() {
		System.out.println("Item name is:"+Item);
		System.out.println("price is:"+price);
		System.out.println("Quantity is:"+Quantity);
	}
}
public class Exercise {
public static void main(String[] args) {
	Hotel h1= new Hotel();
	h1.displayData();
	
	

}

}