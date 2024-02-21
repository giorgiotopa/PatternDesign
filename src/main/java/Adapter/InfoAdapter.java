package Adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcolare l'età a partire dalla data di nascita
        LocalDate oggi = LocalDate.now();
        LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int eta = Period.between(dataDiNascita, oggi).getYears();
        return eta;
    }
}
