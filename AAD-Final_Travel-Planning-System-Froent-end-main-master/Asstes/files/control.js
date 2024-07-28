$("#login").css("display","block");
$("#dashboard").css("display","none");

document.getElementById("loginbtn").addEventListener('click',function (){
    $("#login").css("display","none");
    $("#dashboard").css("display","block");
});
