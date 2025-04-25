
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAlexandria sistema = new SistemaAlexandria();

        int opcao;
        do {
            System.out.println("\nBem-vindo à Biblioteca Alexandria! Escolha uma das opções abaixo:");
            System.out.println("1. Ver nossos livros maravilhosos");
            System.out.println("2. Emprestar um livro (seja rápido!)");
            System.out.println("3. Sair e deixar os livros por hoje");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    sistema.listarLivros();
                    break;
                case 2:
                    sistema.emprestarLivro(scanner);
                    break;
                case 3:
                    System.out.println("Saindo... Volte logo para pegar mais livros e aventuras!");
                    break;
                default:
                    System.out.println("Ops! Você digitou uma opção que não existe. Vamos tentar de novo!");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
