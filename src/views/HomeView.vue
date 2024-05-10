<script setup>
import NavBar from '../components/NavBar.vue'
import Carousel from '../components/Carousel.vue'
import '../assets/styles/home.css'
</script>

<template>
	<main class="conatiner">
		<NavBar></NavBar>
		<Carousel></Carousel>

		<section class="categoria">
            <div class="categoria__item">
                <button class="button__capa" href=""> 
                    <img class="categoria__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                </button>
                <div class="categoria__item-titulo">Filmes</div>
            </div>
            <div class="categoria__item">
				<button class="button__capa" href=""> 
                    <img class="categoria__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                </button>
                <div class="categoria__item-titulo">Séries</div>
            </div>
            <div class="categoria__item">
                <button class="button__capa" href=""> 
                    <img class="categoria__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                </button>
                <div class="categoria__item-titulo">Livros</div>
            </div>
        </section>

        <section class="conteudo">
            <div class="conteudo__titulo">Explorar</div>

            <div class="conteudo__linha">
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
            </div>
    
            <div class="conteudo__linha">
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
            </div>
    
            <div class="conteudo__linha">
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
            </div>
    
            <div class="conteudo__linha">
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
                <div class="conteudo__item">
                    <button class="button__capa" href=""> 
                        <img class="conteudo__item-img" src="../assets/images/coraline.jpg" alt="Imagem Capa">
                    </button>
                    <div class="conteudo__item-titulo">Título</div>
                </div>
            </div>
        </section>
	</main>
</template>

<style scoped>
.container {
    position: relative;
	
}
</style>
