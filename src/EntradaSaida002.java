// Faça um codigo em java que peça ao usuário para ele informar seu nome e
//sua idade e mostre “Seu nome é fulano e sua idade é X”

import java.util.Scanner;

public class EntradaSaida002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        String nome = "";
        byte idade = 0;

        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = ler.nextByte();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
        ler.close();
    }
}
