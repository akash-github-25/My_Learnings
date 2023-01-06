// All the Code for All Students Page Goes Here
let arrb=JSON.parse(localStorage.getItem("admission"))
document.querySelector("#filter").addEventListener("change", fil)
    function fil(){
    let select=document.querySelector("#filter").value
    if(select=="all"){
    let filt=arrb.filter(function(el){
         display(arrb)
    })
}
 if(select=="Web-Development"){
    let filt1=arrb.filter(function(el){
    return el.course==select
})
display(filt1)
     
    }
     if(select=="Android-Development"){
        let filt2=arrb.filter(function(el){
            return el.course==select
        })
        display(filt2)
    }
    if(select=="Data-Analitics"){
        let filt3=arrb.filter(function(el){
            return el.course==select
        })
        display(filt3)
    }
}
let arrc=JSON.parse(localStorage.getItem("admission-accepted"))||[]
let arrd=JSON.parse(localStorage.getItem("admission-rejected"))||[]

display(arrb)
function display(arrb){
    document.querySelector("tbody").innerHTML=""
    arrb.forEach(function(el,index){
        let tr=document.createElement("tr")
        let td1=document.createElement("td")
        td1.innerText=el.name
        let td2=document.createElement("td")
        td2.innerText=el.email
        let td3=document.createElement("td")
        td3.innerText=el.course
        let td4=document.createElement("td")
        td4.innerText=el.gender
        let td5=document.createElement("td")
        td5.innerText=el.phone
        let td6=document.createElement("td")
        td6.innerText="accept"
        td6.style.backgroundColor="green"
        td6.addEventListener("click", function(){
            accept(el)
            accept1(index)
        })
        let td7=document.createElement("td")
        td7.innerText="reject"
        td7.style.backgroundColor="red"
        td7.addEventListener("click", function(){
            reject(el)
            reject1(index)
        })
        tr.append(td1,td2,td3,td4,td5,td6,td7)
        document.querySelector("tbody").append(tr)

    })
}
function accept(el,index){
    arrc.push(el)

    localStorage.setItem("admission-accepted",JSON.stringify(arrc))

    
}
function reject(el){
    arrd.push(el)
    localStorage.setItem("admission-rejected",JSON.stringify(arrd))
}
function accept1(index){
    arrb.splice(index,1)
    localStorage.setItem("admission",JSON.stringify(arrb))
    window.location.reload()
}
function reject1(index){
    arrb.splice(index,1)
    localStorage.setItem("admission",JSON.stringify(arrb))
    window.location.reload()
}
