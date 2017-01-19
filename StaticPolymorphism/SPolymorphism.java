import java.util.Scanner;

public class SPolymorphism {

	public void method(int a) {
		System.out.println("Hi !");
	}

	public void method(int a, int b){
		System.out.println("Idrees");
	}

	public void method(float a) {
		System.out.println("Here");
	}

	public static void main(String[] args) {

		SPolymorphism poly = new SPolymorphism();
		poly.method(50);
		poly.method(23,41);
		poly.method(1.4f);
	}
}
