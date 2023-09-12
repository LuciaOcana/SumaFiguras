public class Circulo extends Figura {
    public Circulo(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int r;

    public Circulo(){
        super();
        area = 2*Math.PI*r;
    }
}
