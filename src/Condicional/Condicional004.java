// Faça um pseudocódigo que solicite um número e diga se ele é: Par ou ímpar
package Condicional;
import java.util.Scanner;

public class Condicional004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        byte numero = 0;
        System.out.println("Digite um numero: ");
        numero = ler.nextByte();

        if(numero % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        ler.close();
    }
}
