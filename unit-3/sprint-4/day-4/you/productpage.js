// import main from "../fronted/main.js"
// console.log(main)
// document.querySelector("#sortlh").addEventListener("click",lh)
// async function lh(){

//    let data=await main()
//    data=data.sort((a,b)=>{
//       return a.price-b.price
//    })
//    append(data)
// }
// document.querySelector("#sorthl").addEventListener("click",hl)
// async function hl(){
//    let data=await main()
//    data=data.sort((a,b)=>{
//       return b.price-a.price
//    })
//    append(data)
// }
// document.querySelector("#filter").addEventListener("change",on1)
// async function on1(){
//     let data=await main()
//    let select= document.querySelector("#filter").value
//    if(select=="more"){
  
//     let x=data.filter((el)=>{
//         if(el.id>4){
//             return el
//         }
//     })
//     // console.log(x)
//     append(x)
//    }
//    if(select=="less"){
//     let y=data.filter((el)=>{
//         if(el.id<=4){
//             return el
//         }
//     })
//     // console.log(x)
//     append(y)
//    }
// }
// function append(data){
//     let container=document.querySelector("#container")
//     container.innerHTML=null
//     data.forEach(({name,price,id,url})=>{
//         let div=document.createElement("div")
//         let p1=document.createElement("p")
//         p1.innerText=`ratings-${id}`
//      let p=document.createElement("p")
//      p.innerText=`Item-${name}`
//      let img=document.createElement("img")
//      img.src=url
//      let prii=document.createElement("p")
//      prii.innerText=`price-${price}`
//      div.append(img,p,p1,prii)
//      container.append(div)
//     })
// }
// let getdata=async ()=>{
//     let t=await main()
//   console.log(t)
//     append(t)
//     // return t
// }
// getdata()

async function main(){
    let rit=await fetch("http://127.0.0.1:3000/api/products")
    let data=await rit.json()
    append(data)
    // return data
  }
  main()

  function append(data){
    let container=document.querySelector("#container")
    container.innerHTML=null
    data.forEach(({name,price,id,url})=>{
        let div=document.createElement("div")
        let p1=document.createElement("p")
        p1.innerText=`ratings-${id}`
     let p=document.createElement("p")
     p.innerText=`Item-${name}`
     let img=document.createElement("img")
     img.src=url
     let prii=document.createElement("p")
     prii.innerText=`price-${price}`
     div.append(img,p,p1,prii)
     container.append(div)
    })
}

async function hl(){
    let res=await fetch("http://127.0.0.1:3000/api/products/?_sort=price&_order=asc")
    let data=await res.json()
    append(data)
    
    // append(data)
 }