//7) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto
package Condicional;
import java.util.Scanner;

public class Condicional006 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // Declaração de variáveis
        String nome = "";
        String sexo;
        double valorCompras, valorDescontado = 0.0;
        // programaa principal
        System.out.println("Digite um nome: ");
        nome = ler.nextLine();

        System.out.println("Digite o seu sexo(M para masculino e F para feminino): ");
        sexo = ler.nextLine();

        System.out.println("Digite o valor das compras: ");
        valorCompras = ler.nextDouble();

        if(sexo.equals("M")){
            valorDescontado = valorCompras*0.05;
            valorCompras = valorCompras-valorDescontado;
            System.out.println("Preço com desconto: " + valorCompras);
        } else if(sexo.equals("F")){
            valorDescontado = valorCompras*0.13;
            valorCompras = valorCompras-valorDescontado;
            System.out.println("Preço com desconto: " + valorCompras);
        } else {
            System.out.println("Erro!");
        }
        ler.close();
    }
}
