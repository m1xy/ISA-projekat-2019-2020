<template>
  <div id="app">
    <LoginForm />
    <RegForm />
  </div>
</template>

<script>
import LoginForm from './components/LoginForm'
import RegForm from './components/RegForm'

export default {
  name: 'app',
  components: {
    LoginForm,
    RegForm
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
