package sistemaCineTrack;

public class Filmes extends Conteudo {

    private int duracao;

    public Filmes(int id, String titulo, String genero,
                 int anoLancamento, String classificacaoIndicativa,
                 int duracao) {

        super(id, titulo, genero, anoLancamento, classificacaoIndicativa);

        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Duração: " + duracao + " minutos";
    }
}