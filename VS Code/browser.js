function saveData(){
    let user={
        name:"Ali",
        age:22
    };
    let data=JSON.stringify(user);
    localStorage.setItem("userData",data);
}
//retrieving data
function getData(){
    let data=localStorage.getItem("userData");
    let user=JSON.parse(data);
    console.log(user.name);
    console.log(user.age);
}


//update data
function updateData(){
    let data=JSON.parse(localStorage.getItem("userData"));
    data.age=23;
    localStorage.setItem("userData",JSON.stringify(data));
}

//store session data
function saveSession(){
    sessionStorage.setItem("UserName:","Bob");
}

//retrieve
let name=sessionStorage.getItem("username");
console.log(name);

localStorage.removeItem("UserData");
localStorage.clear();
sessionStrorage.clear();