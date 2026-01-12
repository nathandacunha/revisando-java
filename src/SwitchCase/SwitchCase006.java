//6) Faça um algoritmo que a partir de dois números, pergunte ao usuário qual a
//operação que ele deseja (+, -, / ou *) e mostre o resultado dessa operação com os
//dois números na tela. A divisão poderá ser feita somente se o 2o número não for
//zero.
//Utilize switch-case e if-else
package SwitchCase;
import java.util.Scanner;

public class SwitchCase006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //declaracao de variaveis
        int numero1, numero2, soma, subtracao, divisao, multiplicacao = 0;
        byte opcao = 0;
        System.out.println("Digite o primeiro numero inteiro: ");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        numero2 = ler.nextInt();

        System.out.println("Menu de operações");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtracao");
        System.out.println("[3] - Multiplicacao");
        System.out.println("[4] - Divisao");
        opcao = ler.nextByte();

        switch(opcao){
            case 1:
               soma = numero1+numero2;
               System.out.println("Resultado: " + soma);
               break;
            case 2:
                subtracao = numero1-numero2;
                System.out.println("Resultado: " + subtracao);
                break;
            case 3:
                multiplicacao = numero1*numero2;
                System.out.println("Resultado: " + multiplicacao);
                break;
            case 4:
                if(numero2 != 0){
                    divisao = numero1/numero2;
                    System.out.println("Resultado: " + divisao);
                } else{
                    System.out.println("Erro! Não existe divisao por zero");
                }
        }
    }
}
