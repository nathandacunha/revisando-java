//12) Faça um código em java que peça três lados de um triângulo e mostre o tipo de
//triângulo que será formado:
//- EQUILÁTERO: todos os lados iguais
//- ISÓSCELES: dois lados iguais
//- ESCALENO: todos os lados diferentes
package Condicional;
import java.util.Scanner;

public class Condicional011 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        int valor1, valor2, valor3 = 0;

        System.out.println("Digite o primeiro valor: ");
        valor1 = ler.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = ler.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = ler.nextInt();

        if(valor1 == valor2 && valor1 == valor3){
            System.out.println("Dá para formar um triangulo equilatero");
        } else if(valor1 == valor2 && valor1 != valor3){
            System.out.println("Triangulo isosceles");
        } else {
            System.out.println("Triangulo escaleno");
        }
        ler.close();
    }
}
