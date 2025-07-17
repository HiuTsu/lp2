package filmNow;

public class CatalogoFilme {
    private Filme[] filmes;  // Agora o compilador reconhecerá Filme
    
    public CatalogoFilme() {
        this.filmes = new Filme[100];
    }
    
    public void adicionarFilme(Filme filme) {
        if (filme.posicao >= 0 && filme.posicao < filmes.length) {
            filmes[filme.posicao] = filme;
        }
    }
}