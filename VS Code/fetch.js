function sendData(){
    fetch("https://jsonplaceholder.typicode.com/posts",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify({
        title:"MY POST",
        body:"Learning Fetch API",
        userId:1
        })
        
        })
        .then(response=>response.json())
        .then(data=>{
            console.log(data);
    });     
}
//error handling
fetch("https://jsonplaceholder.typicode.com/user")
.then(response=>{
    if(!response.ok){
        throw new Error("Server error");
    }
    return response.json();
})
.then(data=>{
    console.log(data);
})
.catch(error=>{
    console.log("Error occured:",error);
});

//chaining
fetch("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>response.json())
.then(data=>data.title)
.then(title=>{
    console.log("Post title:",title);
})