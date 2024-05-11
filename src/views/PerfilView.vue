<script setup>
import NavBar from '../components/NavBar.vue'
import '../assets/styles/perfil.css'
</script>

<template>
    <section class="d-flex flex-column align-items-center">
        <NavBar></NavBar>

        <div class="container-fluid d-flex justify-content-between">

            <div class="container-fluid d-flex flex-column">

                <div class="profile d-flex flex-column">
                    <img class="profile__image" src="../img/galo.jpg" alt="Imagem do perfil">

                    <div class="profile__info">
                        <h1>Dados do usuário:</h1>
                        <form action="" method="get" class="form">
                            <label for="">Nome: <input type="text" name="" id="" placeholder="SeuNome" disabled></label>
                            <label for="">Email: <input type="text" name="" id="" placeholder="SeuEmail"
                                    disabled></label>
                            <label for="">Data de aniverário: <input type="date" name="" id="" disabled></label>
                        </form>
                        <div class="profile__button">
                            <button>Trocar senha</button><button>Atualizar dados</button>
                        </div>

                    </div>
                </div>

                <div class="addartwork">
                    <h1>Adicione uma obra:</h1>
                    <div class="addartwork__middle">
                        <input class="addartwork__image" type="image" src="../img/coraline.jpg" alt="">

                        <form class=" addartwork__form" action="">
                            <label for="">Nome do file:</label>
                            <input type="text" name="" id="" placeholder="NomeFilme">
                            <label for="">Ano:</label>
                            <input type="text" name="" id="" placeholder="AnoFilme" disabled>
                            <label for="">Autores:</label>
                            <input type="text" name="" id="" placeholder="AutoresFilme" disabled>
                            <label for="">Resenha do filme:</label>
                            <input type="text" name="" id="" placeholder="ResenhaFilme" disabled>
                            <label for="">Editora:</label>
                            <input type="text" name="" id="" placeholder="EditoraFilme" disabled>
                        </form>
                    </div>
                    <div class="addartwork__button">
                        <button>Trocar senha</button>
                    </div>
                </div>
            </div>


            <div class="critic">
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
                <div class="critic__post">sample</div>
            </div>
        </div>
        <!--

        <section class="critic">
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <div class="critic__post">sample</div>
            <i class="fa-solid fa-magn
    </section>ifying-glass fa-1x"></i>
 -->
    </section>
</template>