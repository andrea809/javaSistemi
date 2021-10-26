package templateMethod;

import secondoProgramma.EccezionePuntoOrientato;
import secondoProgramma.PuntoOrientato;

public class Main {

    public static void main(String[] args) {
        Template template1 = new Concreta1();
        Template template2 = new Concreta2();
        esegui(template1);
        esegui(template2);
    }

    private static void esegui(Template concrete) {
        concrete.TemplateMethod();
    }
}
