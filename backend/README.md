# OpinArte - Backend

Este módulo é dedicado a explicar sobre o que foi estipulado para o backend da aplicação e como executá-lo.

## Sobre o Backend

Foram desenvolvidas as ações necessárias para usuários(_user_), críticas(_review_) e para cada tipo de obras disponíveis para avaliação, sendo elas filmes(_movie_), livros(_book_) e séries(_serie_). 

A implementação foi realizada utilizando o modelo CRUD, que consiste em uma série de funções para leitura e manipulação do banco de dados, focando em criação(_Create_), leitura(_Read_), atualização(__Update) e exclusão(_Delete_). Como foi utilizado o framework [Spring Boot](https://spring.io/), as respectivas funções usadas foram:

* POST, para a parte de criação;
* GET, para a parte de leitura;
* PUT, para a atualização de alguma informação;
* DELETE, para a exclusão de algum item.

## Ferramentas

As seguintes ferramentas foram utilizadas para a execução e teste do backend:
* [Docker](https://www.docker.com/);
* [MySQL](https://www.mysql.com/);
* [Postman](https://www.postman.com/);
* [Spring Boot](https://spring.io/)

## Como executar o backend

Para que o backend funcione adequadamente, primeiro é necessário iniciar o banco de dados MySQL pelo [Docker](https://www.docker.com/)

```console
docker-compose up
```

Uma vez que o Docker está rodando pode-se exeutar a aplicação
```console
./mvnw spring-boot:run 
```
