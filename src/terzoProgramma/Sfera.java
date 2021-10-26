package terzoProgramma;

public class Sfera extends Solido {
    private double raggio;
    private double pesoSpecifico;
    public Sfera(double raggio, double pesoSpecifico) {
        super(pesoSpecifico);
        this.raggio = raggio;
        this.pesoSpecifico = pesoSpecifico;
    }
    public double getRaggio() {
        return raggio;
    }
    public double getPesoSpecifico() {
        return pesoSpecifico;
    }
    public double volume() {
        return 4/3 * Math.PI * Math.pow(raggio,3);
    }
    public double superficie() {
        return 4 * Math.PI * Math.pow(raggio,2);
    }
    public double peso() {
        return pesoSpecifico * volume();
    }
}