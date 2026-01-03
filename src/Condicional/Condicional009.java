//10)Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o
//comprimento de cada lado deve ser menor que a soma dos outros dois.

package Condicional;
import java.util.Scanner;

public class Condicional009 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        int valor1, valor2, valor3 = 0;

        // programa principal

        System.out.println("Digite o primeiro valor inteiro: ");
        valor1 = ler.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        valor2 = ler.nextInt();

        System.out.println("Digite o terceiro valor inteiro: ");
        valor3 = ler.nextInt();

        if(valor1 < valor2+valor3){
            System.out.println("Possivel formar um triangulo");
        } else if(valor2 < valor1+valor3){
            System.out.println("Possivel formar um triangulo");
        } else if(valor3 < valor1+valor2){
            System.out.println("Possivel formar um triangulo");
        } else {
            System.out.println("Não foi possivel formar um triangulo");
        }
        ler.close();
    }
}
