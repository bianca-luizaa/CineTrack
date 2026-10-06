package sistemaCineTrack;

public class Temporada {

    private int id;
    private int numero;
    private int quantidadeEpisodios;

    public Temporada(int id, int numero, int quantidadeEpisodios) {

        this.id = id;
        this.numero = numero;
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Temporada: " + numero +
                " | Episódios: " + quantidadeEpisodios;
    }
}