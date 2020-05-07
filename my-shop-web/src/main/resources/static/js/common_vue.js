//公共页面处理
Vue.component('page-header', {
	props: ['title'],
	data: function() {
		return {
			client_support: false,
			imrSrc: ""
		}
	},
	template: '<div id="top"><div class="Inside_pages"><div class="Collection">下午好，欢迎光临锦宏颜！<em></em><a @click="addFavorite2">收藏我们</a></div><div class="hd_top_manu clearfix" id="header"><ul class="clearfix"><li class="hd_menu_tit zhuce" data-addclass="hd_menu_hover">欢迎光临本店！<a href="login.html" class="red">[请登录]</a>新用户<a href="registered.html" class="red">[免费注册]</a></li><li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="Order_payment.html">我的订单</a></li><li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="Cart.html">购物车</a></li><li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="contactUs.html" target="_blank">联系我们</a></li><li class="hd_menu_tit list_name" data-addclass="hd_menu_hover"><a href="#" class="hd_menu">客户服务</a><div class="hd_menu_list"><ul><li><a href="help.html">常见问题</a></li><li><a href="#">在线退换货</a></li><li><a href="#">在线投诉</a></li><li><a href="#">配送范围</a></li></ul></div></li><li class="hd_menu_tit phone_c" data-addclass="hd_menu_hover"><a href="#" class="hd_menu "><em class="iconfont icon-shouji"></em>手机版</a><div class="hd_menu_list erweima"><ul><img :src="imgSrc" width="100px" height="100" v-if="client_support" /><span class="index-header" v-if="!client_support" >暂不支持</span></ul></div></li></ul></div></div></div>'
	,
	methods: {
		addFavorite2: function() {
			var url = window.location;
			var title = document.title;
			var ua = navigator.userAgent.toLowerCase();
			if (ua.indexOf("360se") > -1) {
				alert("由于360浏览器功能限制，请按 Ctrl+D 手动收藏！");
			} else if (ua.indexOf("msie 8") > -1) {
				window.external.AddToFavoritesBar(url, title); //IE8
			} else if (document.all) {
				try {
					window.external.addFavorite(url, title);
				} catch (e) {
					alert('您的浏览器不支持,请按 Ctrl+D 手动收藏!');
				}
			} else if (window.sidebar) {
				window.sidebar.addPanel(title, url, "");
			} else {
				alert('您的浏览器不支持,请按 Ctrl+D 手动收藏!');
			}
		}
	}
});

const headTop = new Vue({
    el:"#header_top",
    data: {
    }
});



//搜索页面
/*
const search = new Vue({
	el:"#search",  //各实例不要有相同的前缀
	data: {
		defVal: "洗面奶",
		keyWord: ""
	},
	methods:{
		search: function() {
			var inputVal = this.$refs.searchValue.value.trim();
			if (inputVal == '' || inputVal == undefined || inputVal == null) {
				this.keyWord = this.defVal;
			} else {
				this.keyWord = inputVal;
			}
			console.log(this.keyWord);
			window.location.href = 'search/keepVal?keyWord='+ this.keyWord;
		}	
	}
});
*/





