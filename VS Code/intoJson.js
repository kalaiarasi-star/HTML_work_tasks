let jsondata='{"name":"Alex","age":23}';
let obj=JSON.parse(jsondata);
console.log(obj.name);
console.log(obj.age);

let student={
    name:"Ram",
    age:22
};
let jsonData1=JSON.stringify(student);
console.log(jsonData1);