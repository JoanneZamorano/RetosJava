/**
 * "Un resplandor y hace ¡BOOM! Y digo, ains ya está aquí la guerra."
 * Como dice la señora del famoso meme, un día estalló la guerra.
 * Haz un programa que, dado un número que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.
 */
package RetosAbril;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        System.out.println("Dame un número para la cuenta atrás: ");
        Scanner sc = new Scanner(System.in);

        int cuentaAtras = sc.nextInt();
        for (int i = cuentaAtras; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("¡BOOM!... Ains ya está aquí la guerra");
    }
}
