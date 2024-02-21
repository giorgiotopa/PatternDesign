package Composite;

public class Capitolo implements Pagina {
    private int numeroPagine;

    public Capitolo(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Capitolo con " + numeroPagine + " pagine");
    }
    @Override
    public int getNumeroPagine() {
        return numeroPagine;
    }
}
