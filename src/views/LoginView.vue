<script setup>
import NavBar from '../components/NavBar.vue'
import '../assets/styles/login.css'
</script>

<template>
    <NavBar></NavBar>

    <form class="container d-flex flex-column align-items-center">
        <div class="login m-5 d-flex flex-column justify-content-around align-items-center rounded-5">
            <div class="login__wraper d-flex flex-column justify-content-around ">
                <p class="login__title align-self-center">Login</p>
                <div class="form-group m-2">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control" id="inputEmail" aria-describedby="informe o email"
                        placeholder="exemplo@fonte.com" required>
                    <small id="emailHelp" class="form-text text-muted">Seu email não será compartilhado.</small>
                </div>
                <div class="form-group m-2">
                    <label for="inputPassword">Password</label>
                    <input type="password" class="form-control" id="inputPassword" placeholder="Senha"
                        required>
                </div>
                <div class="form-group form-check m-2">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>
                <div class="login__submit d-flex flex-column align-self-center">
                    <button type="submit" class="btn btn-primary border-0 m-2">Entrar</button>
                    <small id="submitHelp" class="form-text text-muted m-2">
                        Não tem uma conta? <a href="signup.html" class="cadastro-href">Cadastre-se</a>
                    </small>
                </div>
            </div>
        </div>
    </form>

</template>