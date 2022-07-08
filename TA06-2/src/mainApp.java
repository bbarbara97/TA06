import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quieres generar?");
		int num = sc.nextInt();
		System.out.println("¿Cuál es el máximo para el número aleatorio?");
		int max = sc.nextInt();
		System.out.println("¿Cuál es el mínimo para el número aleatorio?");
		int min = sc.nextInt();
		sc.close();
		
		generarNumeros(num,max,min);
	}
	
	public static void generarNumeros(int num, int max, int min) {
				
		for(int i=1;i<=num;i++) {
		System.out.println("Número aleatorio "+i+": "+ ((int) (Math.random()*(max-min)+min)));
		}
	}
}
