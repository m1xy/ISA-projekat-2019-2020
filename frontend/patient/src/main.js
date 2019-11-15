const PatientHome = { template: '<patient-home></patient-home>' }
const PatientProfile = { template: '<patient-profile></patient-profile>' }

const router = new VueRouter({
	mode: 'hash',
	routes: [
		{ path: '/', component: PatientHome },
		{ path: '/profile', component: PatientProfile }
	]
});

var app = new Vue({
	router,
	el: '#patientHome'
});

