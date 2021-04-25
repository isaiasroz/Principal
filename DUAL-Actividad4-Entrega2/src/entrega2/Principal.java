package entrega2;

import java.util.Random;
import java.util.Scanner;
/**
 * Clase Principal. Representa un array que se inicializa con n�meros aleatorios.
 * @author Isa�as
 * @version 1.1
 * @since 1.0
 */
public class Principal {
	/**
	 * M�todo main, representa el punto de acceso del sistema para la ejecuci�n del c�digo.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instancias.
		Principal p = new Principal();
		Scanner reader = new Scanner(System.in);
		// Declaración del array.
		int randomArray[];
		// Declaración de constantes.
		final int MIN = 1, MAX = 50;
		
		// Solicitud del valor de entrada.
		System.out.print("Introduzca el tamaño del array: ");
		randomArray = new int[reader.nextInt()];
		
		// Llamada a métodos.
		p.numbersGenerator(randomArray, MIN, MAX);
		p.showArray(randomArray);
		p.farewell(reader);
	}
	/**
	 * M�todo que interrumpe el flujo de entrada y proporciona la salida del sistema. Como par�metro
	 * se pasa la variable Scanner. No devuelve ning�n valor.
	 * @param reader. Variable de flujo de entrada.
	 */
	private void farewell(Scanner reader) {
		
		reader.close();
		System.out.println();
		System.out.println("Fin de la aplicación, hasta pronto.");
		System.exit(0);
	}
	/**
	 * M�todo que muestra por consola un array unidimensional de cualquier tamma�o.
	 * Como par�metro se pasa la referencia del array.
	 * @param randomArray. Array a mostrar.
	 */
	private void showArray(int[] randomArray) {
		
		for(int i=0; i<randomArray.length; i++) System.out.print(randomArray[i]+" | ");
	}
	/**
	 * M�todo que genera n�meros aleatorios comprendidos dentro de un rango determinado.
	 * No repite valores. Como par�metros se pasan la referencia del array y dos valores que
	 * suponen los l�mites para los valores generados.
	 * @param randomArray. Referencia del array.
	 * @param MIN. Valor m�nimo.
	 * @param MAX. Valor m�ximo.
	 */
	private void numbersGenerator(int[] randomArray, int MIN, int MAX) {
		
		Random random = new Random();
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = random.nextInt(MAX-MIN)+MIN;
			for(int j=0; j<i; j++) if(randomArray[i] == randomArray[j]) i--;
		}

	}
}
