/**-------------------------------Barras de navegacion en scroll----------------- */
window.onscroll = function() {myFunction()};


var navbar = document.getElementById("navbar");


var sticky = navbar.offsetTop;


function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}


/** GALERIA 2.0 ULTRA SUPER HIPER DUPER REMASTERIZADA 2000 */


