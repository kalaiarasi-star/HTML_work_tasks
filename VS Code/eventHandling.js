let parent=document.getElementById("parent");
let child=document.getElementById("child");
//bubbling phase
//parent click event
parent.addEventListener("click",function(){
    console.log("parent clicked");
})
//child click event
child.addEventListener("click",function(){
    console.log("child clicked");
})

//capturing phase
//parent click event
parent.addEventListener("click",function(){
    console.log("parent clicked");
},true)
//child click event
child.addEventListener("click",function(){
    console.log("child clicked");
},true)

/*
Event-When it happens
click-when clicked
dblclick-double click
mouseover-mouse enters
mouseout-mouse leaves
keydown-key passed
keyup-key release
submit-form submitted
*/
