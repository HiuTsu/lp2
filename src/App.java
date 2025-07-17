import java.util.Scanner;
import filmNow.Filme;
import filmNow.CatalogoFilme;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        CatalogoFilme catalogo = new CatalogoFilme();  // Crie uma instância do catálogo
        
        System.out.println("(A) Adicionar Filme \n(M) Mostrar todos\n(D) Detalhar Filmes\n(S) Sair");
        String opcao = ler.nextLine();
        
        if(opcao.equals("A")) {
            Filme filme = new Filme();
            System.out.print("Posição> ");
            filme.posicao = ler.nextInt();
            ler.nextLine();
            System.out.print("Nome> ");
            filme.nome = ler.nextLine();
            System.out.print("Ano> ");
            filme.ano = ler.nextInt();
            ler.nextLine();
            System.out.print("Local> ");
            filme.local = ler.nextLine();
            
            catalogo.adicionarFilme(filme);  // Chame na INSTÂNCIA
            System.out.println("Filme armazenado na posição " + filme.posicao);
        }
        ler.close();
    }
}