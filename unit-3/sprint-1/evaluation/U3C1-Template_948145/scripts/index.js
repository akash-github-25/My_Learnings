//store the products array in localstorage as "data"
let data=JSON.parse(localStorage.getItem("data"))||[]
document.querySelector("form").addEventListener("submit", on)
function on(event){
    event.preventDefault()
    let brand=document.querySelector("#product_brand").value
    let name=document.querySelector("#product_name").value
    let price=document.querySelector("#product_price").value
    let image=document.querySelector("#product_image").value
    let s1=new data1(brand,name,price,image)
  data.push(s1)
  localStorage.setItem("data",JSON.stringify(data))
    
}
function data1(b,n,p,i){
    this.brand=b
    this.name=n
    this.price=p
    this.image=i
}