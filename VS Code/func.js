//declaration
function greet(){
    console.log("Hello");
}
//calling
greet();
greet();
//parameters
function greetPerson(name){
    console.log("Hi" + name);
}
greetPerson(" Max");
greetPerson(" Ram");
//multiple parameters
function add(a,b){
    console.log(a+b);
}
add(10,20);
add(3343,56);

// without return 
function sum(x,y){
    console.log(x+y);
}
result=sum(3,4);
console.log(result);

//with return 
function sum(x,y){
    return x+y;
}
result=sum(30,4);
console.log(result);

//function hoisting
/*sayHello();
function sayHello(){
    console.log("Hello!");
}

//fuction expression
const greetUser=function(){
    console.log("Welcome");
}
greetUser();
//fn hoisting-error
greetPeople();
const greetPeople=function(){
    console.log("Hi everyone");
}*/
//arrow function
/*const sayHi=(name)=>{
    console.log("Welcome to arrow fn" + name);
}
sayHi("Kalaiarasi");*/

//implicit return
const addition=(p,q)=> p+q;
console.log(addition(2,5));

//const square=n=>n*n;
//console.log(square(16));

const cube=n=>n*n*n;
console.log(cube(3));
