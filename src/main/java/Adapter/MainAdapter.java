package Adapter;

import java.util.Date;

public class MainAdapter {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new Date(90, 0, 1));

        InfoAdapter adapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }

}
