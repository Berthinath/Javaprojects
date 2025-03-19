package Day3;
import java.util.*;
class Student{
	String name="Ansa";
	int rollNum=06;
	String dept="CS";
	
	void displayData() {
		System.out.println("My Name is: "+name);
		System.out.println("Roll Number:"+rollNum);
		System.out.println("Department:"+dept);
		}
	}
public class OOPS {
public static void main(String[] args) {
	Student s1=new Student();
	s1.displayData();
}
}