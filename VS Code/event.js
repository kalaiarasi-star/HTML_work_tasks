function changeText(){
    let para=document.getElementById("text");
    para.innerText="You clicked the button";
}                                                                                                                                                                                                                                                        

//event listener 
let button=document.getElementById("btn")
button.addEventListener("click",function(){
     let para= document.getElementById("message");
     para.innerText="Button was clicked";
})

//interactive UI
let btn=document.getElementById("toggle");
let statusText=document.getElementById("status");
btn.addEventListener("click",function(){
    if(statusText.innerText==="OFF"){
        statusText.innerText="ON";
    }
    else{
        statusText.innerText="OFF";
    }
})
