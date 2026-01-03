//8) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
//- Se tiver 18, mostre que ele deve se alistar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.

package Condicional;
import java.util.Scanner;
import java.time.Year;
public class Condicional007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        int anoAtual = Year.now().getValue();
        int anoNascimento = 0;
        int idade = 0;
        int anosFaltando;
        int anosPassaram = 0;
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = ler.nextInt();

        idade = anoAtual-anoNascimento;

        if(idade == 18){
            System.out.println("Você já tem 18 anos, tem que se alistar");
        } else if(idade < 18) {
            anosFaltando = 18 - idade;
            System.out.println("Faltam " + anosFaltando + " para o alistamento");
        } else if(idade > 18){
            anosPassaram = idade-18;
            System.out.println("Já passaram de " + anosPassaram + " anos desde do seu alistamento");
        } else {
            System.out.println("Erro! Tente novamente mais tarde");
        }
        ler.close();
    }
}
