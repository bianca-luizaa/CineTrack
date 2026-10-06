package sistemaCineTrack;

import sistemaCineTrack.Conteudo;

import java.util.ArrayList;

public class ConteudoRepository {

    private ArrayList<Conteudo> conteudos = new ArrayList<>();

    // CREATE
    public void inserir(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    // READ
    public Conteudo buscarPorId(int id) {

        for (Conteudo conteudo : conteudos) {

            if (conteudo.getId() == id) {
                return conteudo;
            }
        }

        return null;
    }

    // UPDATE
    public boolean atualizar(int id, String titulo,
                             String genero, int ano) {

        Conteudo conteudo = buscarPorId(id);

        if (conteudo != null) {

            conteudo.setTitulo(titulo);
            conteudo.setGenero(genero);
            conteudo.setAnoLancamento(ano);

            return true;
        }

        return false;
    }

    // DELETE
    public boolean remover(int id) {

        Conteudo conteudo = buscarPorId(id);

        if (conteudo != null) {

            conteudos.remove(conteudo);

            return true;
        }

        return false;
    }

    // LISTAR
    public ArrayList<Conteudo> listarTodos() {
        return conteudos;
    }
}
