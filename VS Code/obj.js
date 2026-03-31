let name="Ram";
let age=22;
let course="AI";
//old way
let student1={
    name:name,
    age:age,
    course:course
};
console.log(student1);
//modern way
let student2={
    name,
    age,
    course
};
console.log(student2);
//computed property keys
let keyName="marks";
let student={
    name:"Alex",
    [keyName]:95
};
console.log(student);

//object cloning
//orginal object
let user={
    name:"Bob",
    age:23
};
console.log(user);
//clone object
let copyUser={...user};
console.log(copyUser);