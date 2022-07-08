import java.util.Scanner;

public class mainApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos euros quieres cambiar?");
		double dinero = sc.nextDouble();
		System.out.println("¿A qué divisa quieres cambiarlos?(dolares, yenes, libras)");
		String divisa = sc.next();
		sc.close();
		
		cambioDivisa(dinero,divisa);
		
	}
	
	public static void cambioDivisa(double dinero, String divisa) {
		double dineroTotal = 0;
		switch(divisa.toLowerCase()) {
		case "libras":
			dineroTotal = dinero * 0.86;
			System.out.println("Con el cambio se queda en: "+dineroTotal+" libras.");
			break;
		case "dolares":
			dineroTotal = dinero * 1.28611;
			System.out.println("Con el cambio se queda en: "+dineroTotal+" dolares.");
			break;
		case "yenes":
			dineroTotal = dinero * 129.852;
			System.out.println("Con el cambio se queda en: "+dineroTotal+" yenes.");
			break;
		default:
			System.out.println("No has introducido una divisa correcta.");
	}
		
		
		
	}
}
