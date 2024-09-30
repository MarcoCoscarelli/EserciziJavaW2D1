package MyLibrary;

import java.util.Random;
import java.util.Scanner;

public class ArrayHandler {
    private int[] array;
    private Scanner scanner;

    public ArrayHandler() {
        array = new int[5];
        scanner = new Scanner(System.in);
        fillArrayWithRandomNumbers();
    }

    // Riempie l'array con numeri casuali tra 1 e 10
    private void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    // Stampa l'array corrente
    public void printArray() {
        System.out.print("Array corrente: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Metodo per aggiornare l'array su una posizione specifica
    public void updateArray() {
        while (true) {
            try {
                System.out.print("Inserisci la posizione (1-5) dove vuoi cambiare il numero (oppure inserisci 0 per uscire): ");
                int posizione = Integer.parseInt(scanner.nextLine());

                // Se l'utente inserisce 0, termina il loop
                if (posizione == 0) {
                    System.out.println("Programma terminato.");
                    break;
                }

                // Converti la posizione da 1-5 a 0-4 per l'indice dell'array
                if (posizione < 1 || posizione > 5) {
                    System.out.println("Posizione non valida. Riprova.");
                    continue;
                }

                // Chiedi il nuovo valore da inserire nell'array
                System.out.print("Inserisci il nuovo valore (1-10): ");
                int nuovoValore = Integer.parseInt(scanner.nextLine());

                if (nuovoValore < 1 || nuovoValore > 10) {
                    System.out.println("Valore non valido. Riprova.");
                } else {
                    array[posizione - 1] = nuovoValore;  // Aggiorna l'array (posizione - 1 perché l'indice parte da 0)
                    printArray();  // Stampa l'array aggiornato
                }

            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero.");
            }
        }
    }
}
