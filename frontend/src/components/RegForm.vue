<template>
  <div class = col-4 >
    <b-card>
	<b-form @submit="onSubmit" @reset="onReset" v-if="show">
      
	  <b-form-group id="input-group-1" label="Tvoje ime:" label-for="input-1">
        <b-form-input
          id="input-2"
          v-model="form.name"
          required
          placeholder="Unesi ime"
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-2" label="Troje prezime:" label-for="input-2">
        <b-form-input
		  class = "mb-2 mr-sm-2 mb-sm-0"
          id="input-2"
          v-model="form.surname"
          required
          placeholder="Unesi prezime"
        ></b-form-input>
      </b-form-group>

	  <b-form-group id="input-group-3" label="Your Adresa:" label-for="input-3">
        <b-form-input
          id="input-3"
          v-model="form.adresa"
          required
          placeholder="Enter Adresa"
        ></b-form-input>
      </b-form-group>

	  <b-form-group id="input-group-4" label="Your Grad:" label-for="input-4">
        <b-form-input
          id="input-4"
          v-model="form.grad"
          required
          placeholder="Enter Grad"
        ></b-form-input>
      </b-form-group>

	  <b-form-group id="input-group-5" label="Your Drzava:" label-for="input-5">
        <b-form-input
          id="input-5"
          v-model="form.drzava"
          required
          placeholder="Enter Drzava"
        ></b-form-input>
      </b-form-group>

	  <b-form-group id="input-group-6" label="Your broj Tel:" label-for="input-6">
        <b-form-input
          id="input-6"
          v-model="form.brTel"
          required
          placeholder="Enter Drzava"
        ></b-form-input>
      </b-form-group>

	  <b-form-group id="input-group-7" label="Your Drzava:" label-for="input-7">
        <b-form-input
          id="input-7"
          v-model="form.brOsig"
          required
          placeholder="Enter Drzava"
        ></b-form-input>
      </b-form-group>


	  <b-form-group
        id="input-group-10"
        label="Email address:"
        label-for="input-10"
        description="We'll never share your email with anyone else."
      >
        <b-form-input
          id="input-10"
          v-model="form.email"
          type="email"
          required
          placeholder="Enter email"
        ></b-form-input>
      </b-form-group>

	  <b-form-group id="input-group-8" label="Your sifra:" label-for="input-8">
        <b-form-input
          id="input-8"
          v-model="form.sifra"
          required
          placeholder="Enter Sifru"
        ></b-form-input>
      </b-form-group>



      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>
    </b-form>
	</b-card>
    <b-card class="mt-3" header="Provera">
      <pre class="m-0">{{ form }}</pre>
    </b-card>
  </div>
</template>

<script>
export default {
	data() {
      return {
        form: {
		  name: '',
		  surname: '',
		  adresa: '',
		  grad: '',
		  drzava: '',
		  brTel: '',
		  brOsig: '',
		  email: '',
		  sifra: ''
		},
		show: true
      }
    },
    methods: {
      onSubmit(evt) {
        evt.preventDefault()
        alert(JSON.stringify(this.form))
      },
      onReset(evt) {
        evt.preventDefault()
		// Reset our form values
		this.form.name = ''
		this.form.surname=''
		this.form.adresa=''
		this.form.grad=''
		this.form.drzava=''
		this.form.brTel=''
		this.form.brOsig=''
		this.form.email = ''
		this.form.sifra = ''
        // Trick to reset/clear native browser form validation state
        this.show = false
        this.$nextTick(() => {
          this.show = true
        })
      }
    }
}
</script>

<style>

</style>