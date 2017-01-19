import java.util.Scanner;

public class DPolymorphism {

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

		DPolymorphism poly = new DPolymorphism();
		poly.method(50);
		poly.method(23,41);
		poly.method(1.4f);
	}
}