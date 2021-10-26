package secondoProgramma;

public class PuntoOrientato extends Punto {
    private char orientamento;
    public PuntoOrientato() {
        super(0., 0.);
        this.orientamento = 'A';
    }
    public PuntoOrientato(double x, double y, char orientamento)
            throws EccezionePuntoOrientato {
        super(x, y);
        setOrientamento(orientamento);
    }
    public PuntoOrientato(PuntoOrientato po)
            throws EccezionePuntoOrientato {
        super(po.getX(), po.getY());
        setOrientamento(po.getOrientamento());
    }
    // set/get del nuovo attributo
    public void setOrientamento(char orientamento)
            throws EccezionePuntoOrientato {
        if ((orientamento!='A') && (orientamento!='B') &&
                (orientamento!='D') && (orientamento!='S'))
            throw new EccezionePuntoOrientato();
        this.orientamento = orientamento;
    }
    public char getOrientamento() {
        return orientamento;
    }
    // altri metodi
    public void ruotaDestra() {
        switch (orientamento) {
            case 'A': orientamento = 'D'; break;
            case 'D': orientamento = 'B'; break;
            case 'B': orientamento = 'S'; break;
            case 'S': orientamento = 'A'; break;
        }
    }
    public void ruotaSinistra() {
        switch (orientamento) {
            case 'A': orientamento = 'S'; break;
            case 'D': orientamento = 'A'; break;
            case 'B': orientamento = 'D'; break;
            case 'S': orientamento = 'B'; break;
        }
    }
    public void sposta(double distanza){
        switch (orientamento) {
            case 'A': setY(getY() + distanza); break;
            case 'B': setY(getY() - distanza); break;
            case 'S': setX(getX() - distanza); break;
            case 'D': setX(getX() + distanza); break;
        }
    }
    public boolean equals(PuntoOrientato po) {
        return (super.getX() == po.getX() && super.getY() == po.getY() &&
                this.getOrientamento() == po.getOrientamento());

    }
    public String toString() {
        return super.toString()+orientamento;
    }
}