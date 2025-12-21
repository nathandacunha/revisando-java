//Crie um programa que leia o número de dias trabalhados em um mês e
//mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia
//e ganha R$25 por hora trabalhada.
import java.util.Scanner;

public class EntradaSaida009 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        byte numeroDiasTrabalhados = 0;
        double salario = 0.0;
        byte horaDiarias = 8;
        byte horaTrabalhada = 25;
        int ganhoDiario = 0;
        System.out.println("Digite o numero de dias trabalhados no mes: ");
        numeroDiasTrabalhados = ler.nextByte();

        ganhoDiario = 8*25;
        salario = ganhoDiario*numeroDiasTrabalhados;

        System.out.println("Salario do funcionario: " + salario);

        ler.close();
    }
}
