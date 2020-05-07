var cart = new Vue({
	el:"#cart",
	data: {
		carts: []
	},
	created: {
		this.carts=[{"picture":"nivea/nivea.jpg","attribute":"妮维雅(NIVEA)男士净油精华抗痘洁面炭泥150ml（洗面奶 控油抗黑头）","price":0.000,"count":2},{"picture":"nivea/nivea1.jpg","attribute":"妮维雅(NIVEA)去黑头磨砂洁面乳 100g（洗面奶 去黑头 去角质 卸妆）","price":23.900,"count":2}];
	/* axios
		.post("/userCart")
		.then(function(response) {
			console.log(response);
			var data = response.data;
			var code = data.code;
			if (code == '200') {
				cart = data.data;
			} else {
				windows.location.href="/login.html";
			}
		})
		.catch(function(err){
			console.log(err);
		}); */
	}
	
});