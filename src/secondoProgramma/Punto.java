package secondoProgramma;

import java.util.concurrent.RecursiveTask;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }

    public double distanza(Punto p) {
        double dx = x - p.getX();
        double dy = y - p.getY();
        return Math.sqrt((dx*dx)+(dy*dy));
    }
    public boolean equals(Punto p)  {
        return ((x==p.x) && (y==p.y));
    }
    public String toString() { return "("+x+";"+y+")"; }

}
