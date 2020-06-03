package TiradaMonedasN;

import java.util.Scanner;

public class TiradaMonedaN {

    public static void main(String[] args) {
        //las variables resultadoPrimeraTirada y resultadoTiradaDos servirán para guardar el resultado de la tirada de dos monedas
        int resultadoPrimeraTirada, resultadoTiradaDos;
        int contadorCaras = 0, contadorCruces = 0, numTiradas;
        //las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
        int contadorUno = 0, contadorDos = 0;
        int maximoCarasDoblesConsecutivas = 0, maximoCrucesDoblesConsecutivas = 0;
        boolean esCruzDoble = false, esCaraDoble = false;
        String tirada1;
        String tirada2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce el número de veces que se van a lanzar las monedas (max 50): ");
            numTiradas = teclado.nextInt();
        } while (numTiradas < 1 || numTiradas > 50);

        for (int i = 0; i < numTiradas; i++) {
            resultadoPrimeraTirada = (int) (Math.random() * 2);
            resultadoTiradaDos = (int) (Math.random() * 2);

            if (resultadoPrimeraTirada == 0) {
                contadorCaras++;
                tirada1 = "cara";
            } else {
                contadorCruces++;
                tirada1 = "cruz";
            }
            if (resultadoTiradaDos == 0) {
                contadorCaras++;
                tirada2 = "cara";
            } else {
                contadorCruces++;
                tirada2 = "cruz";
            }
            System.out.println("Moneda 1: " + tirada1 + ", Moneda 2: " + tirada2);

            if (resultadoPrimeraTirada == resultadoTiradaDos) {
                if (resultadoPrimeraTirada == 0) {
                    esCaraDoble = true;
                    esCruzDoble = false;
                } else {
                    esCaraDoble = false;
                    esCruzDoble = true;
                }
            } else {
                esCaraDoble = false;
                esCruzDoble = false;
            }

            if (esCaraDoble) {
                contadorUno++;
                if (contadorUno > maximoCarasDoblesConsecutivas) {
                    maximoCarasDoblesConsecutivas = contadorUno;
                }
            } else {
                contadorUno = 0;
            }

            if (esCruzDoble) {
                contadorDos++;
                if (contadorDos > maximoCrucesDoblesConsecutivas) {
                    maximoCrucesDoblesConsecutivas = contadorDos;
                }
            } else {
                contadorDos = 0;
            }
        }

        System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
        System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
        System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
    }
}
