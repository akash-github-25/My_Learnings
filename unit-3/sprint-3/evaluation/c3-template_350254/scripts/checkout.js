let data=JSON.parse(localStorage.getItem("check"))||[]
console.log(data)
append(data)
function append(data){
    data.forEach(function(el){
        // let div=document.createElement("img")
        let img=document.createElement("img")
        img.src=el.Images.one
        let title=document.createElement("h1")
        title.innerText=el.Title
        let price=document.createElement("p")
        price.innerText=el.Price
        let btn=document.createElement("button")
        btn.innerText="booknow"
        btn.setAttribute("class","book")
        btn.addEventListener("click",function(){
            setTimeout(function(){
                alert("your bokking is sucessfull")
            },5000)
        })
   document.querySelector("#hotel_details").append(img,title,price,btn)
    })
}