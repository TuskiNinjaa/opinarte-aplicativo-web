<script setup>
import NavBar from '../components/NavBar.vue'
import '../assets/styles/perfil.css'
</script>

<template>
    <section class="d-flex flex-column align-items-center">
        <NavBar></NavBar>

        <div class="frame container-fluid d-flex justify-content-around">

            <div class="frame__profile d-flex flex-column">

                <div class="profile d-flex flex-column m-3">
                    <p class="profile__title m-2">Dados do usuário:</p>
                    <img class="profile__image align-self-center m-2" src="../assets/images/perfil_exemplo.jpg"
                        alt="Imagem do perfil">

                    <form class="profile__form m-2">
                        <div class="form-group row m-2">
                            <label for="userInputName" class="col-sm-2 col-form-label">Nome</label>
                            <div class="col-sm-10">
                                <input type="text" readonly class="form-control-plaintext" id="userInputName"
                                    value="SeuNome">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="userInputEmail" class="col-sm-2 col-form-label">Email</label>
                            <div class="col-sm-10">
                                <input type="text" readonly class="form-control-plaintext" id="userInputEmail"
                                    value="email@example.com">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="userInputPassword" class="col-sm-2 col-form-label">Senha</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control-plaintext" id="userInputPassword"
                                    placeholder="*****">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="userInputDate" class="col-sm-2 col-form-label">Data de aniversário</label>
                            <div class="col-sm-10">
                                <input type="date" class="form-control-plaintext" id="userInputDate" placeholder="">
                            </div>
                        </div>
                    </form>

                    <div class="profile__button m-2">
                        <div class="btn-group d-flex align-items-center justify-content-around" role="group"
                            aria-label="Basic example">
                            <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">Trocar senha</button>
                            <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">Atualizar
                                dados</button>
                        </div>
                    </div>
                </div>

                <div class="addartwork m-3">
                    <p class="addartwork__title m-2">Adicione uma Obra:</p>
                    <form class="profile__form m-2">
                        <div class="form-group row m-2">
                            <label for="artInputName" class="col-sm-2 col-form-label">Nome da obra</label>
                            <div class="col-sm-10">
                                <input type="text" readonly class="form-control-plaintext" id="artInputName"
                                    value="NomeDaObra">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="inputDate" class="col-sm-2 col-form-label">Data de lançamento</label>
                            <div class="col-sm-10">
                                <input type="date" class="form-control-plaintext" id="artInputDate" placeholder="">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="artInputAuthor" class="col-sm-2 col-form-label">Autor</label>
                            <div class="col-sm-10">
                                <input type="text" readonly class="form-control-plaintext" id="artInputAuthor"
                                    value="NomeAutor">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="artInputPublisher" class="col-sm-2 col-form-label">Editora</label>
                            <div class="col-sm-10">
                                <input type="text" readonly class="form-control-plaintext" id="artInputPublisher"
                                    value="NomeEditora">
                            </div>
                        </div>
                        <div class="form-group row m-2">
                            <label for="artInputImage" class="col-sm-2 col-form-label">Imagem da Obra</label>
                            <div class="col-sm-10">
                                <input type="file" class="form-control-file" id="artInputImage">
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <div class="frame__critic m-3">

                <div class="post card m-3">
                    <div class="card-header">
                        <p class="post__title">Título da crítica</p>
                        <p class="post__filmname">NomeDoFilme</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-2 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-2">
                                <p class="m-2">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-2" role="group"
                                    aria-label="Basic example">
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'thumbs-up']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'thumbs-down']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'comment']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'pen']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'up-right-from-square']" />
                                    </button>
                                </div>
                            </div>
                        </blockquote>
                    </div>
                </div>

                <div class="post card m-3">
                    <div class="card-header">
                        <p class="post__title">Título da crítica</p>
                        <p class="post__filmname">NomeDoFilme</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-2 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-2">
                                <p class="m-2">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-2" role="group"
                                    aria-label="Basic example">
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'thumbs-up']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'thumbs-down']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'comment']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'pen']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'up-right-from-square']" />
                                    </button>
                                </div>
                            </div>
                        </blockquote>
                    </div>
                </div>

                <div class="post card m-3">
                    <div class="card-header">
                        <p class="post__title">Título da crítica</p>
                        <p class="post__filmname">NomeDoFilme</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-2 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-2">
                                <p class="m-2">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-2" role="group"
                                    aria-label="Basic example">
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'thumbs-up']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'thumbs-down']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'comment']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'pen']" />
                                    </button>
                                    <button type="button" class="btn btn-secondary m-1 rounded-5 border-0">
                                        <font-awesome-icon :icon="['fas', 'up-right-from-square']" />
                                    </button>
                                </div>
                            </div>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </section>
</template>