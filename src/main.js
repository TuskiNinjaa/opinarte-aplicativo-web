import { createApp } from 'vue'
import App from './App.vue'
import VueCarousel from '@chenfengyuan/vue-carousel';
import router from './router'
import 'bootstrap/dist/css/bootstrap.css'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faMagnifyingGlass, faThumbsUp, faThumbsDown, faComment, faPen, faUpRightFromSquare } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

const app = createApp(App)
library.add(faMagnifyingGlass, faThumbsUp, faThumbsDown, faComment, faPen, faUpRightFromSquare)
app.component('font-awesome-icon', FontAwesomeIcon)
app.component(VueCarousel.name, VueCarousel);

app.use(router)
app.mount('#app')