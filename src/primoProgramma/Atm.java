package primoProgramma;

public class Atm {
    private AtmMonitor monitor = new AtmMonitor();
    Atm() {

    }
    public void preleva(ContoCorrente conto, int cifra) {
        conto.setSaldo(conto.getSaldo()-cifra);
        monitor.prelievoBuonFine(cifra);

    }

    public void versa(ContoCorrente conto, int cifra) {
        conto.setSaldo(conto.getSaldo()+cifra);
        monitor.versamentoBuonFine(cifra);
    }
}
