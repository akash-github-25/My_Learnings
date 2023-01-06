

function append(data,container){
    
    container.innerHTML=""
    
    let arr=[]
    data.forEach(function(el){
        let div=document.createElement("div")
        div.setAttribute("class","news")
      let img=document.createElement("img")
      img.src=el.urlToImage
      let t=document.createElement("h3")
      t.innerText=el.title
      let p=document.createElement("p")
      p.innerText=el.description
      div.addEventListener("click",(el)=>{
        console.log(el.urlToImage)
        // console.log(el)
        localStorage.setItem("news",JSON.stringify(arr))
      })
      div.append(img,t,p)
      container.append(div)
    })
   
    }

export default append