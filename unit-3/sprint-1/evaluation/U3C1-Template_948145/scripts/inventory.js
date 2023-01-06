let data=JSON.parse(localStorage.getItem("data"))||[]
display(data)
function display(data){
    data.forEach(function(el,index){
    let div=document.createElement("div")
    let image=document.createElement("img")
    image.setAttribute("src",el.image)
    let brand=document.createElement("p")
    brand.innerText=el.brand
    let name=document.createElement("p")
    name.innerText=el.name
    let price=document.createElement("p")
    price.innerText=el.price
    let btn=document.createElement("button")
    btn.setAttribute("id","remove_product")
    btn.innerText="Remove product";
    btn.addEventListener("click" ,function(){
        remove(index)
    });
    div.append(image,brand,name,price,btn)
    document.querySelector("#products_data").append(div)
    });
}
function remove(index) {
    let data=JSON.parse(localStorage.getItem("data"))||[]
    let newData=data.filter(function(el,i){
        if(i==index){
            let trash=JSON.parse(localStorage.getItem("trash"))||[]
            trash.push(el)
            localStorage.setItem("trash",JSON.stringify(trash))
        }else{
            return i!=index
        }
    })
    localStorage.setItem("data",JSON.stringify(newData))
    window.location.reload()
}