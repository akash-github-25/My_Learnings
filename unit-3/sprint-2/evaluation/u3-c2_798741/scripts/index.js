
async function grocery(){
    let url="https://grocery-masai.herokuapp.com/items"
    let res=await fetch(url)
    let data=await res.json()
    // console.log(data.data)
    append(data.data)
}
grocery()
function append(data){
    let container=document.querySelector("#groceries")
    let wallet=document.querySelector("#wallet")
    wallet.innerText=700
    // container.innerHTML=""
    // console.log(data)
    data.forEach(function(el){
        // console.log(el.image)
        let div=document.createElement("div")
        let name=document.createElement("p")
        name.innerText=el.name
        let price=document.createElement("p")
        price.innerText=el.price
        let image=document.createElement("img")
        image.src=el.image
        let btn=document.createElement("button")
        btn.setAttribute("id","add_to_cart")
        btn.innerText="add to cart"
        btn.addEventListener("click",function(){
           cartitems(el)
        //    console.log(el)
        })
        div.append(image,name,price,btn)
        container.append(div)
    })
}
let array=JSON.parse(localStorage.getItem("cart_items"))||[]
let sum=0;
function cartitems(el){
//  x=sum+el.price
    console.log(el)
    // let array=JSON.parse(localStorage.getItem("catrt_items"))||[]
    array.push(el)
    let wallet=document.querySelector("#wallet")
    if(el.price<700){
    wallet.innerText=700-el.price
    }else{
        alert("Insufficient balance")
    }
  localStorage.setItem("cart_items",JSON.stringify(array))
  window.location.href="cart.html"
}
