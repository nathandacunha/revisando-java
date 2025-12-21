// Faça um codigo em Java que leia dois valores para as variáveis A e B e efetue
//a troca dos valores de forma que a variável A passe a possuir o valor da
//variável B e a variável B passe a possuir o valor da variável A. Apresente os
//valores trocados.
import java.util.Scanner;

public class EntradaSaida008 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //declaracao de variaveis
        byte a, b, valorTrocadoA, valorTrocadoB = 0;
        System.out.println("Digite o primeiro valor: ");
        a = ler.nextByte();

        System.out.println("Digite o segundo valor: ");
        b = ler.nextByte();

        valorTrocadoA = b;
        valorTrocadoB = a;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor trocado de A: " + valorTrocadoA);
        System.out.println("Valor trocado de B: " + valorTrocadoB);
        ler.close();
    }
}
