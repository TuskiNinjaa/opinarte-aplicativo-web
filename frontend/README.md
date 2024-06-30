# OpinArte - Frontend

Este módulo é dedicado a explicar sobre o que foi estipulado para o frontend da aplicação e como executá-lo.

## Sobre o Frontend

Foram definidas 6 (seis) páginas para a aplicação OpinArte, sendo descrito nos itens abaixo:

* _Home_: tela de início, que mostra as obras disponíveis e já cadastradas;
* _Página do Item_: tela específica de cada obra (livro, série ou filme), com as informações básicas  e críticas já cadastradas acerca da obra;
* _Página de Login_: tela para realizar o login na aplicação e acessar o perfil já cadastrado do usúario;
* _Página de Cadastro_: tela responsável para cadastrar na aplicação um usuário novo;
* _Página de Perfil_: tela com as informações do usuário cadastrado, que inclui os dados básicos do usuário, como foto de perfil, nome, e-mail e data de aniversário, sendo possível acessar as críticas adicionadas pelo usuário e adicionar uma nova obra não cadastrada na aplicação;
* _Página de Buscas_: tela que possibilita a busca por uma obra específica. 

## Ferramentas

As seguintes ferramentas foram utilizadas para a execução do frontend:
* [Node.js](https://nodejs.org/)
* [Vue.js](https://vuejs.org/), 
* [Vite](https://vitejs.dev/), 
* [Spring Boot](https://spring.io/)

## Como executar o frontend

### Configuração de IDE recomendada  

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (e desabilite Vetur).

### Configuração Customizada

Veja [Vite Configuration Reference](https://vitejs.dev/config/).

### Configuração do Projeto

```sh
npm install
```

Adicionando ícones Font Awesome e Bootstrap

```sh
npm install bootstrap
npm i --save @fortawesome/fontawesome-svg-core
npm i --save @fortawesome/free-solid-svg-icons
npm i --save @fortawesome/vue-fontawesome
```

#### Compilar e Recarregar para Desenvolvimento

```sh
npm run dev
```

#### Compilar e Reduzir para Produção

```sh
npm run build
```
