let paragraph=document.getElementById("para");
let removeButton=document.getElementById("removeBtn");
removeButton.addEventListener("click",function(){
    paragraph.remove();
})

//Updating content
let heading=document.getElementById("title");
let changeTextButton=document.getElementById("changeTextBtn");
changeTextButton.addEventListener("click",function(){
    heading.textContent="Say Hi to DOM Manipulation";

})

//modify attributes
let image=document.getElementById("myImage");
let changeAttrButton=document.getElementById("changeAttr");
changeAttrButton.addEventListener("click",function(){
    image.setAttribute("src","favicon.avif");
})