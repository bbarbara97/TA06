import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		sc.close();
		if(num>0) {
		numCifras(num);
		} else {
			System.out.println("Tiene que ser un número positivo.");
		}
	}
	
	public static void numCifras(int num) {
		int cifra = 0;
		while(num != 0) {
			num = num/10; //Se divide entre 10 para contar cada cifra
			cifra++;
		}
		System.out.println("El número tiene "+cifra+" cifras.");
		
	}
}
