//global scope
let college="PDKV"
function showCollege(){
    console.log(college);
}
showCollege();
console.log(college);//accessible

//local scope
//function greet(){
  //  let message="Hello";
    //console.log(message);
//}
//greet();
//console.log(message);//error

//block scope
//if(true){
//    let age = 20;
//    const city = "Chennai";
//}
//console.log(age);
//console.log(city);

if(true){
    var age = 20;
    var city = "Chennai";
}
console.log(age);
console.log(city);

//Lexical environment
let topic="Javascript";
function outer(){
    let level="beginners";
    function inner(){
        console.log(topic);//global
        console.log(level); //parent function

    }
    inner();
}
outer();//prints whatever is inside inner fn

//closure
function outside(){
    let count=0;
    function inside(){
        count++;
        console.log(count);
    }
    return inside;
}
let counter=outside();
counter();
counter();
counter();

//real time ex
function bankAccount(){
    let balance=100;
    return function withdraw(amount){
        balance -=amount;
        console.log("balance amount is:",balance);
    };
}
let myAccount = bankAccount();
myAccount(200);
myAccount(100);

