/**
 * Tu misión es simple, soldado: crear un calendario que muestre todos los meses del año y sus semanas de forma clara y organizada.
 * Nada de efectos especiales ni complicaciones innecesarias, solo un buen código que haga el trabajo.
 * Crea un programa que:
 * - Itere los meses del año
 * - Itere las semanas del mes
 *
 * PISTA: Bucle for anidad.
 *
 * --Ejemplo:
 * Enero
 * Semana 1
 * Semana 2
 * Semana 3
 * …
 */
package RetosAbril;

public class Reto2 {
    public static void main(String[] args) {
        String[] mesesAnio = new String[]{"enero", "febrero", "marzo", "abril",
                "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"};

        for (int mes = 0; mes < mesesAnio.length; mes++) {
            int diasMes = 0;
            if (mes == 1) { //febrero
                diasMes = 28;
            } else if (mes == 3 || mes == 5 || mes == 8 || mes == 10) {
                diasMes = 30; // abril, junio, septiembre, noviembre
            } else {
                diasMes = 31; //enero, marzo, mayo, julio, agosto, octubre, diciembre
            }

            //Imprimir por pantalla
            System.out.println("\n ** " + mesesAnio[mes].toUpperCase() + " **");

            for (int dia = 1; dia <= diasMes; dia++) {
                System.out.print(dia + "\t");

                if (dia % 7 == 0){
                    System.out.println("semana ");  //Quiero poner aqui el numero de semana que es...
                }
            }
        }
    }
}
