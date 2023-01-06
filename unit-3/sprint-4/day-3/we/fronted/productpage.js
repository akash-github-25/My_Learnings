import main from "../fronted/admin.js"
console.log(main)
function append(data){
    let container=document.querySelector("#container")
    data.forEach(({name,price,id})=>{
     let p=document.createElement("p")
     p.innerText=name
     container.append(p)
    })
}
let getdata=async ()=>{
    let t=await main()
    append(t)
}
getdata()