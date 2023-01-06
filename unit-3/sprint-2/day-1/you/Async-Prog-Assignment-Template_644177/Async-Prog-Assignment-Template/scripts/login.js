let arr=JSON.parse(localStorage.getItem("data"))||[]
document.querySelector("form").addEventListener("submit", on2)
function on2(event){
    event.preventDefault()
    let x=document.querySelector("#lemail").value
    let y=document.querySelector("#lpass").value
    if(arr[0].email==x && arr[0].password==y){
        window.location.href="index.html"
    }else{
        alert("invalid credentials")
    }
}
