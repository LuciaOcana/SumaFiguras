//Funcion que calcula el area del rectangulo
public class Rectangulo extends Figura{
    public double l1;
    public double l2;
    public Rectangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }


    //metodo polimorfico
    @Override
    public double area() {
        return l1* l2;
    }
}
