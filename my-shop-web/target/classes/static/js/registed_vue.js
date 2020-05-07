var register = new Vue({
	el: "#register",
	data: {
		userName: "",
		password: "",
		email: "",
		show: false
	},
	methods:{
		reg: function() {
			var that = this;
			let regData = new FormData();
			regData.append("uId", this.userName);
			regData.append("password", this.password);
			regData.append("email", this.email);
			axios
				.post("/register",regData)
				.then(function(response) {
					console.log(response);
					var data = response.data;
					var code = data.code;
					if (code == '200') {
						window.location.href='/index.html';
					} else {
						that.show = true;
					}
				})
				.catch(function(err){
					console.log(err);
				});
		}
	}
})