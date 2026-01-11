//2) Faça um codigo que calcule o reajuste de salário de um funcionário
//conforme o número de dependentes. Pergunte o nome, salário atual e o número de
//dependentes, sendo que:
//1 - Nenhum dependente: 5% de aumento
//2 - 1 a 3 dependentes: 10% de aumento
//3 - 4 a 6 dependentes: 15% de aumento
//4 - Mais dependentes: 20% de aumento
//E retorne o salário atual do funcionário.
package SwitchCase;
import java.util.Scanner;

public class SwitchCase002 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        byte opcao = 0;
        String nome = "";
        double salarioAtual, salarioReajustado,salarioReajuste = 0.0;
        byte numeroDependentes = 0;

        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite o seu salário atual: ");
        salarioAtual = ler.nextDouble();

        System.out.println("Confirme o número de dependentes abaixo: ");
        System.out.println("[1] - Nenhum dependente: 5% de aumento");
        System.out.println("[2] - 1 a 3 dependentes: 10% de aumento");
        System.out.println("[3] - 4 a 6 dependente: 15% de aumento");
        System.out.println("[4] - Mais dependentes: 20% de aumento");
        opcao = ler.nextByte();

        switch(opcao){
            case 1:
                salarioReajuste = salarioAtual*0.05;
                salarioReajustado = salarioReajuste+salarioAtual;
                System.out.println("O salario foi ajustado para: " + salarioReajustado);
                break;
            case 2:
                salarioReajuste = salarioAtual*0.10;
                salarioReajustado = salarioReajuste+salarioAtual;
                System.out.println("O salario foi ajustado para: " + salarioReajustado);
                break;
            case 3:
                salarioReajuste = salarioAtual*0.15;
                salarioReajustado = salarioReajuste+salarioAtual;
                System.out.println("O salario foi ajustado para: " + salarioReajustado);
                break;
            case 4:
                salarioReajuste = salarioAtual*0.20;
                salarioReajustado = salarioReajuste+salarioAtual;
                System.out.println("O salario foi ajustado para: " + salarioReajustado);
                break;
            default:
                System.out.println("Erro! Tente novamente mais tarde");
                break;
        }
    }
}
