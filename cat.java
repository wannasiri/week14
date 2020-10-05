package week14;

public class cat {
	public void Sound() {
		System.out.println("MeoW");
	}
	public static void Sound (int num) {
		for(int i=0;i<2;i++) {
			System.out.println("MeoW");
		}
		
	}
	public static void main(String[]args) {
		Sound(1);
		Sound(2);
		
	}
}
