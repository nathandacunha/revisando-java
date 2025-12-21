// 5) Faça um pseudocódigo que receba dois números inteiros e mostre o
//resultado das seguintes operações:
//a) Soma dos dois números
//b) Subtração do primeiro pelo segundo
//c) Multiplicação dos dois números
//d) Divisão do primeiro número pelo segundo

import java.util.Scanner;

public class EntradaSaida005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2, soma, subtracao, divisao, multiplicacao;
        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        num2 = ler.nextInt();

        soma = num1+num2;
        System.out.println("A soma entre os dois numeros inteiros: "+ soma);
        subtracao = num1-num2;
        System.out.println("A subtração entre os dois numeros inteiros: " + subtracao);
        multiplicacao = num1*num2;
        System.out.println("A multiplicação entre os dois numeros inteiros: " + multiplicacao);
        if(num2 != 0){
            divisao = num1/num2;
            System.out.println("O resultado da divisão é " + divisao);
        } else if(num2 == 0){
            System.out.println("Não existe divisao por zero");
        }
    }
}
