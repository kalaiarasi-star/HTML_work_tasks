let fruits=["apple","orange","mango"];
console.log(fruits);
console.log(fruits[2]);
console.log(fruits);
//Replace element
fruits[0]="kiwi";
console.log(fruits);
//length of array
let noOfFruits = fruits.length;
console.log(noOfFruits);
//index of array
let position=fruits.indexOf("mango");
console.log(position);
//display elements using for loop
for(i=0;i<=fruits.length;i++){
    console.log(fruits[i]);
}
//add element at last
fruits.push("coconut");
console.log(fruits)
//remove element at last
fruits.pop();
console.log(fruits);
// add elemnet at beginning
fruits.unshift()
console.log(fruits);
//remove element at beginning
fruits.shift("jackfruit");
console.log(fruits);

//slicing
let newFruits=fruits.slice(0,5);
console.log(newFruits);

//splicing
fruits.splice(1,1,"rasberry");//start at index 1,no.of items to be removed,items name
console.log(fruits);

let emoji=fruits.map(function(fruits){
    return fruits+"🍓";
});
console.log(emoji);

let longFruits=fruits.filter(function(fruits){
    return fruits.length>5;
});
console.log(longFruits);

console.log(fruits);
let totalLetters=fruits.reduce(function(total,fruits){
    return total+fruits.length;
},0);
console.log(totalLetters);

