<template>
    <nav class="navbar">
        <div class="navbar__wrapper">
            <div>
                <button class="navbar__logo" href="">OpinArte</button>
            </div>

            <div class="navbar__search" action="">
                <button type="submit" class="navbar__search--button">
                    <input type="text" placeholder="Busque no OpinArte" name="search">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="icone navbar__search-icon" viewBox="0 0 16 16">
                        <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0"/>
                    </svg>
                </button>
            </div>
            
            <ul class="navbar__items">
                
                <li><a href="" class="navbar__item">Filmes</a></li>
                <li><a href="" class="navbar__item">Séries</a></li>
                <li><a href="" class="navbar__item">Livros</a></li>
            </ul>

            <div class="navbar__user">
                <img src="../assets/images/perfil_exemplo.jpg" alt="" class="navbar__user--picture">
            </div>

        </div>
    </nav>
</template>

<script>
import { RouterLink } from 'vue-router'
import '../assets/styles/navbar.css'

</script>