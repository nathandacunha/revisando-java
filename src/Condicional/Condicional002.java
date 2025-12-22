//2) Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
// No final informar o nome do aluno, sua média (aritmética) e se ele está aprovado ou reprovado.
package Condicional;
import java.util.Scanner;

public class Condicional002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        String nome = "";
        double nota1, nota2, nota3, media = 0.0;

        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();

        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota2 = ler.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota3 = ler.nextDouble();

        media = (nota1+nota2+nota3)/3;

        if(media >= 6.0) {
            System.out.println("Aprovado(a)!");
            System.out.println("Media: " + media);
        } else {
            System.out.println("Reprovada");
            System.out.println("Media: " + media);
        }
        ler.close();
    }
}
