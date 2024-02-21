package Composite;

import java.util.Arrays;

public class MainComposite {
    public static void main(String[] args) {
        // Creazione di autori
        Autore autore1 = new Autore("Autore 1");
        Autore autore2 = new Autore("Autore 2");

        // Creazione di pagine
        Capitolo introduzione = new Capitolo(10);
        Capitolo capitolo1 = new Capitolo(15);
        Capitolo capitolo2 = new Capitolo(20);

        // Creazione di sezioni e aggiunta di pagine
        Sezione sezione1 = new Sezione();
        sezione1.aggiungiElemento(introduzione);


        Sezione sezione2 = new Sezione();
        sezione2.aggiungiElemento(capitolo1);
        sezione2.aggiungiElemento(capitolo2);

        // Creazione del libro e aggiunta di autori, pagine e sezioni
        Libro libro = new Libro(Arrays.asList(autore1, autore2), 29.99);
        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);

        // Stampa del libro e numero totale di pagine
        libro.stampa();
        int numeroTotalePagine = libro.getNumeroPagine();
        System.out.println("Numero totale di pagine del libro: " + numeroTotalePagine);
    }
}
