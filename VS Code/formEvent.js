//change event
let city=document.getElementById("city");
city.addEventListener("change",function(){
    console.log("selection city:",this.value);
})

//focus event
let email=document.getElementById("email");
email.addEventListener("focus",function(){
    email.style.backgroundColor="red";
})
//input
let message=document.ge