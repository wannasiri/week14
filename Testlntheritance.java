package week14;

class dog {
	String name;
	String Breed;
	public void eat(String l) {
		 System.out.println("dog eat food:" +l);
		 
	}
}
public class Testlntheritance {
	String name;
	public Testlntheritance(String c) {
		String color;
		 System.out.println("Color:" +c);
		
	}
	 public static void main(String[]args) {
		
		 Testlntheritance tes1 =new Testlntheritance("red");
		 tes1.eat();
		 dog d1 = new dog();
		d1.eat("Fish");
		eat();
		eat("Luca");
	 }
	 static void eat() {
		 System.out.println("Test Testlntheritance");
		 }
	 static void eat(String n) {
		 System.out.println("Name:" +n);
	 }
	 class Animal{
	String color;
	public void eat() {}
	
		
	}
}
