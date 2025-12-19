//Faça um código em Java que peça ao usuário para digitar um número e mostre
//o número que ele digitou.

import java.util.Scanner;

public class EntradaSaida001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //declaracao de variaveis
        byte numero = 0;

        System.out.println("Digite um numero: ");
        numero = ler.nextByte();

        System.out.println("O numero digitado foi: " + numero);

        ler.close();
    }
}
