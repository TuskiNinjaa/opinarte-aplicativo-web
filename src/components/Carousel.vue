<template>
    <section class="carousel">
        <div class="icon__left">
            <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="#259172" class="bi bi-arrow-left-circle-fill" viewBox="0 0 16 16">
                <path d="M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0m3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5z"/>
            </svg>
        </div>

        <img class="carousel__img" src="../assets/images/coraline.jpg" alt="Imagem Capa">

        <div class="carousel__info">
            <div class="carousel__info-titulo">Título da Obra</div>
            <div class="carousel__info-conteudo">Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.</div>
        </div>

        <div class="icon__right">
            <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="#259172" class="bi bi-arrow-right-circle-fill" viewBox="0 0 16 16">
                <path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0M4.5 7.5a.5.5 0 0 0 0 1h5.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5z"/>
            </svg>
        </div>
    </section>
</template>


<style>
.carousel {
    background-color: #D4EFE6;
    width: 100vw;
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden;
}

.carousel__wrapper {
    display: flex;
    flex-direction: row;
}

.carousel__img {
    width: 10rem;
    margin: 1.5rem;
}

.carousel__info {
    margin: 1.5rem;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
}

.carousel__info-titulo {
    font-family: "Inter", sans-serif;
    font-weight: bolder;
    font-size: larger;
    margin-bottom: 1rem;
}

.carousel__info-conteudo {
    font-family: "Inter", sans-serif;
    font-weight: normal;
    font-size: smaller;
    text-align: justify;
    width: 18rem;
}

</style>
