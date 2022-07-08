import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		
		int array[] = rellenarArray();
		imprimirArray(array);
	}
	
	
	
	
	public static int[] rellenarArray() {
		Scanner sc = new Scanner(System.in);
		int array[]= new int[10];
		for(int i =0;i<array.length;i++) {
			System.out.println("Escribe un número para la posición: "+i);
			array[i] = sc.nextInt(); //Se escribe un número para cada posición por teclado
		}
		sc.close();
		
		return array;
	}
	
	public static void imprimirArray(int array[]) {
		for(int i = 0; i < array.length;i++) {
			System.out.println("Posición "+i+": "+array[i]);
		}
	}
}
