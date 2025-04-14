/**
 * Crear dos variables utilizando los objetos fecha
 * En la primera se representa la fecha (día, mes, año) actual.
 * En la segunda se representa la fecha de nacimiento.
 *
 * Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de maneras diferentes.
 * - Día, mes y año.
 * - Hora, minuto y segundo.
 * - Día de año.
 * - Día de la semana.
 * - Nombre del mes.
 *
 * Pistas: buscar sobre el paquete java.time para para fechas y horas.
 */

package RetosAbril;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Reto3 {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now(); //FECHA ACTUAL
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 31); //FECHA NACIMIENTO

        System.out.println("Fecha hoy: " + fechaActual);
        System.out.println("Fecha nacimiento: " + fechaNacimiento);

        //Tiempo vivido en días, meses y años:
        Period tiempoEntreNacimientoYActualDDMMAA = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Tiempo vivido:" +
                "\nDías: " + tiempoEntreNacimientoYActualDDMMAA.getDays() +
                "\nMeses: " + tiempoEntreNacimientoYActualDDMMAA.getMonths() +
                "\nAños: " + tiempoEntreNacimientoYActualDDMMAA.getYears());

        //Tiempo vivido en horas, minutos y segundos:
        LocalDateTime horaNacimiento = fechaNacimiento.atStartOfDay();
        LocalDateTime horaActual = fechaActual.atStartOfDay();

        Duration tiempoEntreNacimientoYActualHHMMSS = Duration.between(horaNacimiento, horaActual);
        System.out.println("Tiempo vivido:" +
                "\nen Horas: " + tiempoEntreNacimientoYActualHHMMSS.toHours() +
                "\nen Minutos: " + tiempoEntreNacimientoYActualHHMMSS.toMinutes() +
                "\nen Segundos: " + tiempoEntreNacimientoYActualHHMMSS.toSeconds());

        //Tiempo vivido solo en meses:
        Period tiempoEntreNacimientoYActualMM = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Tiempo vivido en:" +
                "\nen Total de Meses: " + tiempoEntreNacimientoYActualMM.toTotalMonths() +
                "\nen Total de Días: " +  tiempoEntreNacimientoYActualHHMMSS.toHours()/24);

        //Que dia de la semana es ahora y cuando nacimos:
        System.out.println("Dia de la semana:" +
                "\nen fecha de Nacimiento: " + fechaNacimiento.getDayOfWeek() +
                "\nen fecha Actual: " + fechaActual.getDayOfWeek());

        //Que mes estamos y nacimos:
        System.out.println("Dia de la semana:" +
                "\nen fecha de Nacimiento: " + fechaNacimiento.getMonth() +
                "\nen fecha Actual: " + fechaActual.getMonth());

    }
}
