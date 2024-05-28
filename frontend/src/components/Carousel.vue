<template>
    <div id="carousel" class="carousel slide">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="d-block d-flex justify-content-center">
                    <div class="block__wrapper d-flex justify-content-around align-items-center">
                        <img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
                        <div class="block__data d-flex flex-column justify-content-center align-items-center">
                            <div class="carousel__titulo">Titulo 1</div>
                            <div class="carousel__sinopse">Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="d-block d-flex justify-content-center">
                    <div class="block__wrapper d-flex justify-content-around align-items-center">
                        <img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
                        <div class="block__data d-flex flex-column justify-content-center align-items-center">
                            <div class="carousel__titulo">Titulo 2</div>
                            <div class="carousel__sinopse">Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.</div>
                        </div>
                    </div>
                </div>
            </div>
			<div class="carousel-item">
                <div class="d-block d-flex justify-content-center">
                    <div class="block__wrapper d-flex justify-content-around align-items-center">
                        <img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
                        <div class="block__data d-flex flex-column justify-content-center align-items-center">
                            <div class="carousel__titulo">Titulo 3</div>
                            <div class="carousel__sinopse">Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" @click="prevSlide">
			<span class="carousel-control-prev-icon" aria-hidden="true">
				<div class="icon__left">
					<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="#259172" class="bi bi-arrow-left-circle-fill" viewBox="0 0 16 16">
						<path d="M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0m3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5z"/>
					</svg>
				</div>
			</span>
			<span class="visually-hidden">Previous</span>
		</button>

		<button class="carousel-control-next" type="button" @click="nextSlide">
			<span class="carousel-control-next-icon" aria-hidden="true">
				<div class="icon__right">
					<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="#259172" class="bi bi-arrow-right-circle-fill" viewBox="0 0 16 16">
						<path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0M4.5 7.5a.5.5 0 0 0 0 1h5.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5z"/>
					</svg>
				</div>
			</span>
			<span class="visually-hidden">Next</span>
		</button>

    </div>
</template>

<script>
import '../assets/styles/base.css'

export default {
	mounted() {
		const carousel = document.getElementById('carousel');
		const instance = new bootstrap.Carousel(carousel, {
			interval: false
		});
	},
	methods: {
		nextSlide() {
			const carousel = document.getElementById('carousel');
			const instance = new bootstrap.Carousel(carousel);
			instance.next();
		},
		prevSlide() {
			const carousel = document.getElementById('carousel');
			const instance = new bootstrap.Carousel(carousel);
			instance.prev();
		}
	}
}
</script>


<style>

.carousel {
    background-color: #D4EFE6;
    width: 100vw;
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden;
}

.block__wrapper {
    width: 80%;
}

.carousel__img {
    width: 15rem;
    margin: 1.5rem;
}

.carousel__titulo {
    color: black;
    font-family: "Inter", sans-serif;
    font-weight: bolder;
    font-size: 25px;
    margin-bottom: .5rem;
}

.carousel__sinopse {
    color: black;
    font-family: "Inter", sans-serif;
    font-weight: normal;
    font-size: --opinarte-font-size-medium;
	text-align: center;
	max-width: 400px; /* Defina a largura máxima desejada */
  	overflow: hidden;
  	text-overflow: ellipsis; /* Adicione reticências para indicar texto truncado */
}

.carousel-control-prev-icon,
.carousel-control-next-icon {
    color: black !important;
}
</style>
