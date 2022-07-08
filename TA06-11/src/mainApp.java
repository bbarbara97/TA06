import java.util.Arrays;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rellenarArray();
	}
	
	public static void rellenarArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De qué tamaño quieres que sea el array?");
		int array[] = new int[sc.nextInt()];
		sc.close();
			
		
		for(int i = 0; i < array.length; i++) {
			int num = ((int) (Math.random()*(300)+1)); //Creamos un número random de 300 entre 1 y lo añadimos a la posición del array
			array[i] = num;
			
		}
		
		int array2[] = Arrays.copyOf(array, array.length); //Copiamos el array2 del array1
		
		
		for(int i = 0; i < array.length; i++) {
			int num = ((int) (Math.random()*(300)+1)); //Creamos un número random de 300 entre 1 y lo añadimos a la posición del array
			array2[i] = num;
		}
		
		int total[] = multiplicaArray(array,array2);
		for(int i = 0; i < total.length; i++) {
			System.out.println("Multiplicación de la posición "+i+": "+ total[i]);
		}
		imprimirArray(array,array2);
	}
	
	
	public static int[] multiplicaArray(int array1[], int array2[]) {
		int total[] = new int[array1.length];
		
		for(int i = 0; i < total.length; i++) {
			total[i] = array1[i] * array2[i]; //Se guarda en el nuevo array la multiplicación de la misma posición de los 2 array
		}
		
		return total;
		
	}
	
	public static void imprimirArray(int array1[], int array2[]) {
		
		System.out.println("Array 1: ");
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Array 2: ");
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
	

}
