import './assets//styles/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import VueCarousel from '@chenfengyuan/vue-carousel';
import router from './router'

const app = createApp(App)

app.use(router)
app.component(VueCarousel.name, VueCarousel);

app.mount('#app')