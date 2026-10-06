# sistemaCineTrack

# Equipe
Bianca Luiza da Silva
Isabella Ramos do Amaral
Lays Vitória Alvez Sampaio

## Qual será a proposta do sistema?
O CineTrack será um sistema desenvolvido em Java para organizar filmes e séries que os usuários desejam assistir, estão assistindo ou já finalizaram.
A plataforma permitirá cadastrar títulos, registrar avaliações, acompanhar o progresso das séries e organizar uma lista pessoal de conteúdos.
A ideia é funcionar como uma espécie de catálogo pessoal de entretenimento, reunindo informações que normalmente ficam espalhadas entre aplicativos de streaming, anotações e listas.

## Funcionalidades do sistema
O que o CineTrack poderá fazer?

Cadastro de filmes e séries
Registrar título, gênero, ano de lançamento, classificação indicativa e sinopse.

Minha Watchlist
Adicionar conteúdos que deseja assistir futuramente.

Avaliações pessoais
Dar notas aos filmes e séries assistidos e registrar comentários.

Acompanhamento de séries
Registrar temporadas e episódios assistidos.

Pesquisa e filtros
Buscar conteúdos por título, gênero, ano ou situação de visualização.

## Conceitos de Programação Orientada a Obejtos
Aplicação dos conceitos no projeto
Conceito	                          Aplicação no CineTrack
Classes e objetos	                  Representar filmes, séries, usuários e avaliações.
Atributos	                          Armazenar título, gênero, ano, duração e status.
Métodos	                              Cadastrar, pesquisar, avaliar e atualizar conteúdos.
Encapsulamento	                      Proteger os dados e controlar alterações.
Herança	                              Reutilizar características de Conteudo em Filme e Serie.
Polimorfismo	                      Exibir informações de filmes e séries de formas diferentes.
Abstração	                          Modelar somente os dados e comportamentos necessários ao sistema.

## Princípais Classes
Conteudo: 
Classe abstrata que reúne informações comuns a filmes e séries, como título, gênero e ano de lançamento.

Filme: 
Representa os filmes cadastrados, armazenando informações como duração e diretor.

Serie: 
Representa as séries, organizando informações sobre temporadas e status de lançamento.

Temporada:
Representa uma temporada de uma série e reúne seus episódios.

Episodio:
Armazena informações de cada episódio, como título, duração e status de visualização.

Usuario:
Representa quem utiliza o sistema para organizar e avaliar seus conteúdos.

Avaliacao:
Registra a nota e o comentário do usuário sobre um filme ou série.

Watchlist:
Organiza os conteúdos que o usuário deseja assistir, está assistindo ou já finalizou.

# Funcionalidades do Projeto CineTrack

O CineTrack será um sistema para cadastrar, organizar e acompanhar filmes e séries, permitindo que o usuário gerencie seus conteúdos favoritos e seu progresso de visualização.

### Principais funcionalidades

Cadastrar conteúdos: 
Adicionar filmes e séries com informações como título, gênero, ano de lançamento e sinopse.

Consultar conteúdos: 
Visualizar os filmes e séries cadastrados no sistema.

Pesquisar e filtrar: 
Localizar conteúdos pelo título, gênero ou tipo.

Gerenciar watchlist:
Adicionar ou remover conteúdos da lista pessoal.

Atualizar status: 
Marcar conteúdos como “Quero assistir”, “Assistindo” ou “Finalizado”.

Acompanhar séries: 
Organizar temporadas e episódios, registrando o progresso de visualização.

Avaliar conteúdos:
Atribuir notas e escrever comentários sobre filmes e séries.

Editar e excluir registros: 
Modificar informações ou remover conteúdos cadastrados.

Consultar avaliações: 
Visualizar as notas e os comentários registrados pelo usuário.

Exibir informações: 
Apresentar os detalhes de cada filme ou série de forma organizada.
