//update the variable
let age=22;
age=23;
console.log(age);

const country="India";
//country="USA";
console.log(country);

let message="Hello";
{
    let message="Hi";
    console.log(message);
}
console.log(message);

let name="Ruby";
let age1="22";
let text=`My name is ${name} and I am ${sge1} years old`;
document.getElementById("result").innerText=text;

let fruits=["apple","Mango","orange"];
//destructure
let[a,b,c]=fruits;
console.log(a);//apple
console.log(b);//mango
console.log(c);//orange

//without destructure
let a1=fruits[0];
let b1=fruits[1];
let c1=fruits[2];
console.log(a1);//apple
console.log(b1);//mango
console.log(c1);//orange

//destructure 
let student={
    name2:"Elsa",
    age2:23,
    course:"Data science"
};
//destructure
let{name2,age2,course}=student;
console.log(name);
console.log(age);
console.log(course);

let numbers1=[1,2,3];
let numbers2=[4,5,6];
let combined=[...numbers1,...numbers2];
console.log(combined);

function addNumbers(...numbers){
    let sum=0;
    for(let num of numbers){
        sum+=num;
    }
    console.log(sum);
}
addNumbers(10,20,48,3,6);