let container=document.getElementById("container");
container.addEventListener("click",function(event){
    console.log(event.target);
    console.log("You clicked:",event.target.textContent);
})
//stop event propogation
let parent=document.getElementById("parent");
let child=document.getElementById("child");
parent.addEventListener("click",function(){
    console.log("parent clicked");
})
child.addEventListener("click",function(){
    console.log("child clicked");
    Event.stopPropagation();
})

//Event delegation
let list=document.getElementById("list");
list.addEventListener("click",function(event){
    console.log("You clicked: ",event.target.textContent);
})
