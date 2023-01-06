document.querySelector("form").addEventListener("submit", on)
function on(event){
    event.preventDefault();
    let name=document.querySelector("#name").value
    let contact=document.querySelector("#contact").value
    let email=document.querySelector("#email").value
    let password=document.querySelector("#pass").value
    if(name!="" && contact!="" && email!="" && password!=""){
    obj= new data(name,contact,email,password)
    let arr=JSON.parse(localStorage.getItem("data"))||[]
    arr.push(obj)
    localStorage.setItem("data",JSON.stringify(arr))
    }
}
function data(n,c,e,p){
    this.name=n
    this.contact=c
    this.email=e
    this.password=p
}
document.querySelector("#submit").addEventListener("click", on1)
function on1(){
    let name=document.querySelector("#name").value
    let contact=document.querySelector("#contact").value
    let email=document.querySelector("#email").value
    let password=document.querySelector("#pass").value
    if(name!="" && contact!="" && email!="" && password!=""){
    window.location.href="login.html"
    }
}
 