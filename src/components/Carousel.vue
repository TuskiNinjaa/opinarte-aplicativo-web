<template>
  <div id="carousel" class="carousel slide">
    <div class="carousel-inner">
		<div class="carousel-item active">
			<div class="carousel__wrapper">
				<div class="col-md-6">
					<img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
				</div>
				<div class="col-md-6">
					<div class="carousel-caption d-none d-md-block">
						<div class="carousel__titulo">First slide label</div>
						<div class="carousel__sinopse">Some representative placeholder content for the first slide.</div>	
					</div>
				</div>
			</div>
		</div>
		<div class="carousel-item">
			<div class="carousel__wrapper">
				<div class="col-md-6">
					<img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
				</div>
				<div class="col-md-6">
					<div class="carousel-caption d-none d-md-block">
						<div class="carousel__titulo">Second slide label</div>
						<div class="carousel__sinopse">Some representative placeholder content for the second slide.</div>
					</div>
				</div>
			</div>
		</div>
		<div class="carousel-item">
			<div class="carousel__wrapper">
				<div class="col-md-6">
					<img src="../assets/images/coraline.jpg" class="carousel__img" alt="...">
				</div>
				<div class="col-md-6">
					<div class="carousel-caption d-none d-md-block">
						<div class="carousel__titulo">Third slide label</div>
						<div class="carousel__sinopse">Some representative placeholder content for the third slide.</div>
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
	margin: 0 auto;
	max-width: 80%;
	align-items: center;
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
