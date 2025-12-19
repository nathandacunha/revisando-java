// Escrever um algoritmo que leia o nome de um aluno e as notas das três
//provas que ele obteve no semestre. No final informar o nome do aluno e a
//sua média (aritmética).
import java.util.Scanner;

public class EntradaSaida003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        String nome = "";
        double nota1, nota2, nota3, media = 0;

        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();

        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota2 = ler.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota3 = ler.nextDouble();

        // Calculo da media do aluno(a)
        media = (nota1+nota2+nota3)/3;

        System.out.println("A media de notas do aluno(a) " + nome + " é de " + media);

        ler.close();
    }
}