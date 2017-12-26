package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        float nota = teclado.nextFloat();
        System.out.println("A nota do " +nome+" é " + nota);
    }
}
