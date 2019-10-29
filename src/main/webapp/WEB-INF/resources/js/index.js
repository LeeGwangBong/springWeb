$(document).ready(function() {
    alert("test");
});
$('#signInBtn').click(function () {
    var id = $('#userId').val();
    var pwd = $('#userPwd').val();

    $.get('/signin',{
        userId: id,
        userPwd: pwd
    }, function (result) {
        if(result != "{\"result\":true}"){
            alert("로그인에 실패했습니다");
        }else{
            $(location).attr("href","/main");
        }
    });
});