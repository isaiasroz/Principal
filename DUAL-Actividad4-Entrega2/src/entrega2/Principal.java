package entrega2;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Principal p = new Principal();
		Scanner reader = new Scanner(System.in);
		int randomArray[];
		final int MIN = 1, MAX = 50;
		
		System.out.print("Introduzca el tamaño del array: ");
		randomArray = new int[reader.nextInt()];
		
		p.numbersGenerator(randomArray, MIN, MAX);
		p.showArray(randomArray);
		p.farewell(reader);
	}

	private void farewell(Scanner reader) {
		
		reader.close();
		System.out.println();
		System.out.println("Fin de la aplicación, hasta pronto.");
		System.exit(0);
	}

	private void showArray(int[] randomArray) {
		
		for(int i=0; i<randomArray.length; i++) System.out.print(randomArray[i]+" | ");
	}

	private void numbersGenerator(int[] randomArray, int MIN, int MAX) {
		
		Random random = new Random();
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = random.nextInt(MAX-MIN)+MIN;
			for(int j=0; j<i; j++) if(randomArray[i] == randomArray[j]) i--;
		}

	}
}
