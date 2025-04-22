/**
 * Haz un programa que les indique si tienen clase de FP, de Máster, o de las dos en un conjunto de fechas dado.
 * El usuario introduce un número N, que indica el número de días que quiere ver, se deberá imprimir el número del día,
 * si no tienen nada en esa fecha, FP si tiene clase de un módulo de DAM/DAW o Máster si ese día tiene clase de máster.
 * - Los días múltiplos de 3 tienen clase de FP.
 * - Los días múltiplos de 5, de máster.
 * - Los días que son múltiplos de 3 y 5 tienen clase de las dos.
 */
package RetosAbril;

import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nº de días a consultar:");
        int numeroDias = sc.nextInt();

        for (int dia = 1; dia <= numeroDias; dia++) {
            System.out.print("Día " + dia + ": ");

            if (dia % 3 == 0 && dia % 5 == 0) {
                System.out.println("FP y Máster");
            } else if (dia % 3 == 0) {
                System.out.println("FP");
            } else if (dia % 5 == 0) {
                System.out.println("Máster");
            } else {
                System.out.println(dia);
            }
        }
    }
}
