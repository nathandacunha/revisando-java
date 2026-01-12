package SwitchCase;
import java.util.Scanner;

public class SwitchCase005 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // declaracao de variaveis
        byte opcao = 0;
        byte subCategoria = 0;

        while(opcao != 4){
            System.out.println("Bem-vindo ao catalogo da netflix!");
            System.out.println("---------------------------------");
            System.out.println("Qual vai ser a sua escolha de categoria?");
            System.out.println("[1] - Filmes");
            System.out.println("[2] - Séries");
            System.out.println("[3] - Documentários");
            System.out.println("[4] - Sair");
            opcao = ler.nextByte();

            switch(opcao){
                case 1:
                    System.out.println("Subcategoria - Filmes");
                    System.out.println("[1] - Suspense");
                    System.out.println("[2] - Ação");
                    System.out.println("[3] - Voltar");
                    subCategoria = ler.nextByte();

                    switch(subCategoria){
                        case 1:
                            System.out.println("Sugestão da subcategoria Suspense: ");
                            System.out.println("----------------------");
                            System.out.println("Filme: A órfã");
                            System.out.println("----------------------");
                            System.out.println("Bom filme!");
                            System.out.println("----------------------");
                            break;
                        case 2:
                            System.out.println("Sugestão da subcategoria Ação: ");
                            System.out.println("----------------------");
                            System.out.println("Filme: Batman: O Cavaleiro das Trevas");
                            System.out.println("----------------------");
                            System.out.println("Bom filme!");
                            System.out.println("----------------------");
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Erro! Tente novamente mais tarde!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Bem-vindo ao subcategoria das séries da netflix!");
                    System.out.println("[1] - Drama");
                    System.out.println("[2] - Comédia");
                    System.out.println("[3] - Voltar");
                    subCategoria = ler.nextByte();

                    switch(subCategoria){
                        case 1:
                            System.out.println("Sugestão subcategoria de séries: Drama");
                            System.out.println("----------------------");
                            System.out.println("Revenge");
                            System.out.println("----------------------");
                            System.out.println("Bom filme!");
                            System.out.println("----------------------");
                            break;
                        case 2:
                            System.out.println("Sugestão subcategoria de séries: Comédia");
                            System.out.println("----------------------");
                            System.out.println("How I met your mother" );
                            System.out.println("----------------------");
                            System.out.println("Boa série!");
                            System.out.println("----------------------");
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Erro! Tente novamente mais tarde");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Subcategoria - Documentários");
                    System.out.println("[1] - Investigação");
                    System.out.println("[2] - Ciência");
                    System.out.println("[3] - Voltar");
                    subCategoria = ler.nextByte();

                    switch(subCategoria){
                        case 1:
                            System.out.println("Sugestão subcategoria de documentários: Investigação");
                            System.out.println("----------------------");
                            System.out.println("Deep web");
                            System.out.println("----------------------");
                            System.out.println("Bom documentário!");
                            System.out.println("----------------------");
                            break;
                        case 2:
                            System.out.println("Sugestão subcategoria de documentários: Ciência");
                            System.out.println("----------------------");
                            System.out.println("Terra");
                            System.out.println("----------------------");
                            System.out.println("Bom documentário!");
                            System.out.println("----------------------");
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Erro! Tente novamente mais tarde!");
                            break;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Erro! Tente novamente mais tarde");
                    break;
            }
        }
    }
}
