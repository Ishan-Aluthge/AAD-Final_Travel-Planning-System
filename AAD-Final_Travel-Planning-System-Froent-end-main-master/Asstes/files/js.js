let searchbtn = document.querySelector('#search-btn');
let searchbar = document.querySelector('.search-bar-container');
let formbtn = document.querySelector('#login-btn');
let loginform = document.querySelector('.login-form-container');
let formclose = document.querySelector('#form-close');
let menu = document.querySelector('#menu');
let navbar = document.querySelector('.navbar');
let videobtn = document.querySelectorAll('.vid-btn');

window.onscroll = () =>{
    searchbtn.classList.remove('fa-times');
    searchbar.classList.remove('active');
    menu.classList.remove('fa-times');
    navbar.classList.remove('active');
    loginform.classList.remove('active');
}

searchbtn.addEventListener('click', () => {
    searchbtn.classList.toggle('fa-times');
    searchbar.classList.toggle('active');
});

menu.addEventListener('click', () => {
    menu.classList.toggle('fa-times');
    navbar.classList.toggle('active');
});

formbtn.addEventListener('click', () => {
    loginform.classList.add('active');
});
formclose.addEventListener('click', () => {
    loginform.classList.remove('active');
});

videobtn.forEach(btn =>{
    btn.addEventListener('click',()=>{
        document.querySelector('.controls .active').classList.remove('active');
        btn.classList.add('active');
        let src = btn.getAttribute('datasrc');
        document.querySelector('#video-silder').src =src;
    })
})

var swiper = new Swiper(".review-slider", {
    spacebetween:20,
    loop:true,
    autoplay:{
        delay:2500,
        disableOnInteraction:false,
    },
    // breakpoints:{
    //     640:{
    //         sildesPerview:1,
    //     },
    //     790:{
    //         sildesPerview: 2,
    //     },
    //     1020:{
    //         sildesPerview:3,
    //     },
    // }
});