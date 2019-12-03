<template>
  <div id="root">
	Username
	<input v-model="korisnik">
	Password
	<input v-model="sifra">
	<button onclick="alert('success')">log in</button>
	
	<hr>
	
	<h1>Registracija pacijenata</h1>
	<table>
	
	<tr>
	<td>Ime</td>
	<td><input v-model="ime"></td>
	</tr>
	<tr>
	<td>Prezime</td>
	<td><input v-model="prezime"></td>
	</tr>
	<tr>
	<td>Adresa</td>
	<td> <input v-model="adresa"></td></tr>
	<tr>
	<td> Grad</td>
	<td> <input v-model="grad"></td></tr>
	<tr> 
	<td> Drzava</td>
	<td> <input v-model="drzava"></td></tr>
	<tr>  
	<td> Br.Tel</td>
	<td>  <input v-model="brTel"></td></tr>
	<tr>  
	<td> Br.Osiguranika</td>
	<td> <input v-model="brOsiguranika"></td></tr>
	<tr>  
	<td> </td>
	<td><button onclick="alert('Sacekajte potvrdu administratora')">Registruj se</button> </td></tr>
	</table>
</div>
</template>

<script>
import axios from 'axios';
export default {

}
</script>

<style>

</style>