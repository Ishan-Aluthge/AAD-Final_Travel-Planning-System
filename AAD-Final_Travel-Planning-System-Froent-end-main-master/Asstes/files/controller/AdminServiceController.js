// $("#login").click(function () {
//     var loginreq = {
//         "email": $('#loginemail').val(),
//         "password": $('#loginpassword').val()
//     };
//     console.log(loginreq);
//     $.ajax({
//         url: "http://localhost:8081/api/v1/admin/login",
//         method: "POST",
//         contentType: "application/json",
//         data: JSON.stringify(loginreq),
//         success: function (resp) {
//                 console.log(resp);
//             $(".login-form-container").hide();
//             let type = resp.type;
//             if (type === "Hotel Admin") {
//                 $("#dashboard").show();
//             } else if (type === "Guide Admin") {
//                 $("#guide").show();
//             } else {
//                 console.log("It's neither a hotel nor a guide.");
//             }
//
//         },
//         error: function (jqXHR, textStatus, error) {
//             alert(textStatus);
//         }
//     });
//     console.log("Ended");
// });

 $("#login").click(function () {
     $(".login-form-container").hide();
     $("#guide").show();
 });
$("#register").click(function (e) {
    console.log("Start")
    e.preventDefault();
    var formData = new FormData();
    formData.append("fullName", $("#fullName").val());
    formData.append("email", $("#email").val());
    formData.append("contact1", $("#contact1").val());
    formData.append("birthday", $("#birthday").val());
    formData.append("gender", $('input[name="gender"]:checked').val());
    formData.append("address", $("#address").val());
    formData.append("nicNo", $("#nicNo").val());
    formData.append("profilePic", $("#profilePic")[0].files[0]);
    formData.append("nicFront", $("#nicFront")[0].files[0]);
    formData.append("nicRear", $("#nicRear")[0].files[0]);
    formData.append("userName", $("#userName").val());
    formData.append("password", $("#password").val());
    formData.append("type",$("#type").val());
    console.log(formData);
    console.log(formData.get('birthday'));

    $.ajax({
        url: "http://localhost:8081/api/v1/admin",
        type: "POST",
        data: formData,
        processData: false,
        contentType: false,
        success: function (data) {
            $(".register-form-container").hide();
            $(".login-form-container").show();
        },
        error: function () {
            console.log("Error occurred.");
        }
    });
});