package terzoProgramma;

public class Cilindro extends Solido {
    private double raggio;
    private double altezza;
    public Cilindro(double raggio, double altezza, double pesoSpecifico) {
        super(pesoSpecifico);
        this.raggio = raggio;
        this.altezza = altezza;
    }
    public double getRaggio() {
        return raggio;
    }
    public double getAltezza() {
        return altezza;
    }
    public double volume() {
        return Math.PI * Math.pow(raggio,2) * altezza;
    }
    public double superficie() {
        return Math.PI * Math.pow(raggio,2);
    }
}