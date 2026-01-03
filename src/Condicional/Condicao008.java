//9) Faça um algoritmo que calcule e mostre o IMC de uma pessoa, a partir de
//seu peso e altura. Sabe-se que o cálculo do IMC é dado por: peso dividido pela
//altura ao quadrado. Mostre a situação de cada número de IMC, sabendo que:
package Condicional;
import java.util.Scanner;

public class Condicao008 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        double peso, altura, imc = 0.0;

        // programa principal
        System.out.println("Digite a sua altura: ");
        altura = ler.nextDouble();

        System.out.println("Digite o seu peso: ");
        peso = ler.nextDouble();

        imc = (peso)/(altura*altura);

        if(imc < 18.5){
            System.out.println("Classificacao: baixo do peso");
        } else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("Classificacao: normal");
        } else if(imc >= 25 && imc <= 29.99){
            System.out.println("Classificacao: sobrepeso");
        } else if(imc >= 30.0){
            System.out.println("Classificacao: Obesidade");
        } else {
            System.out.println("Não identificado");
        }
    }
}
