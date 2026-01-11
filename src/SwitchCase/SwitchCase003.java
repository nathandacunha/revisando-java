//3) Faça um código em java que solicite ao usuário o código de um produto e informe
//sua descrição e valor, de acordo com a tabela a seguir:
//
//Código Descrição e valor
//1254 Sanduíche de presunto - R$8
//5698 Churros - R$3,50
//7114 Suco de laranja que parece de limão mas tem gosto de tamarindo
//
//- R$5,00
package SwitchCase;
import java.util.Scanner;

public class SwitchCase003 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int codigoProduto = 0;
        System.out.println("Digite o código do produto: ");
        codigoProduto = ler.nextInt();

        if(codigoProduto == 1254){
            System.out.println("Sanduiche de Presunto - R$8");
        } else if(codigoProduto == 5698){
            System.out.println("Churros - R$3,50");
        } else if(codigoProduto == 7114){
            System.out.println("Suco de laranja que parece limão mas tem gosto de tamarindo - R$5");
        } else {
            System.out.println("Erro! Tente novamente");
        }
    }
}
