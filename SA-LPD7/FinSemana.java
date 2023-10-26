import java.util.Scanner;
import java.util.ArrayList;

public class FinSemana {
	
	static ArrayList<String> diasSemana = new ArrayList<String>();
	static int completedDays;
	static final int MINUTES_TILL_FRIDAY = 6600;
	
	public static void main(String args[]) {
		
		diasSemana.add("lunes");
		diasSemana.add("martes");
		diasSemana.add("miercoles");
		diasSemana.add("jueves");
		diasSemana.add("viernes");
		
		boolean diaValido = false;
		boolean horaValida = false;
		boolean minutosValidos = false;
		
		String diaSemana;
		int horas;
		int minutos;
		
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese el día de la semana de lunes a viernes");
			diaSemana = scanner.nextLine();
			diaValido = isDiaValido(diaSemana);
			if(diaValido) {
				break;
			} else {
				System.out.println("El día introducido es incorrecto");
			}
		}
		while (diaValido == false);
		
		do{
			System.out.println("Ingrese las horas en un formate de 24hrs: ");
			horas = scanner.nextInt();
			horaValida = isHoraValida(horas);
			if(horaValida) {
				break;
			} else {
				System.out.println("Las horas introducidas son incorrectas");
			}
		}
		while(horaValida == false); 
		
		do{
			System.out.println("Ingrese los minutos");
			minutos = scanner.nextInt();
			minutosValidos = isMinutosValidos(minutos);
			if(minutosValidos) {
				break;
			} else {
				System.out.println("Los minutos introducidos son incorrectos");
			}
		}
		while(minutosValidos == false);
		
		calcularFinSemana(completedDays, horas, minutos);
		
	}
	
	public static boolean isDiaValido(String diaSemanaIn) {
		completedDays = 0;
		
		boolean diaValido = false;
		
		
		for (String diaSemana : diasSemana) {
			if(diaSemana.equals(diaSemanaIn)){
				diaValido = true;
				break;
			}
			completedDays++;
		}
		
		return diaValido;
	}
	
	
	public static boolean isHoraValida(int horasIn) {
		if(horasIn >= 0 && horasIn <= 23) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isMinutosValidos(int minutosIn) {
		if(minutosIn >= 0 && minutosIn <= 59) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int diasHoras (int dias) {
		return dias*24;
	}
	
	public static int horasMinuntos (int horas) {
		return horas*60;
	}
	
	public static void calcularFinSemana(int dias, int horas, int minutos) {
		int minutosTranscurridos = minutos + horasMinuntos(horas) + horasMinuntos(diasHoras(dias));
		int minutosRestantes = MINUTES_TILL_FRIDAY - minutosTranscurridos;
		System.out.println(minutosRestantes);
	}
}