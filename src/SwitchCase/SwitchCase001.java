// 1) Faça um código em java que permita uma pessoa escolher quantos reais ela
//deseja doar para o “Criança esperança”
//[1] para doar R$10
//[2] para doar R$20
//[3] para doar R$50
//[4] para outros valores
//[5] para cancelar
package SwitchCase;
import java.util.Scanner;

public class SwitchCase001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        byte valor = 0;
        byte opcao = 0;

        System.out.println("Bem-vindo(a) ao Instituto Criança Esperança");
        System.out.println("[1] - Doar R$10");
        System.out.println("[2] - Doar R$20");
        System.out.println("[3] - Doar R$50");
        System.out.println("[4] - Outros valores");
        System.out.println("[5] - Cancelar");
        opcao = ler.nextByte();

        switch(opcao){
            case 1:
                System.out.println("Foi doado R$10!! Muito obrigado pela construbuição");
                break;
            case 2:
                System.out.println("Foi doado R$20!! Muito obrigado pela construbuição");
                break;
            case 3:
                System.out.println("Foi doado R$50!! Muito obrigado pela construbuição");
                break;
            case 4:
                System.out.println("Digite o valor que deseja enviar: ");
                valor = ler.nextByte();
                System.out.println("Foi doado R$" + valor + "!! Muito obrigado pela construbuição");
                break;
            case 5:
                System.out.println("Cancelado, saindo");
                break;
            default:
                System.out.println("Erro! Tente novamente");
                break;
        }
    }
}
