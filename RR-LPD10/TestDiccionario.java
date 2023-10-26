import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class TestDiccionario extends Diccionario{
	
	ArrayList<Integer> indicesAleatorios = new ArrayList<>();
	ArrayList<String> llavesMap = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public TestDiccionario () {
		super();
		int aleatoriosRequeridos = 5;
		int tamañoDiccionario = super.diccionario.size();
		for(int i = 0; i<aleatoriosRequeridos; i++){
			int indice = (int)(Math.random()*(tamañoDiccionario-1));
			while (indicesAleatorios.contains(indice)) {
				indice = (int)(Math.random()*(tamañoDiccionario-1));
			}
			indicesAleatorios.add(indice);
		}
	}
	
	
	public void test () {
		Iterator iteratorAleatorios = indicesAleatorios.iterator();
		int puntuacion = 0;
		int preguntas = 0;
		obtenerLlavesMap();
		while(iteratorAleatorios.hasNext()) {
			int indice = (int) iteratorAleatorios.next();
			//System.out.println(iteratorAleatorios.next());
			String palabraEspañol = llavesMap.get(indice);
			System.out.println("Cuál es la traducción al inglés de la siguiente palabra? : "+"'"+palabraEspañol+"'");
			String respuesta = scanner.nextLine();
			
			if(super.diccionario.get(palabraEspañol).equals(respuesta)) {
				puntuacion++;
				System.out.println("Correcto! :D");
			} else {
				System.out.println("Incorrecto");
			}
			preguntas++;
		}
		
		System.out.println("Su puntuación final es: "+puntuacion+"/"+preguntas);
		
	}
	
	
	public void obtenerLlavesMap() {
		Iterator it = super.diccionario.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			llavesMap.add(key);
		}
	}
}