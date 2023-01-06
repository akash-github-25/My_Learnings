
document.querySelector("form").addEventListener("submit",on)
let arr=JSON.parse(localStorage.getItem("data"))||[];
detail(arr);
function on(event){
    event.preventDefault();
    let obj={
        queTitle:document.querySelector("#title").value,
        queLink:document.querySelector("#link").value,
        queDiff:document.querySelector("#difficulty").value

    }
    arr.push(obj);
    detail(arr);
    localStorage.setItem("data",JSON.stringify(arr))
}
function detail(arr){
    document.querySelector("tbody").innerHTML=""
    arr.forEach(function(el){
    let tr=document.createElement("tr")
    td1=document.createElement("td")
    td1.innerText=el.queTitle
    td2=document.createElement("td")
    td2.innerText=el.queLink
    td3=document.createElement("td")
    td3.innerText=el.queDiff
    td4=document.createElement("td")
    if(el.queDiff=="easy"){
        td4.innerText="No"
    }else{
        td4.innerText="Yes"
    }
    tr.append(td1,td2,td3,td4)
    document.querySelector("tbody").append(tr)
});
}