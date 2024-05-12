<template>
    <nav class="navbar navbar-expand-lg justify-content-between align-items-center">
        <div class="container">
            <a class="navbar__brand navbar-brand" href="./">Opinarte</a>

            <form class="navbar__search form-inline d-flex rounded-5 justify-content-around align-items-center">
                <input class="navbar__search--input form-control mr-sm-2 rounded-5 border-0" type="search" placeholder="Busque no OpinArte"
                    aria-label="Search">
                <button class="navbar__search--button btn my-2 my-sm-0 rounded-5" type="submit">
                    <font-awesome-icon :icon="['fas', 'magnifying-glass']" />
                </button>
            </form>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                <ul class="navbar__nav navbar-nav justify-content-between">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Filmes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Séries</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Livros</a>
                    </li>
                    <li class="navbar__user nav-item">
                        <a class="nav-link" href="./perfil">
                            <img src="../assets/images/perfil_exemplo.jpg" alt="" class="navbar__user--picture  rounded-5">
                        </a>
                    </li>
                </ul>
            </div>

        </div>
    </nav>

</template>

<script>
import { RouterLink } from 'vue-router'
import '../assets/styles/navbar.css'
</script>