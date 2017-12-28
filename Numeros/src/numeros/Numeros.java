/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s=0;
        String resp;
        Scanner tec = new Scanner(System.in);
        do{
            System.out.println("Digita:");
            n=tec.nextInt();
            s += n;
            System.out.println("Continuar?");
            resp = tec.next();
        }while(resp.equals("S"));
        System.out.println(s);
    }
    
}
