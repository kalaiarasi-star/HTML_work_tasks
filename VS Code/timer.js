let timer;
document.getElementById("startBtn").addEventListener("click",function(){
    timer=setTimeout(function(){
        document.getElementById("message").textContent="Hello! This message appeared after 3 seconds";
    },3000);
})
//cancel timeout
document.getElementById("cancelBtn").addEventListener("click",function(){
    clearTimeout(timer);
    document.getElementById("message").textContent="Timer cancelled";
})