// Ude Import export (MANDATORY)
import navbar from "../components/navbar.js";
document.querySelector("#navbar").innerHTML=navbar()
import append from "../components/append.js"
let container=document.querySelector("#detailed_news")
let data=JSON.parse(localStorage.getItem("news"))||[]
console.log(data)
append(data,container)

