package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Pagina {
    private List<Pagina> sottoElementi = new ArrayList<>();

    @Override
    public void stampa() {
        for (Pagina pagina : sottoElementi) {
            pagina.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (Pagina pagina : sottoElementi) {
            numeroPagine += pagina.getNumeroPagine();
        }
        return numeroPagine;
    }

    public void aggiungiElemento(Pagina pagina) {
        sottoElementi.add(pagina);
    }

    public void rimuoviElemento(Pagina pagina) {
        sottoElementi.remove(pagina);
    }
}
