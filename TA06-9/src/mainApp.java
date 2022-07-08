import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De qué tamaño quieres el array?");
		int num = sc.nextInt();
		sc.close();
		
		int array[] = rellenarArray(num,9,0);
		imprimirArray(array);
		
	}
	
	public static int[] rellenarArray(int num,int max,int min) {
		
		int array[] = new int[num];
		for(int i =0;i<array.length;i++) {
			array[i] = ((int) (Math.random()*(max)+min)); //Se rellena con números random
		}
		
		return array;
	}
	
	public static void imprimirArray(int array[]) {
		int total = 0;
		for(int i = 0; i < array.length;i++) {
			System.out.println("Posición "+i+": "+array[i]);
			total += array[i]; //Se suma cada número de la posición del array
		}
		System.out.println("La suma de todos los valores es de: "+total);
	}
}
