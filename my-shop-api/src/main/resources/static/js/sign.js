				var loginIn = new Vue({
        			el: "#signIn",
        			data: {
        			user: "",
        			password: "",
        		    viewMsg : ""
        			},
        			methods: {
        				signIn: function(){
        					/*var mes = {
        					phone : this.user,
        					password : this.password
        				    };*/

        				    let mes = new FormData();
                            mes.append("phone",this.user);
                            mes.append("password",this.password);
                        //发送post请求
                            console.log(mes);
        					this.$http.post('/login/signIn',mes).then(function(res){
        					    var resData = res.body;
        					    console.log(resData);
        					   var state = resData.state;
        					    var msg = resData.msg;
        					    console.log(state);
        						if(state == "2"){
        						        /* console.log(msg); */
                                        window.location.href="/html/sign/list.html";
        						}else{
                                       alert(msg);
        						}
        					},function(){
        						console.log('请求失败处理');
        					});
        				}
        			}
        		});