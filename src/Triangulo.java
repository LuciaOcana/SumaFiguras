public class Triangulo extends Figura{
    public double b;
    public double h;
    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Triangulo(){
        super();
        area = (b*h)/2;
    }
}
