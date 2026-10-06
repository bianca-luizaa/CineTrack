package sistemaCineTrack;

public class Episodio {

    private int id;
    private String titulo;
    private int numero;
    private int duracao;

    public Episodio(int id, String titulo, int numero, int duracao) {

        this.id = id;
        this.titulo = titulo;
        this.numero = numero;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Episódio: " + titulo +
                " | Número: " + numero +
                " | Duração: " + duracao + " minutos";
    }
}