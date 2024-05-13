<template>
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="d-block d-flex justify-content-center">
                    <div class="block__wrapper d-flex justify-content-around align-items-center">
                        <img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
                        <div class="block__data d-flex flex-column justify-content-center align-items-center">
                            <div class="carousel__titulo">Titulo 1</div>
                            <div class="carousel__sinopse">sinopse - sinopse - sinopse - sinopse - sinopse - sinopse</div>
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
                            <div class="carousel__sinopse">sinopse - sinopse - sinopse - sinopse - sinopse - sinopse</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" @click="prevSlide">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" @click="nextSlide">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
</template>

<script>
export default {
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
.block__wrapper {
    background-color: red;
    width: 50%;
}

.carousel__img {
    width: 10rem;
    margin: 1.5rem;
}

.carousel__titulo {
    color: black;
    font-family: "Inter", sans-serif;
    font-weight: bolder;
    font-size: larger;
    margin-bottom: 1rem;
}

.carousel__sinopse {
    color: black;
    font-family: "Inter", sans-serif;
    font-weight: normal;
    font-size: smaller;
}

.carousel-control-prev-icon,
.carousel-control-next-icon {
    color: black !important;
}
</style>
