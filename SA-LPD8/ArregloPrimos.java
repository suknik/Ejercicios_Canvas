import java.util.Scanner;
import java.util.ArrayList;

public class ArregloPrimos {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> numeros = new ArrayList<>();
	
	public void recibirDatos () {
		System.out.println("Por favor ingrese 10 números separados por ',' y sin espacios");
		String numerosIn = scanner.nextLine();
	
		String numerosArreglo[] = numerosIn.split(",");
		parsearYAsignar(numerosArreglo);
		ordenarPrimos();
	}
	
	public void parsearYAsignar (String[] numerosIn){
		for(int i = 0; i<numerosIn.length; i++) {
			numeros.add(Integer.parseInt(numerosIn[i]));
		}
	}
	
	public void mostrarArray () {
		for(int i = 0; i<numeros.size(); i++){
			System.out.println(i +" - "+numeros.get(i));
		}
	}
	
	public boolean isPrime (int numero) {
		int divisores = 1;
		for(int i = 1; i<=numero; i++){
			if(divisores > 2){
				return false;
			}
			if(numero % i == 0){
				divisores++;
			} 
		}
		return true;
	}
	
	
	
	public void ordenarPrimos () {
		
		 ArrayList<Integer> auxNumbers = (ArrayList<Integer>) numeros.clone();
		
		numeros.forEach((numero) -> {
			boolean prime = isPrime(numero);
			if(prime) {
				int number = numero;
				auxNumbers.remove(numero);
				auxNumbers.add(0, number);
			}
		});
		numeros = (ArrayList<Integer>) auxNumbers.clone();
		
		mostrarArray();
	}
	
	
	public static void prueba () {
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 0; i<=10; i++){
			numeros.add(0, i);
		}
		System.out.println(numeros);
	}
}