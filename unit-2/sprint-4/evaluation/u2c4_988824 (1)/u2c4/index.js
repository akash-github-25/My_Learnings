// All the JS Code for the Add Students Page Goes Here
document.querySelector("form").addEventListener("submit", on)
let arra=JSON.parse(localStorage.getItem("admission"))||[]
function on(event){
    event.preventDefault()
    let obj={
        name:document.querySelector("#name").value,
        email:document.querySelector("#email").value,
        phone:document.querySelector("#phone").value,
        gender:document.querySelector("#gender").value,
        course:document.querySelector("#course").value
    }
    arra.push(obj)
    localStorage.setItem("admission",JSON.stringify(arra))
}
