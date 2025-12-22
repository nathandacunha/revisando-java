// 3) Faça um pseudocódigo que solicite um número e diga se ele é: Positivo ou Negativo.
package Condicional;
import java.util.Scanner;

public class Condicional003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        byte numero = 0;

        System.out.println("Digite um numero: ");
        numero = ler.nextByte();

        if(numero > 0){
            System.out.println("O valor é positivo");
        } else if(numero < 0) {
            System.out.println("O valor é negativo");
        } else {
            System.out.println("O valor é zero");
        }
        ler.close();
    }
}
