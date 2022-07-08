import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = rellenarArray();
		imprimirArray(array);
	}
	
	
	public static int[] rellenarArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De qué tamaño quieres el array?");
		int array[] = new int[sc.nextInt()]; //Según el número puesto se hace el array de ese tamaño
		
		for(int i = 0; i < array.length; i++) {
		int num = ((int) (Math.random()*(300)+1)); //Creamos un número random de 300 entre 1 y lo añadimos a la posición del array
		array[i] = num;
		}
		
		System.out.println("¿Con qué número quieres que terminen los números a mostrar?");
		int numFinal = sc.nextInt();
		sc.close();
		int total[] = numAcabadosEn(numFinal, array); //Creamos otro array donde se llama al resultado de la función
		
		return total;
	}
	
	public static int[] numAcabadosEn(int num, int array[]) {
		int contador = 0, j = 0;
		
		for(int i = 0; i< array.length;i++) {
			
			if(array[i]%10 == num) {
				contador ++; //Hago primero un contador para saber de que tamaño será el array
			}
		}
		int total[] = new int[contador];
		for(int i = 0; i< array.length;i++) {
			if(array[i]%10 == num) {
				total[j] = array[i]; //Vuelvo a hacer otro bucle para meter en el nuevo array los números que acaben en el número indicado
				j++;
			}
		}
		return total;
	}
	
	public static void imprimirArray(int total[]) {
		System.out.println("Los números escogidos con el mismo número final escogido son:");
		for(int i = 0; i < total.length; i++) {
			System.out.println(total[i]); //Imprimir todos los números del array
		}
	}

}
