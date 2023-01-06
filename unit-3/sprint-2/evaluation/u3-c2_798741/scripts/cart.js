let array=JSON.parse(localStorage.getItem("cart_items"))||[]

 display(array)
 function display(array){
   
    let con=document.querySelector("#cart")
    let total=document.querySelector("#cart_total")
    console.log(array)
    // let sum=0;
    array.forEach(function(el,index){
        let sum=0;
   let div=document.createElement("div")
   let img=document.createElement("img")
   img.src=el.image
   let btn=document.createElement("button")
   btn.innerText="remove"
   btn.addEventListener("click" ,function(){
    remove(index)
   })
   let total=document.querySelector("#cart_total")
   console.log(array)
for(let i=0;i<array.length;i++){
    total.innerText=""
    
    sum=sum+array[i].price
}
console.log(sum)
   total.innerText=sum
//    div1.append(total)
   div.append(img,btn)
   con.append(div)
   

    })
 }
 function remove(index){
    array.splice(index,1)
    localStorage.setItem("cart_items",JSON.stringify(array))
    window.location.reload()
 }