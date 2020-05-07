var cart = new Vue({
		el:"#cart",
		data: {
			carts: []
		},
		created() {
			var that = this;
		axios
			.post("/userCart")
			.then(function(response) {
				console.log(response);
				let resData = response.data;
				console.log("res.data",resData);
				let code = resData.code;
				if (code == '200') {
					console.log("code",code);
					console.log("list",resData.data);
					that.carts = resData.data;
					console.log(that.carts);
					
				} else {
					window.location.href="/login.html";
				}
			})
			.catch(function(err){
				console.log(err);
			});
		},
		computed: {
			total: function() {
				let totalCount = 0;
				for (let i = 0; i < this.carts.length; i++) {
					console.log("price",this.carts[i].price);
					totalCount += this.carts[i].price * this.carts[i].count;
				}
				return totalCount;
			}
		},
		methods: {
			delGoods: function(index,uId,pId) {
				let del = new FormData();
				del.append("uId",uId);
				del.append("pId",pId);
				axios
					.post("/delGoods",del)
					.then(function(response) {
						console.log(response);
					})
					.catch(function(err){
						console.log(err);
					});
				this.carts.splice(index,1);
			},
			increment: function(index) {
				this.carts[index].count++;
				let changeData = new FormData();
				changeData.append("uId", this.carts[index].uId);
				changeData.append("pId", this.carts[index].pId);
				changeData.append("num", this.carts[index].count);
				console.log(changeData);
				axios
					.post("/updateCount",changeData)
					.then(function(response) {
						console.log(response);
					})
					.catch(function(err){
						console.log(err);
					});
			},
			decrement: function(index) {
				this.carts[index].count--;
				let changeData = new FormData();
				changeData.append("uId", this.carts[index].uId);
				console.log(this.carts[index].uId);
				changeData.append("pId", this.carts[index].pId);
				changeData.append("num", this.carts[index].count);
				console.log(changeData);
				axios
					.post("/updateCount",changeData)
					.then(function(response) {
						console.log(response);
					})
					.catch(function(err){
						console.log(err);
					});
			}
		}
	});