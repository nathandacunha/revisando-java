// 4) Faça um codigo em java que calcule e mostre o IMC de uma pessoa, a partir
//de seu peso e altura. Sabe-se que o cálculo do IMC é dado por: peso dividido
//pela altura ao quadrado.
import java.util.Scanner;

public class EntradaSaida004 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        double imc = 0.0;
        double peso;
        double altura;

        System.out.println("Digite a sua altura: ");
        altura = ler.nextDouble();

        System.out.println("Digite o seu peso: ");
        peso = ler.nextDouble();

        imc = peso/(altura*altura);

        System.out.println("O valor do imc é de: " + imc);
        ler.close();
    }
}
