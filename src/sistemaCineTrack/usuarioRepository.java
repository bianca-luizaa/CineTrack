package sistemaCineTrack;

import sistemaCineTrack.Usuario;

import java.util.ArrayList;

public class usuarioRepository {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // CREATE
    public void inserir(Usuario usuario) {
        usuarios.add(usuario);
    }

    // READ
    public Usuario buscarPorId(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    // UPDATE
    public boolean atualizar(int id, String nome, String email) {

        Usuario usuario = buscarPorId(id);

        if (usuario != null) {

            usuario.setNome(nome);
            usuario.setEmail(email);

            return true;
        }

        return false;
    }

    // DELETE
    public boolean remover(int id) {

        Usuario usuario = buscarPorId(id);

        if (usuario != null) {

            usuarios.remove(usuario);

            return true;
        }

        return false;
    }

    public ArrayList<Usuario> listarTodos() {
        return usuarios;
    }
}