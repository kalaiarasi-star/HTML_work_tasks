function getData(){
    fetch("https://jsonplaceholder.typicode.com/user")
    .then(function(response){
        return response.json();
    })
    .then(function(data){
        console.log(data);
    })
}

async function getUsers(){
    try{
        let response=await fetch("https://jsonplaceholder.typicode.com/user");
        let data=await response.json();
        console.log(data);
    }
    catch{
        console.log("error:",error);
    }
}