let hide = document.querySelector(".menu");
function fun() {
  hide.classList.toggle("hide");
}

var n = 0;
function closed() {
  if (n == 1) {
    var close = document.getElementById("closed");
    close.innerHTML = `close`;
  } else {
    var open = document.getElementById("closed");
    open.innerHTML = `menu`;
    n = 0;
  }
  n++;
}


 
    let serchbox = document.querySelector(".navBox3");
    function serchx() {
        serchbox.classList.toggle("serchbox");
    }
  
    