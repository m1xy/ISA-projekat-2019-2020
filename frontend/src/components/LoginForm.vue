<template>
<div>
<b-card>
  <b-form inline>
    <label class="sr-only" for="inline-form-input-email">Email</label>
    <b-input
      id="inline-form-input-email"
      class="mb-2 mr-sm-2 mb-sm-0"
	  v-model="form.email"
      type="email"
      placeholder="Email"
    ></b-input>

    <label class="sr-only" for="inline-form-input-password">Password</label>
    <b-input-group class="mb-2 mr-sm-2 mb-sm-0">
      <b-input 
	  id="inline-form-input-password"
	  v-model ="form.sifra"
	  placeholder="password"
	  ></b-input>
    </b-input-group>

    <b-form-checkbox class="mb-2 mr-sm-2 mb-sm-0">Remember me</b-form-checkbox>

    <b-button variant="primary">Login</b-button>
  </b-form>
</b-card>

  



    
</div>
</template>

<script>
export default {
		data() {
      return {
        form: {
		  email: '',
		  sifra: ''
		}
      }
    }
}
</script>

<style>

</style>