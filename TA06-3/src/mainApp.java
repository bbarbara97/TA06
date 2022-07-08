import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		int num = sc.nextInt();
		sc.close();
		if(esPrimo(num)) {
			System.out.println("Es primo.");
		} else {
			System.out.println("No es primo.");
		}
	}
	
	public static boolean esPrimo(int num) {
		
		for(int i = 2; i < num / 2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
				return true;
	}
}
