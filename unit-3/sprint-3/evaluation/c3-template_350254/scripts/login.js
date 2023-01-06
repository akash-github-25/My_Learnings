let arr=JSON.parse(localStorage.getItem("users"))||[]
// if(arr.length==0){
//     alert("User doesn't exist,signup")
// }
// console.log(arr)
// console
document.querySelector("#log_in").addEventListener("click",on)
function on(){
    // event.preventDefault()
    arr.forEach(function(el){
        console.log(el)
         let email=document.querySelector("#email").value
    let password=document.querySelector("#password").value
    // if(email==)
    // if(email==)}))
    if((email=el.email) && (password=el.password)){
        alert("Login sucessful!")
        window.location.href="checkout.html"
    }else{
        alert("Wrong credentials")
    }
    
    
    })
}