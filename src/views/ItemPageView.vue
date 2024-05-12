<script setup>
import NavBar from '../components/NavBar.vue'
 import '../assets/styles/item-page.css'
</script>

<template>
    <section class="d-flex flex-column align-items-center">
        <NavBar></NavBar>

        <div class="frame container d-flex flex-column">
           
            <div class="frame__itempage d-flex shadow-lg mb-5 rounded">
               
                <div class="itempage card d-flex flex-row ">
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="itempage__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem da Capa">
                            <div class="itempage__text d-flex flex-column align-items-center justify-content-center m-1">
                                <h3 class="itempage_title">Coraline e o Mundo Secreto</h3>
                                <p class="itempage_date">
                                    Lançado em 13 de fevereiro de 2009 || Duração = 1h 40min
                                </p>
                                <p class="itempage_direction">
                                    Direção e Roteiro por Henry Selick
                                </p>
                                <p class="text-center">
                                    Sinopse: Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. 
                                    Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.
                                </p>

                            </div>
                        </blockquote>
                    </div>
                </div>

            

            </div>

            <div class="frame__critic m-3 shadow-lg mb-5 rounded">
                <h1 class="critic__title text-center mt-4 mb-5">Críticas à Obra</h1>

                <div class="post card">
                    <div class="card-header">
                        <h3 class="post__title text-center">Título da crítica</h3>
                        <p class="post__filmname text-center">NomeDaObra</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-1">
                                <p class="m-1">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-1" role="group"
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

                <div class="post card">
                    <div class="card-header">
                        <h3 class="post__title text-center">Título da crítica</h3>
                        <p class="post__filmname text-center">NomeDaObra</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-1">
                                <p class="m-1">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-1" role="group"
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

                <div class="post card">
                    <div class="card-header">
                        <h3 class="post__title text-center">Título da crítica</h3>
                        <p class="post__filmname text-center">NomeDaObra</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-1">
                                <p class="m-1">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-1" role="group"
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

                <div class="post card">
                    <div class="card-header">
                        <h3 class="post__title text-center">Título da crítica</h3>
                        <p class="post__filmname text-center">NomeDaObra</p>
                    </div>
                    <div class="card-body">
                        <blockquote class="blockquote mb-0 d-flex">
                            <img class="post__image m-1 align-self-center" src="../assets/images/coraline.jpg"
                                alt="Imagem do filme">

                            <div class="post__data d-flex flex-column justify-content-between m-1">
                                <p class="m-1">
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                    conteúdo - conteúdo - conteúdo - conteúdo
                                </p>

                                <div class="btn-group m-1" role="group"
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