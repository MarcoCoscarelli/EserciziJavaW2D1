import MyLibrary.ArrayHandler;
import MyLibrary.KmPrLiter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli l'esercizio da eseguire:");
            System.out.println("1. Gestione array (Esercizio 1)");
            System.out.println("2. Calcolo km/litro (Esercizio 2)");
            System.out.println("0. Esci dal programma");
            System.out.print("Inserisci il numero dell'esercizio: ");

            try {
                int scelta = Integer.parseInt(scanner.nextLine());

                switch (scelta) {
                    case 1:
                        // Esecuzione dell'esercizio 1
                        ArrayHandler arrayHandler = new ArrayHandler();
                        arrayHandler.printArray();
                        arrayHandler.updateArray();
                        break;

                    case 2:
                        // Esecuzione dell'esercizio 2
                        KmPrLiter kmCalculator = new KmPrLiter();
                        kmCalculator.calcolaKmPerLitro();
                        break;

                    case 0:
                        System.out.println("Uscita dal programma.");
                        System.exit(0);

                    default:
                        System.out.println("Scelta non valida. Inserisci un numero corretto.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Errore: Devi inserire un numero valido.");
            }
        }
    }
}
