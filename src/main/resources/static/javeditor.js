(function() {
    $("#submit").on("click",function () {
        var title = $("#InputTitle").val();
        var subTitle = $("#InputSubTitle").val();
        var article = testEditor.getMarkdown();
        var tags = ["001", "002"];

        var blog = {
            blogId: 0,
            blogTitle: title,
            blogAuthor: 'jcxu',
            blogPublishtime: new Date(),
            blogBannerurl: '',
            blogIntroduction: '',
            blogStatus: '01',
            blogType: '01',
            blogSubtitle: subTitle,
            blogContent: article,
            tags: tags
        };

        axios.post("saveBlog", blog)
            .then(function (result) {
                var data = result.data;
                if(data.success) {
                    console.log(data.msg);
                } else {
                    console.log(data.msg);
                }
            })

    })
})();