package es.itrafa.examen1EvPastYear.ej3;

/**
 * [java]
 * <p>
 * El número Pi (π) es uno de los más importantes y fascinantes de las matemáticas.
 * Equivale aproximadamente a 3,14 y es una constante que se utiliza para calcular
 * la circunferencia de un círculo a partir del radio.
 * <p>
 * También es un número irracional, lo que significa que se pueden calcular un
 * número infinito de decimales que no tienen un patrón repetitivo.
 * <p>
 * Esto hace que sea difícil, pero no imposible, calcular con precisión el valor de Pi.
 * <p>
 * Un método para conocer su valor es la serie infinita de Nilakantha:
 * de forma que, cuantos más términos añadamos a la serie, más nos aproximaremos al
 * valor real de Pi
 * <p>
 * Escribe un método estático denominado piNilakantha que reciba como argumento el número
 * de términos de la serie empleados en el cálculo y que nos devuelva el valor de Pi
 * resultante. En caso de que el argumento no sea un número natural {1,2,3,...}, se
 * devolverá como resultado el valor 3.0
 * <p>
 * <p>
 * Por ejemplo:
 * Test 	Resultado
 * <p>
 * System.out.println(piNilakantha(0))
 * <p>
 * <p>
 * <p>
 * 3.0
 * <p>
 * System.out.println(piNilakantha(1))
 * <p>
 * <p>
 * <p>
 * 3.1666666666666665
 * <p>
 * System.out.println(piNilakantha(4))
 * <p>
 * <p>
 * <p>
 * 3.1396825396825396
 * <p>
 * System.out.println(piNilakantha(1000000))
 * <p>
 * <p>
 * <p>
 * 3.141592653589787
 */
public class ej3 {
    public static void main(String[] args) {
        System.out.println(piNilakantha(0));
         System.out.println(piNilakantha(1));

        System.out.println(piNilakantha(2));

        System.out.println(piNilakantha(4));
        System.out.println(piNilakantha(1000000));

    }

    private static double piNilakantha(int value) {
        double pi = 3.0;
        if (value <= 0) {
            return pi;
        }
        boolean sign = true;
        for (int i = 2; i <= value * 2; i += 2) {
            if(sign == true){
                pi += 4.0 / (i * (i + 1.0) * (i + 2.0));
                // System.out.println("+4 / (+ " + i + " * " + (i +1) + " * " + (i + 2)+ ")");
                sign = false;
            }else{
                pi -= 4.0 / (i * (i + 1.0) * (i + 2.0));
                // System.out.println("-4 / (+ " + i + " * " + (i +1) + " * " + (i + 2)+ ")");
                sign = true;
            }
        }

        return pi;
    }
}
