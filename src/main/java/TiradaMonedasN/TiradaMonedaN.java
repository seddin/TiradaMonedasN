/**
 * @author Salah Eddine
 * @version 0.0.6
 * @description Clase Tirada Moneda
 * 
 */
package TiradaMonedasN;

public class TiradaMonedaN {

    /**
     * @description Metodo que imprime en pantalla los paremtros que se le pasan.
     * @author Salah Eddine
     * 
     * @param contadorCaras
     * @param contadorCruces
     * @param maximoCarasDoblesConsecutivas
     * @param maximoCrucesDoblesConsecutivas 
     */
    public static void imprime(int contadorCaras, int contadorCruces, int maximoCarasDoblesConsecutivas, int maximoCrucesDoblesConsecutivas) {
        System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
        System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
        System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
    }
}
