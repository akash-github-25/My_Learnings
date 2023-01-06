import navbar from "../component/navbar.js";
document.getElementById("navbar").innerHTML=navbar();

import {getdata,append} from "./fetch.js"
// console.log(getdata)

// let container=document.querySelector("#container")
// console.log("yes")
// document.getElementById("btn").addEventListener("click",main1)
// async function main1(){
    // let query=document.querySelector("#query").value
    // console.log(query)
    // let url="www.themealdb.com/api/json/v1/1/categories.php"
//     let hit=async (url)=>{
        
// let res=await fetch(url)
// // console.log(res)
// let x=await res.json()
// console.log(x)
// append(x,container)
//     }
//     hit()

// }

console.log("yes")
// document.getElementById("btn").addEventListener("click",main1)
async function main1(){
    // let query=document.querySelector("#query").value
    // console.log(query)
    let container=document.querySelector("#container")
    let url="https://www.themealdb.com/api/json/v1/1/search.php?s=chicken"
let data=await getdata(url)
console.log(data)
append(data,container)

}
main1()
