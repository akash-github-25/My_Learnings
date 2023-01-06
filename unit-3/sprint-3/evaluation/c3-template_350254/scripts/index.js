// let data=[]
let main=async ()=>{
    let query=document.querySelector("#query").value
    let data=await getdata(query)
    append(data)
    // document.querySelector("#sort_lth").addEventListener("click",on4)

}
let getdata=async (query)=>{
 let url=`https://masai-mock-api.herokuapp.com/hotels/search?city=${query}`
 let res=await fetch(url)
 let data=await res.json()
 
//  console.log(data.hotels)
 return data.hotels
}
// document.querySelector("#sort_lth").addEventListener("click",on)
// async function on1(data){
// //    let data1=await getdata(query)

//     console.log(data)
    
// }
document.querySelector("#sort_lth").addEventListener("click",on4)
let sort=async()=>{
 let hello=await getdata(query)
 hello.hotels=hello.hotels.sort((a,b)=>{
    return a.Price-b.Price
 });
 append(hello.hotels)
}
let data1=[]
function append(data){
    data.forEach(function(el){
        let container=document.querySelector("#hotels_list")
       let div= document.createElement("div")
       div.setAttribute("class","hotel")
       let img=document.createElement("img")
       img.src=el.Images.one
       let title=document.createElement("h1")
       title.innerText=el.Title
       let price=document.createElement("p")
       price.innerText=el.Price
       let rating=document.createElement("p")
       rating.innerText=el.Rating
       let ac=document.createElement("p")
       ac.innerText=el.Ac
       let btn=document.createElement("button")
       btn.innerText="booknow"
       btn.setAttribute("class","book")
       btn.addEventListener("click",function(){
        data1.push(el)
        console.log(el)
        localStorage.setItem("check",JSON.stringify(data1))
        alert("Log In to continue!")
        window.location.href="login.html"
       })
       div.append(img,title,price,rating,ac,btn)
  container.append(div)
    })
}
