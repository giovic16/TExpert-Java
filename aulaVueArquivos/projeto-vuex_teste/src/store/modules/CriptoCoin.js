// modules/crypto.js

export default {
    namespaced: true,
    state: {
        data: {},
    },
    getters: {
        data: state => state.data,
    },
    actions: {
        async getData({commit }) {
            // const data = await fetch('https://api.coincap.io/v2/rates/bitcoin')
            const data = await fetch('https://api.coincap.io/v2/markets')
            
            commit('SET_DATA', await data.json());
        },
    },
    mutations: {
        SET_DATA(state, data) {
            state.data = data;
        },
    }
}

