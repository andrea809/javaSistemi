package primoProgramma;

public class AtmMonitor {
    AtmMonitor() {

    }
    public void prelievoBuonFine(int cifra) {
        System.out.println("Il l prelievo è andato a buon fine, cifra: "+cifra);
        System.out.println("arrivederci");
    }
    public void prelievoEsitoNegativo() {
        System.out.println("Il prelievo non è andato a buon fine, riprova più tardi");
        System.out.println("ci scusiamo per il disagio");
    }
    public void versamentoBuonFine(int cifra) {
        System.out.println("Il versamento è andato a buon fine, cifra: "+cifra);
        System.out.println("arrivederci");
    }
    public void versamentoEsitoNegativo() {
        System.out.println("Il versamento non è andato a buon fine, riprova più tardi");
        System.out.println("ci scusiamo per il disagio");
    }
}
