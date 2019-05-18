var vue = new Vue({
    el:'#app',
    data:{
        userlist:[]
    },
    methods:{//查询所有
        findAll:function () {
            var _this=this;//this代表是vue对象
            axios.get("./user/findAll").then(function (response) {
                var userList = response.data();
            })
        },
        created:function () {
            this.findAll();
        }
    }
	
})