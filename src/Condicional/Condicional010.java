//11) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais
package Condicional;
import java.util.Scanner;
public class Condicional010 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        int numero1, numero2 = 0;

        System.out.println("Digite o primeiro valor: ");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo valor: ");
        numero2 = ler.nextInt();

        if(numero1 > numero2){
            System.out.println("O primeiro valor é maior que o segundo");
        } else if(numero2 > numero1){
            System.out.println("O segundo valor é maior que o primeiro");
        } else {
            System.out.println("São iguais");
        }
    }
}
