package testefuncao01;

import java.util.Scanner;

public class TesteFuncao01 {
    static int soma(int a,int b){
        int s = a +b;
        return s;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        System.out.println(soma(a,b));
    }
    
}
