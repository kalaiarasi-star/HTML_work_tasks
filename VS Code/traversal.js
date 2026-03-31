function checkNodes(){
    let box = document.getElementById("box");
    //parent node
    console.log(box.parentNode);
    //child nodes
    console.log(box.childNodes);
    console.log(box.firstChild);
    console.log(box.lastChild);

    let firstPara=box.getElementsByTagName("p")[0];
    console.log(firstPara);
    console.log(firstPara.nextSibling);
    console.log(firstPara.previousSibling);

    //filtering only element nodes
    console.log(box.children);
    console.log(box.firstElementChild);
    console.log(box.lastElementChild);

    let firstParagraph=box.children[1];
    console.log(firstParagraph);
    console.log(firstParagraph.nextElementSibling);
    console.log(firstParagraph.previousElementSibling);
}
