//4) A prefeitura de “Pedra Lisa” decidiu implantar um sistema de rodízio de veículos,
//e lhe solicitou um algoritmo em que o usuário informe o último número da placa de
//seu carro, para que o programa possa informar que dia da semana esse carro não
//pode ir às ruas, seguindo a tabela abaixo:
package SwitchCase;
import java.util.Scanner;

public class SwitchCase004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        byte numeroPlaca = 0;
        System.out.println("Digite o último número da placa do seu carro: ");
        numeroPlaca = ler.nextByte();

        // usando if-else
        if(numeroPlaca == 0 || numeroPlaca == 5){
            System.out.println("Não pode dirigir nas segundas-feiras");
        } else if(numeroPlaca == 1 || numeroPlaca == 6){
            System.out.println("Não pode dirigir nas terças-feiras");
        } else if(numeroPlaca == 2 || numeroPlaca == 7){
            System.out.println("Não pode dirigir nas quartas-feiras");
        } else if(numeroPlaca == 3 || numeroPlaca == 8) {
            System.out.println("Não pode dirigir nas quintas-feiras");
        // usando switch-case
        switch(numeroPlaca){
            case 0:

        }       } else if(numeroPlaca == 4 || numeroPlaca == 9){
            System.out.println("Não pode dirigir nas sextas-feiras");
        } else {
            System.out.println("Erro! Tente novamente mais tarde");
        }
    }
}