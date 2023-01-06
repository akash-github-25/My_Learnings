import navbar from "../components/navbar.js";
document.getElementById("navbar").innerHTML=navbar();
import {getData,append} from "./fetch.js"
const url=`https://fakestoreapi.com/products/category/jewelery`
console.log(url)
let container=document.getElementById("container-1")
getData(url).then((res) => {
    console.log(res)
    append(res,container)
})
// import getData from"./fetch.js"