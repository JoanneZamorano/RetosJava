/**
 * Jordi nunca se acuerda de abrir las exclamaciones. Él dice que es porque en catalán no se abren las exclamaciones,
 * pero yo creo que simplemente no sabe escribir. Vamos a crear un programa que asegure que hay tantos abrir exclamación (¡)
 * como cerrar exclamación (!) para flamearlo.
 *
 * Ejemplo de entrada:
 * ¡¡¡Caramba!!!
 * Hola!
 *
 * Ejemplo de salida:
 * Si
 * No
 */

package RetosAbril;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jordi dice: ");
        String fraseJordi = sc.next();

        //Creo las variables de apertura y cierre para contar las exclamaciones que haya:
        int abrirExclamacion = 0;
        int cerrarExclamacion = 0;

        for (int i = 0; i < fraseJordi.length(); i++) {
            if (fraseJordi.charAt(i) == '¡') { //Cuento las "¡" que haya en la frase y las pongo en la variable "abrirExclamacion".
                abrirExclamacion++;
            } else if (fraseJordi.charAt(i) == '!') { //Cuento las "!" que haya en la frase y las pongo en la variable "cerrarExclamacion"
                cerrarExclamacion++;
            }
        }

        if (abrirExclamacion == cerrarExclamacion) { //si hay el mismo número de exclamaciones de apertura y cierre:
            System.out.println("¡Felicidades Jordi! Has aprendido a escribir correctamente. " +
                    "\nNúmero de exclamaciones: " + abrirExclamacion + ".");
        } else { //si hay distinto número:
            System.out.println("¡Jordiiiiiii, tienes un problema con las exclamaciones!: " +
                "\n - Nº de abrir exclamación (¡):" + abrirExclamacion +
                "\n - Nº de cerrar exclamación (!): " + cerrarExclamacion);
        }
    }
}
