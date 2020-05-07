//登录页面
var loginIn = new Vue({
	el:"#loginVue",
	data:{
		userName: "",
		password: "",
		show: false
	},
	methods: {
		sub(){
			axios.get('/login',{
				params: {
					uId:this.userName,
					password:this.password
				},
				header:{}
			})
			.then(function(response) {
				var data = response.data;  //response 返回中没有body属性
				console.log(data);
				var code = data.code;
				if (code == '200') {
					window.location.href='/';
				} else {
					this.show = true;
				}
			})
			.catch(function(error) {
				console.log(error);
			});
		}
	}
});