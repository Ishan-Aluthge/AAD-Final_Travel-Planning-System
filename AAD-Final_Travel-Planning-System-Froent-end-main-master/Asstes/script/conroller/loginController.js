export class Login {
    constructor() {
        $("#btnlogin").click((event) => {
            event.preventDefault(); // Prevents the default behavior (e.g., page reload)
            this.loginAction();
        });
    }

    loginAction() {
        var loginreq = {
            "email": $('#loginemail').val(),
            "password": $('#loginpassword').val()
        };
        console.log(loginreq);
        $.ajax({
            url: "http://localhost:8080/api/v1/login",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify(loginreq),
            success: function (resp) {
                console.log(resp);
                var type=resp.role;

                //saveKey(type,token)
                console.log(resp.code)
                ob.loginFunction(type);
                alertify.success('Login Success');

            },
            error: function (jqXHR, textStatus, error) {
                console.log(e.responseJSON.message)
                alertify.error('Login Error');
            }
        });


    };
    loginFunction(data){
        let ua = $.inArray('User_Admin', data);
        let uh = $.inArray('Hotel_Admin', data);
        let uv = $.inArray('Vehicle_Admin', data);
        let ug = $.inArray('Guide_Admin', data);
        let utp = $.inArray('TP_Admin', data);
        console.log(data);
    }


}

var ob = new Login();

