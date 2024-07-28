$("#login").click(function () {
    event.preventDefault();
    var loginreq = {
        "email": $('#loginemail').val(),
        "password": $('#loginpassword').val()
    };
    console.log(loginreq);
    $.ajax({
        url: "http://localhost:8081/api/v1/user",
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify(loginreq),
        success: function (resp) {
            alert(resp.email);
            console.log(resp);
        },
        error: function (jqXHR, textStatus, error) {
            alert(textStatus);
        }
    });
    console.log("Ended");
});


