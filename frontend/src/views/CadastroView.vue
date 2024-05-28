<script setup>
import NavBar from '../components/NavBar.vue'
import '../assets/styles/login-cadastro.css'
</script>

<template>
    <NavBar></NavBar>

    <form class="container d-flex flex-column align-items-center">
        <div class="window__cadastro m-5 d-flex flex-column justify-content-around align-items-center rounded-5">
            <div class="window__wraper d-flex flex-column justify-content-around ">
                <p class="window__title align-self-center">Cadastro</p>

                <div class="form-group m-2">
                    <label for="inputName">Nome</label>
                    <input type="text" class="form-control" id="inputName" placeholder="Seu nome aqui" required>
                </div>

                <div class="form-group m-2">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control" id="inputEmail" aria-describedby="informe o email"
                        placeholder="exemplo@fonte.com" required>
                    <small id="emailHelp" class="form-text text-muted">Seu email não será compartilhado.</small>
                </div>

                <div class="form-group m-2">
                    <label for="inputDate">Data de aniversário</label>
                    <input type="date" class="form-control" id="inputDate" placeholder="">
                </div>

                <div class="form-group m-2">
                    <label for="inputPassword">Senha</label>
                    <input type="password" class="form-control" id="inputPassword" placeholder="Senha" required>
                </div>

                <div class="window__submit d-flex flex-column align-self-center">
                    <button type="submit" class="btn btn-primary border-0 m-2">Entrar</button>
                    <small id="submitHelp" class="form-text text-muted m-2">
                        Não tem uma conta? <a href="/cadastro" class="cadastro-href">Cadastre-se</a>
                    </small>
                </div>
            </div>
        </div>
    </form>

</template>