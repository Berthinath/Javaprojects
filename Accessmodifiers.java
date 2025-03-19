package Day3;

class student{
	public String name="Ansa";
	private int age=20;
	protected String grade="A";
	String school= "ABC school";
	
	public void display() {
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Grade:"+grade);
		System.out.println("school:" +school);
		
	}
}

public class Accessmodifiers {
	public static void main(String[] args) {
		student s1=new student();
		s1.display();
		
		
	}
}
