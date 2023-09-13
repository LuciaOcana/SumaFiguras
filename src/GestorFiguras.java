//Función que se encarga de gestionar las Figuras
public class GestorFiguras {

    public static double suma(Figura[] v){
        double sum=0;
        for (Figura f:v){
            sum = sum+f.area();
        }
        return sum;
    }
}
