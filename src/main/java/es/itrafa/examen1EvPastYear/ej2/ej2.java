package es.itrafa.examen1EvPastYear.ej2;

/**
 * [java]
 * <p>
 * Escribe un método estático denominado elZorroEstuvoAqui que le permita al mítico
 * personaje creado en 1919 por Johnston McCulley ir dejando por ahí su "marca".
 * <p>
 * El método recibirá dos parámetros: un valor entero que indique la altura y un
 * carácter que se utilizará para el relleno, y deberá generar la salida mostrada en
 * los ejemplos.
 * <p>
 * Valores negativos de la entrada provocarán que la marca se imprima invertida
 * <p>
 * No se procesarán entradas con alturas inferiores a 4.
 * <p>
 * Por ejemplo:
 * Test
 * <p>
 * elZorroEstuvoAqui(5, '#');
 * <p>
 * <p>
 * <pre>
 * ###
 *   #
 *  #
 * #
 * ###
 * </pre>
 * <p>
 * elZorroEstuvoAqui(-6, '@');
 * <p>
 * Resultado
 * <pre>
 * @@@@
 * @
 *  @
 *   @
 *    @
 * @@@@
 * </pre>
 * <p>
 * elZorroEstuvoAqui(0, ' @ ');
 */
public class ej2 {
    public static void main(String[] args) {
        elZorroEstuvoAqui(5, '#');
        elZorroEstuvoAqui(-6, '@');
        elZorroEstuvoAqui(0, '@');

        elZorroEstuvoAqui(-10 , '@');

    }

    private static void elZorroEstuvoAqui(int altura, char c) {
        boolean pos = true;
        if (altura < 0) {
            altura = -altura;
            pos = false;
        }

        if (altura >= 4) {
            for (int i = 0; i < altura -2; i++) {
                System.out.print(c);
            }
            System.out.println();

            for (int i = 0; i < altura - 2; i++) {
                if (pos) {
                    for (int j = 1; j <= altura - i - 3; j++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(c);
            }

            for (int i = 0; i < altura - 2; i++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
