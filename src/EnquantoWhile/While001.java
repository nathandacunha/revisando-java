// Faça um codigo em java que peça para o usuário digitar um número. Em
//seguida, o computador deve gerar um número randômico de 0 até 10 usando
//randi() até que o número randômico gerado seja igual número informado pelo
//usuário.
package EnquantoWhile;
import java.util.Random;
import java.util.Scanner;

public class While001 {
    public static void main(String[] args){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);

        // declaracao de varaiveis
        byte numero = 0;

        System.out.println("Digite um numero de zero a dez: ");
        numero = ler.nextByte();

        for (int i = 0; i <= numero; i++){
            while(i != numero){
                i = gerador.nextInt(11);
                System.out.println(i);

                if(i == numero) {
                    System.out.println("Numero encontrado! ");
                    System.out.println(i);
                    break;
                }
            }
            break;
        }
    }
}