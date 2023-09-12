public class Triangulo extends Figura{
    public int b;
    public int h;

    public Triangulo(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Triangulo(){
        super();
        area = (b*h)/2;
    }
}
