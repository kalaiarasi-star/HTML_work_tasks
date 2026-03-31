let student={
    name:"Ananya",
    age:22,
    department:"CSE",
};
console.log(student);
//access object properties using dot
console.log(student.department);
console.log(student.name);
//access object properties using square bracket
console.log(student["age"]);
//store properties in variable
let key="name";
console.log(student[key]);
//modify property
student.department="Cyber";
console.log(student);
//add property
student.city="Chennai";
console.log(student);
//delete property
delete student.department;
console.log(student);

let person={
    name:"Ram",
    age:23,
    marks:{
        maths:75,
        science:68,
        english:88
    }
};
console.log(person.marks.science);
console.log(person);
//object methods
let user={
    name:"Max",
    greet:function(){
        console.log("Hello,"+this.name);
    }
};
user.greet();
//looping 
let man={
    name:"Bob",
    age:22,
    city:"Delhi",
};
for(let key in man){
    console.log(key,man[key]); //key-property name, man[key]-value of that property
}
//looping example
let marks={
    maths:89,
    science:97,
    english:91,
};
for(let subject in marks){
    console.log(subject+"-",marks[subject]);
}


