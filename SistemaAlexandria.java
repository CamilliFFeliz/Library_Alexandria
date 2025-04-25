
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlexandria {

    private ArrayList<Livro> livros = new ArrayList<>();

    public SistemaAlexandria() {
        livros.add(new Livro("O Senhor dos Livros", "J.R.R. Bookin"));
        livros.add(new Livro("1984: O Retorno da Dystopia", "George Orwizzle"));
        livros.add(new Livro("Dom Casmurrinho", "Machado de Risos"));
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Oops, parece que a Alexandria está vazia! Vamos preencher com mais livros!");
        } else {
            System.out.println("\nBem-vindo à Biblioteca Alexandria! Aqui estão nossos livros:");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("\nLivro " + (i + 1) + ":");
                livros.get(i).exibirInformacoes();
            }
        }
    }

    public void emprestarLivro(Scanner scanner) {
        System.out.print("Escolha um livro para emprestar, número por favor: ");
        int numeroLivro = scanner.nextInt() - 1;
        scanner.nextLine();

        if (numeroLivro >= 0 && numeroLivro < livros.size()) {
            Livro livro = livros.get(numeroLivro);

            if (livro.getStatus() == StatusLivro.DISPONIVEL) {
                livro.setStatus(StatusLivro.EMPRESTADO);
                System.out.println("Yay! Você agora é o novo detentor de " + livro.getTitulo() + "!");
            } else {
                System.out.println("Ah não! Esse livro já foi pego por outro leitor. Tente outro.");
            }
        } else {
            System.out.println("Ops, número de livro inválido! Tente novamente com um número correto.");
        }
    }
}
