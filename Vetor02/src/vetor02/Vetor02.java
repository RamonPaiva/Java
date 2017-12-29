/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author ramon
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"JAN","FEV","MAR","ABR","MAIO","JUNHO","JULHO","AGOSTO","SETEMBRO","OUTUBRO","NOVEMBRO","DEZEMBRO"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<dias.length;i++)
            System.out.println(mes[i]+" "+ dias[i]);
        Arrays.sort(dias);
        int pos = Arrays.binarySearch(dias, 31);
        System.out.println(pos);
        for(int valor:dias){
            System.out.print(valor+" ");
        }
        Arrays.fill(dias, 0);//zera o vetor em uma linha
    }
    
}
