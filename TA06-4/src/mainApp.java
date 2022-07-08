import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		int num = sc.nextInt();
		sc.close();
		numFactorial(num);
	}
	
	public static void numFactorial(int num) {
		int factorial = 1;
		for(int i = num; i>0;i--) { //Se hacce un for del revés para poder multiplicarlos todos hasta su número
			factorial*=i; //Se multiplica y se guarda el factorial por un número menor
		}
		System.out.println("El factorial es: "+factorial);
	}
}
