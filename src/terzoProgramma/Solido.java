package terzoProgramma;

abstract public class Solido {
    private double pesoSpecifico;

    public Solido(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    abstract public double volume();

    abstract public double superficie();

    public double peso() {
        return pesoSpecifico * volume();
    }
}
