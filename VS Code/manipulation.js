function addItem(){
    let container=document.getElementById("container");
    let newPara=document.createElement("p");
    console.log(newPara);
    //add content
    newPara.textContent="This is a paragraph";
    console.log(newPara);
    console.log(container);
    //add paragraph inside container
    container.appendChild(newPara);
    console.log(container)

    let newParagraph=document.createElement("p");
    newParagraph.textContent="I am on the top";
    container.insertBefore(newParagraph,container.firstChild);
    console.log(container);

    container.innerHTML="<p>New content</p>";
    console.log(container);
}