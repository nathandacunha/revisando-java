//Faça um codigo em java que peça para o usuário digitar dois número inteiros.
//Compare o primeiro número com o segundo. Se o primeiro número for menor
//que o segundo, incremente-o até os dois serem iguais. Caso o primeiro
//número seja maior que o segundo, decremente até serem iguais.
package EnquantoWhile;
import java.util.Scanner;

public class While002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //declaracao de variaveis
        int numero1, numero2 = 0;

        System.out.println("Digite o primeiro numero inteiro: ");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        numero2 = ler.nextInt();

        if(numero1 <= numero2) {
            while(numero1 <= numero2){
                System.out.println(numero1);
                numero1++;
            }
        } else if(numero1 >= numero2){
            while(numero1 >= numero2){
                System.out.println(numero1);
                numero1--;
            }
        }
    }
}
