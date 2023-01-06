let arr=[]
function x(id){
  return   document.getElementById(id).value
}
 let add=async()=>{
    let products={
        // id:document.getElementById("id1").value,
        id:x('id1'),
        name:x('name'),
        price:x('club')
        // name:document.getElementById("name").value,
        // price:document.getElementById("club").value
    }
    products=JSON.stringify(products)
     
   let response=await fetch("http://127.0.0.1:3000/api/products",{
    method:"POST",
    body:products,
    headers:{
        "Content-Type":"application/json"
    }
   })
 }

 let del=async()=>{
     let id=document.getElementById("id2").value
     
   let response=await fetch(`http://127.0.0.1:3000/api/products/${id}`,{
    method:"DELETE",
    // body:products,
    headers:{
        "Content-Type":"application/json"
    }
   })
   let data=await response.json()
}

async function updateproduct(){
    let id=document.getElementById("id3").value
    let res=await fetch(`http://127.0.0.1:3000/api/products/${id}`,{
        method:"PATCH",
        body: JSON.stringify({
            name:"ronaldo",
            price:800000000,
        }),
        headers:{
        "Content-Type":"application/json"
    }
    })
    let data=await res.json()
    console.log(data)
    arr.push(data)
   
    // localStorage.setItem("data",JSON.stringify(arr))
}

async function main(){
  let rit=await fetch("http://127.0.0.1:3000/api/products")
  let data=await rit.json()
  console.log(data)
  return data
}
// main()
export default main