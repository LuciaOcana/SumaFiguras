// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];
        v[0] = new Rectangulo(5,3);
        v[1] = new Circulo(5);
        v[2] = new Cuadrado(5);
        v[3] = new Triangulo(120);
        double res = suma(v);
        System.out.println("suma: "+res);
        //print(v);    sort(v);    //print(v);
        }
    }
