import java.util.Scanner;
import java.util.HashMap;

public class Diccionario {
	
	HashMap<String, String> diccionario = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	
	public Diccionario() {
		diccionario.put("agua", "water");
		diccionario.put("sol", "sun");
		diccionario.put("jugar", "play");
		diccionario.put("computadora", "computer");
		diccionario.put("agarrar", "take");
		diccionario.put("manejar", "drive");
		diccionario.put("felicidad", "hapiness");
		diccionario.put("corage", "braveness");
		diccionario.put("taza", "mug");
		diccionario.put("lapiz", "pencil");
		diccionario.put("cama", "bed");
		diccionario.put("fuego", "fire");
		diccionario.put("tierra", "earth");
		diccionario.put("plato", "dish");
		diccionario.put("manguera", "hose");
		diccionario.put("caballo", "horse");
		diccionario.put("zapato", "shoe");
		diccionario.put("tacon", "heel");
		diccionario.put("lamer", "lick");
		diccionario.put("paleta", "lolipop");
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		
		System.out.println(diccionario);
	}
	
	public String solicitarPalabra () {
		System.out.println("Introduzca la palabra en español que desea buscar: ");
		String palabra = scanner.nextLine();
		return palabra;
	}
	
	public String buscarPalabra (String palabra) {
		if(diccionario.containsKey(palabra)) {
			String encontrada = diccionario.get(palabra);
			return encontrada;
			
		} else {
			return "";
		}
	}
	
	public void mostrarResultado (String palabra, String resultado) {
		if(resultado.isEmpty()) {
			System.out.println("La palabra no se encuentra en el diccionario");
		} else {
			System.out.println("La traducción de la palabra "+palabra+" es: "+resultado);
		}
		
	}
	
	
	
}