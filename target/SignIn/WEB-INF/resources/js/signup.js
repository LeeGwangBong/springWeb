
$('#signUpBtn').click(function () {

    var id = $('#userId').val();
    var name = $('#userName').val();
    var nickName = $('#nickName').val();
    var pwd = $('#userPwd').val();
    var checkPwd = $('#checkPwd').val();
    var phone = $('#userPhone').val();

    if(pwd!=checkPwd) {
        alert("Passwords are not same value");
        return;
    }

    if(id == '') {
        alert("Write Id");
        return;
    }
    if(name == '') {
        alert("Write Name");
        return;
    }
    if(nickName == '') {
        alert("Write NickName");
        return;
    }
    if(pwd == '') {
        alert("Write Password");
        return;
    }
    if(checkPwd == '') {
        alert("Write Password one more time");
        return;
    }
    if(phone == '') {
        alert("Write PhoneNumber");
        return;
    }

    $.post('/signup',{
        userId: id,
        userName: name,
        nickName: nickName,
        userPwd: pwd,
        userPhone: phone
    }, function () {
       $(location).attr("href","/");
        alert("signUp Success");
    })
})