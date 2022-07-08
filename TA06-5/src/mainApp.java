import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		int num = sc.nextInt();
		sc.close();
		numBinario(num);
	}
	
	public static void numBinario(int num) {
		String bin = "";
		
		while(num >0) {
			if(num%2 == 0) {
				bin = "0"+ bin;
			} else {
				bin = "1" + bin;
			}
			num = num/2;
		}
		System.out.println("El número en binario es: "+bin);
	}
}
