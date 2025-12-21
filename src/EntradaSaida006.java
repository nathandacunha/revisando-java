//Faça um pseudocódigo que solicite o nome e a data de nascimento de uma
//pessoa e mostre na tela a mensagem “Seu nome é fulano e você nasceu em
//10/10/1000”.
import java.util.Scanner;

public class EntradaSaida006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, dataNascimento;

        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite a sua data de nascimento(DD/DD/DDDD): ");
        dataNascimento = ler.nextLine();

        System.out.println("Você é " + nome + " e nasceu em " + dataNascimento);
        ler.close();
    }
}
