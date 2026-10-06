package sistemaCineTrack;

import sistemaCineTrack.Filmes;
import sistemaCineTrack.Series;
import sistemaCineTrack.Conteudo;
import sistemaCineTrack.Usuario;

import sistemaCineTrack.ConteudoRepository;
import sistemaCineTrack.usuarioRepository;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConteudoRepository conteudoRepository =
                new ConteudoRepository();

        usuarioRepository usuarioRepository =
                new usuarioRepository();

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("       🎬 CINETRACK 🎬");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Cadastrar série");
            System.out.println("3 - Listar conteúdos");
            System.out.println("4 - Buscar conteúdo");
            System.out.println("5 - Atualizar conteúdo");
            System.out.println("6 - Remover conteúdo");
            System.out.println("7 - Cadastrar usuário");
            System.out.println("8 - Listar usuários");
            System.out.println("9 - Buscar usuário");
            System.out.println("10 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.println("==============================");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {

                // =========================
                // CADASTRAR FILME
                // =========================

                case 1:

                    System.out.println("\n--- CADASTRAR FILME ---");

                    System.out.print("ID: ");
                    int idFilme = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String tituloFilme = scanner.nextLine();

                    System.out.print("Gênero: ");
                    String generoFilme = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int anoFilme = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Classificação indicativa: ");
                    String classificacaoFilme = scanner.nextLine();

                    System.out.print("Duração em minutos: ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();

                    Filmes filme = new Filmes(
                            idFilme,
                            tituloFilme,
                            generoFilme,
                            anoFilme,
                            classificacaoFilme,
                            duracao
                    );

                    conteudoRepository.inserir(filme);

                    System.out.println("\nFilme cadastrado com sucesso!");

                    break;


                // =========================
                // CADASTRAR SÉRIE
                // =========================

                case 2:

                    System.out.println("\n--- CADASTRAR SÉRIE ---");

                    System.out.print("ID: ");
                    int idSerie = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String tituloSerie = scanner.nextLine();

                    System.out.print("Gênero: ");
                    String generoSerie = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int anoSerie = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Classificação indicativa: ");
                    String classificacaoSerie = scanner.nextLine();

                    System.out.print("Quantidade de temporadas: ");
                    int temporadas = scanner.nextInt();
                    scanner.nextLine();

                    Series serie = new Series(
                            idSerie,
                            tituloSerie,
                            generoSerie,
                            anoSerie,
                            classificacaoSerie,
                            temporadas
                    );

                    conteudoRepository.inserir(serie);

                    System.out.println("\nSérie cadastrada com sucesso!");

                    break;


                // =========================
                // LISTAR CONTEÚDOS
                // =========================

                case 3:

                    System.out.println("\n--- CONTEÚDOS CADASTRADOS ---");

                    if (conteudoRepository.listarTodos().isEmpty()) {

                        System.out.println("Nenhum conteúdo cadastrado.");

                    } else {

                        for (Conteudo conteudo :
                                conteudoRepository.listarTodos()) {

                            System.out.println(conteudo);
                        }
                    }

                    break;


                // =========================
                // BUSCAR CONTEÚDO
                // =========================

                case 4:

                    System.out.println("\n--- BUSCAR CONTEÚDO ---");

                    System.out.print("Digite o ID: ");
                    int idBusca = scanner.nextInt();
                    scanner.nextLine();

                    Conteudo encontrado =
                            conteudoRepository.buscarPorId(idBusca);

                    if (encontrado != null) {

                        System.out.println("\nConteúdo encontrado:");
                        System.out.println(encontrado);

                    } else {

                        System.out.println("\nConteúdo não encontrado.");
                    }

                    break;


                // =========================
                // ATUALIZAR CONTEÚDO
                // =========================

                case 5:

                    System.out.println("\n--- ATUALIZAR CONTEÚDO ---");

                    System.out.print("Digite o ID: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    Conteudo conteudoAtualizar =
                            conteudoRepository.buscarPorId(idAtualizar);

                    if (conteudoAtualizar != null) {

                        System.out.print("Novo título: ");
                        String novoTitulo = scanner.nextLine();

                        System.out.print("Novo gênero: ");
                        String novoGenero = scanner.nextLine();

                        System.out.print("Novo ano: ");
                        int novoAno = scanner.nextInt();
                        scanner.nextLine();

                        conteudoRepository.atualizar(
                                idAtualizar,
                                novoTitulo,
                                novoGenero,
                                novoAno
                        );

                        System.out.println(
                                "\nConteúdo atualizado com sucesso!"
                        );

                    } else {

                        System.out.println("\nConteúdo não encontrado.");
                    }

                    break;


                // =========================
                // REMOVER CONTEÚDO
                // =========================

                case 6:

                    System.out.println("\n--- REMOVER CONTEÚDO ---");

                    System.out.print("Digite o ID: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean removido =
                            conteudoRepository.remover(idRemover);

                    if (removido) {

                        System.out.println(
                                "\nConteúdo removido com sucesso!"
                        );

                    } else {

                        System.out.println(
                                "\nConteúdo não encontrado."
                        );
                    }

                    break;


                // =========================
                // CADASTRAR USUÁRIO
                // =========================

                case 7:

                    System.out.println("\n--- CADASTRAR USUÁRIO ---");

                    System.out.print("ID: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Usuario usuario = new Usuario(
                            idUsuario,
                            nome,
                            email,
                            senha
                    );

                    usuarioRepository.inserir(usuario);

                    System.out.println(
                            "\nUsuário cadastrado com sucesso!"
                    );

                    break;


                // =========================
                // LISTAR USUÁRIOS
                // =========================

                case 8:

                    System.out.println("\n--- USUÁRIOS ---");

                    if (usuarioRepository.listarTodos().isEmpty()) {

                        System.out.println(
                                "Nenhum usuário cadastrado."
                        );

                    } else {

                        for (Usuario u :
                                usuarioRepository.listarTodos()) {

                            System.out.println(u);
                        }
                    }

                    break;


                // =========================
                // BUSCAR USUÁRIO
                // =========================

                case 9:

                    System.out.println("\n--- BUSCAR USUÁRIO ---");

                    System.out.print("Digite o ID: ");
                    int idUsuarioBusca = scanner.nextInt();
                    scanner.nextLine();

                    Usuario usuarioEncontrado =
                            usuarioRepository.buscarPorId(idUsuarioBusca);

                    if (usuarioEncontrado != null) {

                        System.out.println(
                                "\nUsuário encontrado:"
                        );

                        System.out.println(usuarioEncontrado);

                    } else {

                        System.out.println(
                                "\nUsuário não encontrado."
                        );
                    }

                    break;


                // =========================
                // REMOVER USUÁRIO
                // =========================

                case 10:

                    System.out.println("\n--- REMOVER USUÁRIO ---");

                    System.out.print("Digite o ID: ");
                    int idUsuarioRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean usuarioRemovido =
                            usuarioRepository.remover(
                                    idUsuarioRemover
                            );

                    if (usuarioRemovido) {

                        System.out.println(
                                "\nUsuário removido com sucesso!"
                        );

                    } else {

                        System.out.println(
                                "\nUsuário não encontrado."
                        );
                    }

                    break;


                case 0:

                    System.out.println(
                            "\nEncerrando o CineTrack..."
                    );

                    break;


                default:

                    System.out.println(
                            "\nOpção inválida!"
                    );
            }

        } while (opcao != 0);

        scanner.close();
    }
}
