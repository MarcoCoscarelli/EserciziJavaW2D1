package MyLibrary;

import java.util.Scanner;

public class KmPrLiter {
    private Scanner scanner;

    public KmPrLiter() {
        scanner = new Scanner(System.in);
    }

    // Metodo per eseguire il calcolo dei km per litro
    public void calcolaKmPerLitro() {
        try {
            // Chiediamo all'utente i chilometri percorsi
            System.out.print("Inserisci i chilometri percorsi: ");
            double km = Double.parseDouble(scanner.nextLine());

            // Chiediamo all'utente i litri di carburante consumati
            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = Double.parseDouble(scanner.nextLine());

            // Gestione della divisione per zero
            if (litri == 0) {
                throw new ArithmeticException("Non puoi dividere per zero. Inserisci un valore di litri maggiore di zero.");
            }

            // Calcolo dei km per litro
            double kmPerLitro = km / litri;
            System.out.println("Hai percorso " + kmPerLitro + " km per litro.");

        } catch (NumberFormatException e) {
            System.out.println("Errore: Devi inserire un numero valido.");
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
