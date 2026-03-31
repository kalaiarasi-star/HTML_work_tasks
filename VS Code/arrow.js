function normalFunction(){
    let a=10;
    let b=20;
    let result=a+b;
    alert("Normal function result:"+result);
}
const arrowFunction=()=>{
    let a=30;
    let b=20;
    let result=a+b;
    alert("Arrow function result:"+result);

}
//arrow fn with parameters
const addNumbers=(a,b)=>{
    return a+b;
}
function calculate(){
    let result=addNumbers(5,7);
    alert("Sum is:"+result);
}

//lexical this
let person={
    name:"Alex",
    //normal function
    sayHello:function(){
        //arrow function
        setTimeout(()=>{
            alert("Hello"+this.name);
        },1000);
    }
}