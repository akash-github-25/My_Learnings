// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page
// import { container } from "webpack"
// import { container } from "webpack"
import append from "../components/append.js"
import navbar from "../components/navbar.js"
document.querySelector("#navbar").innerHTML=navbar()
console.log(navbar)
// let query=document.querySelector("#search_input").value
// console.log(query)
// document.querySelector("")
// let take;
document.getElementById("search_input").addEventListener("keypress",(el)=>{
    if(el.key=="Enter"){
        // take=true;
    main()
    }
})
let container=document.querySelector("#results")
// function to(){
let q=JSON.parse(localStorage.getItem("q"))||[]
// let url1=`https://masai-api.herokuapp.com/news?q=${q[q.length-1]}`
// let res1=await fetch(url1)
// let data=await res1.json()
// append(data.articles,container)
// }
// to()
let main =async()=>{
    let query=document.querySelector("#search_input").value 
  let url=`https://masai-api.herokuapp.com/news?q=${query}`
    
  let res=await fetch(url)
  let data=await res.json()
  console.log(data.articles)
  let arr=JSON.parse(localStorage.getItem("news"))||[]
  append(data.articles,container)
}
 
// let container=document.querySelector("#results")
// import append from "../components/append.js"
// // let query=document.querySelector("#search_input").value
// document.getElementById("search_input").addEventListener("keypress",(el)=>{
//     if(el.key=="Enter"){
//     main()
//     }
// })
// let container=document.querySelector("#results")
// import append from "../components/append.js"
// // let query=document.querySelector("#search_input").value
// let main =async()=>{
//     let query=document.querySelector("#search_input").value 
//   let url=`https://masai-api.herokuapp.com/news?q=${query}`
//   let res=await fetch(url)
//   let data=await res.json()
//   console.log(data.articles)
//   let arr=JSON.parse(localStorage.getItem("news"))||[]
//   append(data.articles,container)
// }
// let container=document.querySelector("#results")
// function append(data){
//     container.innerHTML=""
//     let div=document.createElement("div")
//     div.setAttribute("class","news")
//     data.forEach(function(el){
//       let img=document.createElement("img")
//       img.src=el.urlToImage
//       let t=document.createElement("h2")
//       t.innerText=el.title
//       let p=document.createElement("p")
//       p.innerText=el.description
//       div.append(img,t,p)
//     container.append(div)
//     })
