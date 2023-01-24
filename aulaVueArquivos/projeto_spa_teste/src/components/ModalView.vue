<template>
    <div>
        <!-- Inicio Modal !-->
            <!-- Modal -->
            <div class="modal fade" id="modalVue" tabindex="-1" aria-labelledby="modalVueLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="modalVueLabel">Modal title</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
                </div>
            </div>
            </div>
        <!-- Fim Modal !-->
    </div>
</template>

<script>
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap.js'
const bootstrap = require('bootstrap')

export default {
    name: 'ModalView',
    methods: {
        abreModal(){
            var modal = new bootstrap.Modal(document.querySelector('#modalVue'),{
                keyboard:false
            })
            return modal
        }   
    },
    mounted() {
        this.abreModal().show()
    }
}
</script>