package Day3;
class Dessert{
	String Item;
	int quantity;
	Dessert(){
		Item="Falooda";
	}
	Dessert(int quantity){
		this.quantity=quantity;
	}
	void display() {
		System.out.println("The Dessert name is "+Item);
		System.out.println("The quantity is "+quantity);
	}
}

public class Parameterizedconstructor {
	public static void main(String[] args) {
		Dessert d1=new Dessert();
		d1.display();	}

}