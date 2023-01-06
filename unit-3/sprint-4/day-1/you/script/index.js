let students=JSON.parse(localStorage.getItem("users"))||[]
import navbar from "../component/navbar.js";
document.getElementById("navbar").innerHTML=navbar();
import {getdata,append} from "./fetch.js"

let container=document.querySelector("#container")
console.log("yes")
document.getElementById("btn").addEventListener("click",main1)
async function main1(){
    if(students.length==0){
        alert("first signup")
        window.location.href="signup.html"
    }else{
    let query=document.querySelector("#query").value
    console.log(query)
    const url=`https://www.themealdb.com/api/json/v1/1/search.php?s=${query}` 
let data=await getdata(url)
console.log(data)
append(data,container)
}
}


 


// main()
