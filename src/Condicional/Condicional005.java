//5) As maçãs importadas custam R$ 2,30 cada se forem compradas menos de uma dúzia, e R$ 1,95 se forem compradas uma dúzia ou
// acima. Faça um algoritmo que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
package Condicional;
import java.util.Scanner;

public class Condicional005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        double quantidadeMacas = 0;
        double custoTotal = 0;

        System.out.println("Digite a quantidade de maças compradas: ");
        quantidadeMacas = ler.nextDouble();

        if(quantidadeMacas < 6){
            custoTotal = quantidadeMacas*2.30;
            System.out.println("Custo total de macas: " + custoTotal);
        } else if(quantidadeMacas >= 6){
            custoTotal = quantidadeMacas*1.95;
            System.out.println("Custo total de macas: " + custoTotal);
        }
        ler.close();
    }
}
