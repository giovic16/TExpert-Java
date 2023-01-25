// modules/jokes.js

export default {
    namespaced: true,
    state: {
        data: '',
    },
    getters: {
        data: (state) => state.data,
    },
    actions: {
        async getData({ commit }) {
            const data = await fetch('https://api.chucknorris.io/jokes/random')
            commit('SET_DATA', await data.json())
        },
    },
    mutations: {
        SET_DATA(state, data) {
            state.data = data
        },
    },
}
