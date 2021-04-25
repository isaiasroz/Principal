package entrega2;

import java.util.Random;
import java.util.Scanner;
/**
 * Clase Principal. Representa un array que se inicializa con números aleatorios.
 * @author Isaías
 * @version 1.1
 * @since 1.0
 */
public class Principal {
	/**
	 * Método main, representa el punto de acceso del sistema para la ejecución del código.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instancias.
		Principal p = new Principal();
		Scanner reader = new Scanner(System.in);
		// DeclaraciÃ³n del array.
		int randomArray[];
		// DeclaraciÃ³n de constantes.
		final int MIN = 1, MAX = 50;
		
		// Solicitud del valor de entrada.
		System.out.print("Introduzca el tamaÃ±o del array: ");
		randomArray = new int[reader.nextInt()];
		
		// Llamada a mÃ©todos.
		p.numbersGenerator(randomArray, MIN, MAX);
		p.showArray(randomArray);
		p.farewell(reader);
	}
	/**
	 * Método que interrumpe el flujo de entrada y proporciona la salida del sistema. Como parámetro
	 * se pasa la variable Scanner. No devuelve ningún valor.
	 * @param reader. Variable de flujo de entrada.
	 */
	private void farewell(Scanner reader) {
		
		reader.close();
		System.out.println();
		System.out.println("Fin de la aplicaciÃ³n, hasta pronto.");
		System.exit(0);
	}
	/**
	 * Método que muestra por consola un array unidimensional de cualquier tammaño.
	 * Como parámetro se pasa la referencia del array.
	 * @param randomArray. Array a mostrar.
	 */
	private void showArray(int[] randomArray) {
		
		for(int i=0; i<randomArray.length; i++) System.out.print(randomArray[i]+" | ");
	}
	/**
	 * Método que genera números aleatorios comprendidos dentro de un rango determinado.
	 * No repite valores. Como parámetros se pasan la referencia del array y dos valores que
	 * suponen los límites para los valores generados.
	 * @param randomArray. Referencia del array.
	 * @param MIN. Valor mínimo.
	 * @param MAX. Valor máximo.
	 */
	private void numbersGenerator(int[] randomArray, int MIN, int MAX) {
		
		Random random = new Random();
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = random.nextInt(MAX-MIN)+MIN;
			for(int j=0; j<i; j++) if(randomArray[i] == randomArray[j]) i--;
		}

	}
}
