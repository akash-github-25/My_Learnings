// let url=`https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata`
async function getdata(url){
    let res=await fetch(url)
    let data=await res.json()
    console.log(data.meals)
    return data.meals
    // append(data.meals)
}

let append=(data,container)=>{
    container.innerHTML=""
    data.forEach(function(el){
        let img=document.createElement("img")
        img.src=el.strMealThumb
        let nam=document.createElement("h2")
        nam.innerText=el.strMeal
        container.append(img,nam)
    })
}
export  {getdata,append}