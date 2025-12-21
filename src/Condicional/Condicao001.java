//1) Faça um codigo em java que peça ao usuário para digitar um número e mostre o
//número que ele digitou somente se esse número for maior que 10.
package Condicional;
import java.util.Scanner;

public class Condicao001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        byte numero = 0;

        System.out.println("Digite um numero: ");
        numero = ler.nextByte();

        if(numero > 10){
            System.out.println("Numero digitado: " + numero);
        }
        ler.close();
    }
}
