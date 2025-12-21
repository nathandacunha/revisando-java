//Faça um codigo em java que peça ao usuário um número inteiro. A partir
//dessa entrada, mostre na tela: o número, seu antecessor e seu sucessor. Ex.:
//“O número informado foi 30, o antecessor é 29 e o sucessor é 31”.
import java.util.Scanner;

public class EntradaSaida007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //declaracao de variaveis
        int numero, numeroAntecessor, numeroSucessor = 0;
        System.out.println("Digite um numero: ");
        numero = ler.nextByte();

        numeroAntecessor = numero-1;
        numeroSucessor = numero+1;

        System.out.println("O numero digitado foi: " + numero);
        System.out.println("O numero sucessor foi: " + numeroSucessor);
        System.out.println("O numero antecessor foi: " + numeroAntecessor);

        ler.close();
    }
}
