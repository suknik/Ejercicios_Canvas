public class displayDiccionario {
	public static void main(String argas[]) {
		Diccionario diccionario = new Diccionario();
		
		String palabra = diccionario.solicitarPalabra();
		String resultado = diccionario.buscarPalabra(palabra);
		diccionario.mostrarResultado(palabra, resultado);
	}
}