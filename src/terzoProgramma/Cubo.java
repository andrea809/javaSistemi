package terzoProgramma;

public class Cubo extends Solido {
    private double lato;
    private double pesoSpecifico;
    public Cubo(double lato, double pesoSpecifico) {
        super(pesoSpecifico);
        this.lato = lato;
        this.pesoSpecifico = pesoSpecifico;
    }
    public double getLato() {
        return lato;
    }
    public double getPesoSpecifico() {
        return pesoSpecifico;
    }
    public double volume() {
        return Math.pow(lato,3);
    }
    public double superficie() {
        return 6* Math.pow(lato,2);
    }
    public double peso() {
        return pesoSpecifico * volume();
    }
}