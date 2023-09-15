// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];
        v[0] = new Rectangulo(5, 3);
        v[1] = new Circulo(5);
        System.out.println(v[1].area());
        v[2] = new Cuadrado(5);
        v[3] = new Triangulo(120, 100);
        double res = GestorFiguras.suma(v);
        System.out.println("suma: " + res);


        double[] listaAreas = new double[4];


        //funcion indice para rellenar los 4 huecos del vector listaAreas[]
        for(int i=0; i<4;i++) {
            double masGrande = 0;
            int posicion = 0;
            //Busca el numero mas grande de la lista de las figuras
            for (int j = 0; j < v.length; j++) {
                Figura f = v[j];
                if (f != null && f.area() > masGrande) {
                    masGrande = f.area();
                    posicion = j;
                }
            }
            listaAreas[i]=masGrande;
            v[posicion]=null; //marca la figura como asignada
            System.out.println(i+1 + ":" + listaAreas[i]);
        }


        }

    }

