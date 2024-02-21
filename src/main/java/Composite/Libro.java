package Composite;

import java.util.List;

public class Libro implements Pagina {
    private List<Autore> autori;
    private double prezzo;
    private Sezione radice = new Sezione();

    public Libro(List<Autore> autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa libro di " + autori.size() + " autori");
        radice.stampa();
    }

    @Override
    public int getNumeroPagine() {
        return radice.getNumeroPagine();
    }

    public void aggiungiElemento(Pagina pagina) {
        radice.aggiungiElemento(pagina);
    }

    public void rimuoviElemento(Pagina pagina) {
        radice.rimuoviElemento(pagina);
    }
}
