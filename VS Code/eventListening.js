//event registration
let button=document.getElementById("myBtn");
button.addEventListener("click",function(){
    console.log("Button was clicked");
})

//Named fn
let btn=document.getElementById("btn");
function showMessage(){
    console.log("Named function is called");
}
btn.addEventListener("click",showMessage);

//Remove event listener
let button1=document.getElementById("abc");
let removeBtn=document.getElementById("remove");
//declare named fn
function sayHello(){
    console.log("Hello");
}
button1.addEventListener("click",sayHello);
//add event to remove button
removeBtn.addEventListener("click",function(){
    button1.removeEventListener("click",sayHello);
    console.log("Event is removed");
})