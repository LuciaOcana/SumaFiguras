public class Circulo extends Figura {
    public double r;
    public Circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double area() {
        return Math.PI*r*r;
    }
}
