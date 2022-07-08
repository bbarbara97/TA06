import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= rellenarArray();
		imprimirArray(array);

	}
	
	public static void imprimirArray(int array[]) {
		int numMayor = 0;
		for(int i = 0; i < array.length;i++) {
			System.out.println("Posición "+i+": "+array[i]);
			
			if(numMayor < array[i]) {
				numMayor = array[i]; //Si el numero que hay en la variable es menor que el del array, se cambia por ese para conseguir el mayor número
			}
		}
		System.out.println("El número más grande del array es: "+numMayor);
	}
	
	public static int[] rellenarArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿De qué tamaño quieres el array?");
		int array[] = new int[sc.nextInt()];
		int i = 0;
		
		System.out.println("Escribe un número máximo aleatorio.");
		int max = sc.nextInt();
		System.out.println("Escribe un número mínimo aleatorio.");
		int min = sc.nextInt();
		sc.close();
		while(i < array.length) {
			
			int num = ((int) (Math.random()*(max)+min)); //Con el máximo y el mínimo hago un número random
			
			if(esPrimo(num)) {
				array[i] = num; //Si el número es primo se guarda en el array
				i++;
			} 		}
		return array;
			
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
