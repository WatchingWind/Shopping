axios.defaults.withCredentials = true;
var GoodsAmount1= new Vue({
	el:"#shoppingCart1",
	data: {
		goodsAmount1: 0
	},
	created() {
		var that = this;
		axios
			.get("/goodsAmount")
			.then(function(response) {
				console.log(response);
				that.goodsAmount1 = response.data;
				console.log(that.goodsAmount1);
			})
			.catch(function(err){
				console.log(err);
			});
	}
	
});

var GoodsAmount2= new Vue({
	el:"#shoppingCart2",
	data: {
		goodsAmount2: 0
	},
	created() {
		var that = this;
		axios
			.get("/goodsAmount")
			.then(function(response) {
				console.log(response);
				that.goodsAmount2 = response.data;
				console.log(that.goodsAmount2);
			})
			.catch(function(err){
				console.log(err);
			});
	}
	
});