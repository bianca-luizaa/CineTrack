package sistemaCineTrack;

public class Series extends Conteudo {

    private int quantidadeTemporadas;

    public Series(int id, String titulo, String genero,
                 int anoLancamento, String classificacaoIndicativa,
                 int quantidadeTemporadas) {

        super(id, titulo, genero, anoLancamento, classificacaoIndicativa);

        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public int getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public void setQuantidadeTemporadas(int quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Temporadas: " + quantidadeTemporadas;
    }
}