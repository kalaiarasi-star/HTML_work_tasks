
let mydiv = document.createElement("div");
for(let i=1; i<100;i++){
    let para=document.createElement('p');
    para.textContent="This is paragraph"+i;
    mydiv.appendChild(para);
}
document.body.appendChild(mydiv);
const t4=performance.now();
console.log("Time taken by code2:"+(t4-t3));//0.2s

//document fragment
let fragment=document.createDocumentFragment();
for(let i=1;i<=100;i++){
    let para=document.createElement('p');
    para.textContent="This is paragraph"+1;
    fragment.appendChild(para);
}
document.body.appendChild(fragment);//1RF 1RP