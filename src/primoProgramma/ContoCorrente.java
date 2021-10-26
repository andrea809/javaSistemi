package primoProgramma;

import java.lang.management.MonitorInfo;

public class ContoCorrente {
    private int saldo;
    ContoCorrente() {

    }

    ContoCorrente(int cifraIniziale) {
        this.saldo = cifraIniziale;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
