<script setup>
import NavBar from '../components/NavBar.vue'
import '../assets/styles/busca.css'
</script>

<template>
    <NavBar></NavBar>

    <div class="container d-flex flex-column align-items-center">
        <div class="jumbotron jumbotron-fluid m-5 rounded-4">
            <div class="container">
                <p class="display-5">
                    Resultados para:
                </p>
                <p class="busca__texto">TextoInseridoNaBarraDeBusca</p>
            </div>
        </div>

        <div class="frame m-3 d-flex flex-column">
            <div class="dropdown show m-2 align-self-end">
                <a class="btn btn-secondary dropdown-toggle border-0 rounded-5" href="#" role="button"
                    id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <font-awesome-icon :icon="['fas', 'sliders']" />
                    Filtros
                </a>

                <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                    <form class="dropdown-item d-flex flex-column">
                        <div class="form-group row m-1">
                            <select class="custom-select">
                                <option value="">Selecione uma opção</option>
                                <option value="1">Ação</option>
                                <option value="2">Aventura</option>
                                <option value="3">Cinema de arte</option>
                                <option value="4">Chanchada</option>
                                <option value="5">Comédia</option>
                                <option value="6">Comédia de ação</option>
                                <option value="7">Comédia de terror</option>
                                <option value="8">Comédia dramática</option>
                                <option value="9">Comédia romântica</option>
                                <option value="10">Dança</option>
                                <option value="11">Documentário</option>
                                <option value="12">Docuficção</option>
                                <option value="13">Drama</option>
                                <option value="14">Espionagem</option>
                                <option value="15">Faroeste</option>
                                <option value="16">Fantasia</option>
                                <option value="17">Fantasia científica</option>
                                <option value="18">Ficção científica</option>
                                <option value="19">Filmes com truques</option>
                                <option value="21">Filmes de guerra</option>
                                <option value="22">Mistério</option>
                                <option value="23">Musical</option>
                                <option value="24">Filme policial</option>
                                <option value="25">Romance</option>
                                <option value="26">Terror</option>
                                <option value="27">Thriller</option>
                            </select>
                        </div>
                        <div class="form-group row m-1">
                            <select class="custom-select">
                                <option value="">Tipo de obra</option>
                                <option value="1">Filme</option>
                                <option value="2">Série</option>
                                <option value="3">Livro</option>
                            </select>
                        </div>
                        <div class="form-group row m-1">
                            <select class="custom-select">
                                <option value="">Classificação
                                indicativa</option>
                                <option value="1">Livre</option>
                                <option value="2">Não recomendado para menores de 10 (dez) anos</option>
                                <option value="3">Não recomendado para menores de 12 (doze) anos</option>
                                <option value="4">Não recomendado para menores de 14 (quatorze) anos</option>
                                <option value="5">Não recomendado para menores de 16 (dezesseis) anos</option>
                                <option value="6">Não recomendado para menores de 18 (dezoito) anos</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary mb-2">Buscar</button>
                    </form>
                </div>
            </div>

            <div class="result__wrapper m-2 d-flex flex-wrap justify-content-center align-items-center">

                <div class="result card m-2">
                    <div class="card-body d-flex justify-content-center align-items-center">
                        <a href="/item-page">
                            <img class="result__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">
                        </a>

                        <div class="result__data m-1">
                            <ul class="list-group">
                                <li class="list-group-item">
                                    Título: <p class="outputNomeDaObra">NomeDaObra</p>
                                </li>
                                <li class="list-group-item">
                                    Data: <p class="outputData">mm/aaaa</p>
                                </li>
                                <li class="list-group-item">
                                    Autor: <p class="outputNomeAutor">NomeAutor</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="result card m-2">
                    <div class="card-body d-flex justify-content-center align-items-center">
                        <a href="/item-page">
                            <img class="result__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">
                        </a>

                        <div class="result__data m-1">
                            <ul class="list-group">
                                <li class="list-group-item">
                                    Título: <p class="outputNomeDaObra">NomeDaObra</p>
                                </li>
                                <li class="list-group-item">
                                    Data: <p class="outputData">mm/aaaa</p>
                                </li>
                                <li class="list-group-item">
                                    Autor: <p class="outputNomeAutor">NomeAutor</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="result card m-2">
                    <div class="card-body d-flex justify-content-center align-items-center">
                        <a href="/item-page">
                            <img class="result__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">
                        </a>

                        <div class="result__data m-1">
                            <ul class="list-group">
                                <li class="list-group-item">
                                    Título: <p class="outputNomeDaObra">NomeDaObra</p>
                                </li>
                                <li class="list-group-item">
                                    Data: <p class="outputData">mm/aaaa</p>
                                </li>
                                <li class="list-group-item">
                                    Autor: <p class="outputNomeAutor">NomeAutor</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="result card m-2">
                    <div class="card-body d-flex justify-content-center align-items-center">
                        <a href="/item-page">
                            <img class="result__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">
                        </a>

                        <div class="result__data m-1">
                            <ul class="list-group">
                                <li class="list-group-item">
                                    Título: <p class="outputNomeDaObra">NomeDaObra</p>
                                </li>
                                <li class="list-group-item">
                                    Data: <p class="outputData">mm/aaaa</p>
                                </li>
                                <li class="list-group-item">
                                    Autor: <p class="outputNomeAutor">NomeAutor</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="result card m-2">
                    <div class="card-body d-flex justify-content-center align-items-center">
                        <a href="/item-page">
                            <img class="result__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">
                        </a>

                        <div class="result__data m-1">
                            <ul class="list-group">
                                <li class="list-group-item">
                                    Título: <p class="outputNomeDaObra">NomeDaObra</p>
                                </li>
                                <li class="list-group-item">
                                    Data: <p class="outputData">mm/aaaa</p>
                                </li>
                                <li class="list-group-item">
                                    Autor: <p class="outputNomeAutor">NomeAutor</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</template>