<html>
<body>
<h2>Hello World4!</h2>

<script src="./js/jquery.min.js"></script>
<script>
    $(function(){
        $(document).ready(function(){
            $.getJSON("/api/test",function(res){
                console.log(res)
                $("h2").text(res.title)
            });
        })
    })
    // 获取当前浏览器的显示率
    // 能够输出，修改显示div内容

</script>
</body>
</html>
