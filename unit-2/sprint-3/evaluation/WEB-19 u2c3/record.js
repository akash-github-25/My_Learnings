// fill in javascript code here
document.querySelector("form").addEventListener("submit",on)
function on(event){
    event.preventDefault()
    let x=document.querySelector("#name").value
    let y=document.querySelector("#employeeID").value
    let z=document.querySelector("#department").value
    let a=document.querySelector("#exp").value
    let b=document.querySelector("#email").value
    let c=document.querySelector("#mbl").value

  let trow = document.createElement("tr");

  let td1=document.createElement("td")
  td1.innerText=x
  
  let td2=document.createElement("td")
  td2.innerText=y
  let td3=document.createElement("td")
  td3.innerText=z
  let td4=document.createElement("td")
  td4.innerText=a
  let td5=document.createElement("td")
  td5.innerText=b
  let td6=document.createElement("td")
  td6.innerText=c
  let td7=document.createElement("td")
  if(a>5){
      td7.innerText="Senior"
  }else if(a>=2 && a<=5){
      td7.innerText="junior"
  }else{
      td7.innerText="fresher"
  }
  let td8=document.createElement("button")
  td8.innerText="button"
  td8.style.backgroundColor="red"
  td8.setAttribute("id","btn")

  td8.addEventListener("click",on1)
  trow.append(td1,td2,td3,td4,td5,td6,td7,td8)
  document.querySelector("tbody").append(trow)


}
function on1(event){
    event.target.parentNode.remove()
}