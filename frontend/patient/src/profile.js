Vue.component("patient-profile", {
	template: `
<div>

	<label>Ime:</label>
	<input name="ime" type="text" v-bind:disabled="mode==null" /> <br />
	<label>Prezime:</label>
	<input type="text" v-bind:disabled="mode==null" /> <br />
	<label>Adresa:</label>
	<input type="text" v-bind:disabled="mode==null" /> <br />
	<label>Grad:</label>
	<input type="text" v-bind:disabled="mode==null" /> <br />
	<label>Drzava:</label>
	<input type="text" v-bind:disabled="mode==null" /> <br />
	<label>Broj Telefona:</label>
	<input type="text" v-bind:disabled="mode==null" /> <br />
	<label>Broj osiguranika:</label>
	<input type="text" v-bind:disabled="mode==null" /> <br />

	<button v-on:click="editPatient" v-bind:disabled="edit==null">Edit</button><br />
	
</div>		  
`

});