/**
 * Escribe un programa que le pregunte al usuario su nombre.
 * Si el nombre comienza con la letra "A" (mayúscula o minúscula), el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a "Nombre"!.
 * Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan largo y sofisticado!.
 * Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".
 *
 * ¡Prepara al robot para to_do tipo de nombres! Como un saludo especial a un nombre que empiece por A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito...
 */
package RetosAbril;

import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        //Nombre = Jaimito -> Chiste
        if (nombre.equalsIgnoreCase("Jaimito")) {
            System.out.println("- Papá ¿tu regañarías a un niño que no ha hecho nada?" +
                    "\n- ¡Claro que no, Jaimito!" +
                    "\n- ¡Uf, menos mal!...¡Porque no he hecho los deberes!");
        //Nombre empieza A o a
        } else if (nombre.startsWith("A") || nombre.startsWith("a")) {
            // + 7 letras -> Nombre equilibrado
            if (nombre.length() == 7) {
                System.out.println("¡Hola, Asombroso/a " + nombre + "! ¡Qué nombre tan equilibrado!");
            //Solo A o a:
            } else {
                System.out.println("¡Hola, Asombroso/a " + nombre + "!");
            }
        // Nombre = 7 letras -> Nombre largo y sofisticado
        } else if (nombre.length() > 7) {
            System.out.println("¡Vaya, " + nombre + ", ¡qué nombre tan largo y sofisticado!");
        //No cumple ninguna otra condición -> saludo normal
        } else {
            System.out.println("Saludos, " + nombre);
            }
        }
}
