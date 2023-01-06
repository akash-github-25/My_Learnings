// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page
import navbar from "../components/navbar.js"
document.querySelector("#navbar").innerHTML=navbar()
import append from "../components/append.js"
// india()
let container=document.querySelector("#results")
// container.innerHTML=india()
 document.querySelector("#in").addEventListener("click",()=>{
    india()
 })
 let india=async ()=>{
    let url="https://masai-api.herokuapp.com/news/top-headlines?country=in"
    let res=await fetch(url);
    let data=await res.json()
    append(data.articles,container)

 }
 document.querySelector("#ch").addEventListener("click",()=>{
    china()
 })
 let china=async ()=>{
    let url="https://masai-api.herokuapp.com/news/top-headlines?country=ch"
    let res=await fetch(url);
    let data=await res.json()
    append(data.articles,container)

 }
 document.querySelector("#us").addEventListener("click",()=>{
    usa()
 })
 let usa=async ()=>{
    let url="https://masai-api.herokuapp.com/news/top-headlines?country=us"
    let res=await fetch(url);
    let data=await res.json()
    append(data.articles,container)

 }
 document.querySelector("#uk").addEventListener("click",()=>{
    uk()
 })
 let uk=async ()=>{
    let url="https://masai-api.herokuapp.com/news/top-headlines?country=uk"
    let res=await fetch(url);
    let data=await res.json()
    append(data.articles,container)

 }
 document.querySelector("#nz").addEventListener("click",()=>{
    nz()
 })
 let nz=async ()=>{
    let url="https://masai-api.herokuapp.com/news/top-headlines?country=nz"
    let res=await fetch(url);
    let data=await res.json()
    append(data.articles,container)

 }
//  document.getElementById("search_input").addEventListener("keypress",(el)=>{
//     if(el.key=="Enter"){
//     // main()
//     window.location.href="search.html"
//     }
// })
india()
document.getElementById("search_input").addEventListener("keypress",(el)=>{
    let arr=[]
    if(el.key=="Enter"){
    let q=document.querySelector("#search_input").value
  arr.push(q)
  localStorage.setItem("q",JSON.stringify(arr))
  window.location.href="search.html"
    }
})
let main =async()=>{
    let query=document.querySelector("#search_input").value 
  let url=`https://masai-api.herokuapp.com/news?q=${query}`
  let res=await fetch(url)
  let data=await res.json()
  console.log(data.articles)
  let arr=JSON.parse(localStorage.getItem("news"))||[]
  append(data.articles,container)
}
 


