document.querySelector("form").addEventListener("submit",on)
function on(event){
    event.preventDefault()
    alert("your order is confirmed")
    

    let id=setTimeout(function(){
   alert("your order is been packed")
    },3000)
    let id1=setTimeout(function(){
        alert("your order is in transit")
         },8000)
         let id2=setTimeout(function(){
            alert("your order is out for delivery")
             },10000)
             let id3=setTimeout(function(){
                alert("order delivered")
                 },12000)

     
}