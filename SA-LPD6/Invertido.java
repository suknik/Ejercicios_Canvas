import java.util.*;

public class Invertido {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder cadena = new StringBuilder();
		
		System.out.println("Ingrese una cadena de texto para ser invertida");
		String entrada = scanner.nextLine();
		cadena.append(entrada);
		cadena.reverse();
		System.out.println("La cadena invertida es: ");
		System.out.println(cadena);
	}
}