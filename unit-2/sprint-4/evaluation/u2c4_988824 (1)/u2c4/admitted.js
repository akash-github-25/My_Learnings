// All the Code for the Admitted page goes here
let arrc=JSON.parse(localStorage.getItem("admission-accepted"))||[]
detail(arrc)
function detail(arrc){
    document.querySelector("tbody").innerHTML=""
    arrc.forEach(function(el){
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
        tr.append(td1,td2,td3,td4,td5)
        document.querySelector("tbody").append(tr)
    })
}