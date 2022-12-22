package es.itrafa.examen1EvPastYear.ej4;


/**
 * [java]
 * <p>
 * Debes crear una clase denominada TextProc que nos permita almacenar un texto.
 * <p>
 * La clase contará con los siguientes atributos y métodos (debes usar los
 * modificadores de acceso y tipos más convenientes en cada caso):
 * <p>
 * Atributos:
 * <p>
 * La clase definirá un atributo denominado text para almacenar el texto suministrado
 * <p>
 * Constructores:
 * <p>
 * Sólo se definirán los constructores necesarios para crear un nuevo objeto TextProc
 * e inicializarlo a partir de:
 * <p>
 * - un texto
 * <p>
 * - otro objeto de tipo TextProc (constructor copia)
 * <p>
 * Métodos:
 * <p>
 * - Método getText que devolverá el texto almacenado por el objeto
 * <p>
 * - Método setText que permitirá modificar el texto almacenado por el suministrado
 * <p>
 * - Método getLen que devolverá la longitud del texto almacenado
 * <p>
 * - Método reverse que invertirá el orden del texto almacenado en el objeto
 * <p>
 * - Método maxFreq que devolverá una cadena de texto con el carácter que más se
 * repita en el texto almacenado. Dicho carácter se devolverá en mayúsculas.
 * En caso de que varios caracteres aparezcan el mismo número máximo de veces,
 * devolverá una cadena de texto con todos (en mayúsculas y ordenados alfabéticamente).
 * Para simplificar, sólo se considerarán los caracteres del alfabeto inglés y no se
 * distinguirán mayúsculas de minúsculas.
 * <p>
 * - La impresión directa de objetos TextProc resultará en la impresión del texto
 * almacenado por el objeto
 * <p>
 * IMPORTANTE: Antes de enviar el código, comprueba que has declarado todos los métodos
 * de la clase (aunque el cuerpo esté vacío) para asegurar de que el código se compila.
 * <p>
 * A continuación se muestran algunos ejemplos de creación, manipulación e impresión de objetos TextProc:
 * <p>
 * <p>
 * Por ejemplo:
 * Test 	Resultado
 * <p>
 * TextProc t = new TextProc("Texto de prueba");
 * System.out.println(t.getText());
 * System.out.println(t);
 * <p>
 * <p>
 * <p>
 * Texto de prueba
 * Texto de prueba
 * <p>
 * TextProc t = new TextProc("Texto");
 * t.setText(t + " de prueba");
 * System.out.println(t.getLen());
 * <p>
 * <p>
 * <p>
 * 15
 * <p>
 * TextProc t = new TextProc(new TextProc("Texto de prueba"));
 * t.reverse();
 * System.out.println(t);
 * <p>
 * <p>
 * <p>
 * abeurp ed otxeT
 * <p>
 * TextProc t = new TextProc("Texto de prueba");
 * System.out.println(t.maxFreq());
 * <p>
 * <p>
 * <p>
 * E
 * <p>
 * TextProc t = new TextProc("Texto prueba");
 * System.out.println(t.maxFreq());
 * <p>
 * <p>
 * <p>
 * ET
 */
import java.util.Arrays;

public class ej4 {
    public static void main(String[] args) {

        TextProc t = new TextProc("Texto de prueba");
        System.out.println(t.getText());
        System.out.println(t);
        // Texto de prueba
        // Texto de prueba

        TextProc t_1 = new TextProc("Texto");
         t_1.setText(t_1 + " de prueba");
        System.out.println(t_1.getLen());
        // 15

        TextProc t_2 = new TextProc(new TextProc("Texto de prueba"));
        t_2.reverse();
        System.out.println(t_2);
        // abeurp ed otxeT

        TextProc t_3 = new TextProc("Texto de prueba");
        System.out.println(t_3.maxFreq());
        // E

        TextProc t_4 = new TextProc("Texto prueba");
        System.out.println(t_4.maxFreq());
        // ET
    }
}

class TextProc {
    private String text;

    public TextProc(String text) {
        this.text = text;
    }

    public TextProc(TextProc t) {
        this.text = t.getText();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String txt) {
        this.text = txt;
    }

    public int getLen() {
        return this.text.length();
    }

    public void reverse() {
        String newSt = "";
        for (int i = 0; i < this.text.length(); i++) {
            newSt += this.text.charAt(this.text.length() - i - 1);
        }
        this.text = newSt;
    }

    /**
     * Método maxFreq que devolverá una cadena de texto con el carácter que más se
     * repita en el texto almacenado. Dicho carácter se devolverá en mayúsculas.
     * En caso de que varios caracteres aparezcan el mismo número máximo de veces,
     * devolverá una cadena de texto con todos (en mayúsculas y ordenados alfabéticamente).
     * Para simplificar, solo se considerarán los caracteres del alfabeto inglés y no se
     * distinguirán mayúsculas de minúsculas.
     */
    public String maxFreq() {
        String t = this.text.toLowerCase();
        int[] letras = new int[t.length()];
        int max = 0;
        String result = "";
        for (int i = 0; i < t.length(); i++) {
            switch (t.charAt(i)) {
                // abcdefghijklmnopqrstuvwxyz
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z': {
                    int index = t.indexOf(t.charAt(i));
                    letras[index]++;
                    if(max < letras[index]){
                        max = letras[index];
                    }
                    break;
                }
                default:
                    break;
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(letras[i] == max){
                result += this.text.charAt(i);
            }
            //System.out.println(this.text.charAt(i) + ": "+ letras[i]);
        }
        char[] stOrder = result.toUpperCase().toCharArray();
        Arrays.sort(stOrder);
        return  new String(stOrder);
    }


    public String toString() {
        return this.text;
    }

}