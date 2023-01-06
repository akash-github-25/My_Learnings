import navbar from "../component/navbar.js";
document.getElementById("navbar").innerHTML=navbar();
import {getdata,append} from"./fetch.js"
async function main1(){
    // let query=document.querySelector("#query").value
    // console.log(query)
    let container=document.querySelector("#container")
    let url="https://www.themealdb.com/api/json/v1/1/random.php"
let data=await getdata(url)
console.log(data)
append(data,container)

}
main1()
