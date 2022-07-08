import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De qué figura quieres calcular el área? (Circulo, triangulo o cuadrado)");
		String figura = sc.nextLine();
		
		switch(figura.toLowerCase()) {
		case "circulo":
			System.out.println("¿Cuál es el radio del circulo?");
			double radio = sc.nextDouble();
			calcularCirculo(radio);
			break;
		case "triangulo":
			System.out.println("¿Cuál es la base del triangulo?");
			double base = sc.nextDouble();
			System.out.println("¿Cuál es la altura del triangulo?");
			double altura = sc.nextDouble();
			calcularTriangulo(base,altura);
			break;
		case "cuadrado":
			System.out.println("¿Cuál es el lado del cuadrado?");
			double lado = sc.nextDouble();
			calcularCuadrado(lado);
			break;
		default:
			System.out.println("No has introducido una figura correcta.");
	}
		sc.close();
		
	}
	
	
	public static void calcularCirculo(double radio) {
		final double PI = 3.1416;
		double resultado = PI*(Math.pow(radio, 2));
		System.out.println("El área del circulo es de: "+resultado);
	}
	
	public static void calcularTriangulo(double base, double altura) {
		double resultado = (base * altura)/2;
		System.out.println("El área del triangulo es de: "+resultado);
	}
	
	public static void calcularCuadrado(double lado) {
		double resultado = lado * lado;
		System.out.println("El área del cuadrado es de: "+resultado);
	}
}
