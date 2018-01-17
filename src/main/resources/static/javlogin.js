(function() {
    $("#submit").on("click",function () {
        var username = $("#inputUsername").val();
        var password = $("#inputPassword").val();
        axios({
            url: 'loginDo',
            method: 'post',
            params: {
                username: username,
                password: password
            },
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        }).then(function (result) {
            var data = result.data;
            if(data.success) {
                location.href = data.data.url;
            } else {
                console.log(data.data.msg);
            }
        })
    })
})();