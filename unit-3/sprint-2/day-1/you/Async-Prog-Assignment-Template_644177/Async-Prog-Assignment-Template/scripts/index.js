let data=[
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/2251/1282251-v-d5e46b9253a8",
        name:"MASOOM",
        imbd:7
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9317/1269317-v-c851767a526b",
        name:"MARVEL",
        imbd:9
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/3191/1263191-v-1068113e5df4",
        name:"9HOURS",
        imbd:7
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/7676/647676-v",
        name:"TANAJHI",
        imbd:9
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6536/846536-v",
        name:"BAGHI3",
        imbd:3,
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6828/556828-v",
        name:"SUPER30",
        imbd:6
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/8285/388285-v",
        name:"TOTAL DHAMAL",
        imbd:8
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/7416/957416-v",
        name:"BABY",
        imbd:8
    },
    {
        image:"https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/8105/1118105-v-cf275eb3c3f2",
        name:"BHOOL BHULAIYA",
        imbd:9
    }
];
let datas=JSON.parse(localStorage.getItem("movies"))||[]
document.querySelector("#sort").addEventListener("change", on4)
 function on4(){
    let select=document.querySelector("#sort").value
    // console.log(select)

    if(select=="lowhigh"){
        data.sort(function(a,b){
        
            return a.imbd-b.imbd
        })
        display(data);
        // console.log(data)
    }else if(select=="highlow"){
        data.sort(function(a,b){
            return b.imbd-a.imbd
        })
        display(data);
    }
 }
 display1(datas)
display(data)
 
function display(data){
    document.querySelector("#movies").innerHTML=""
    data.forEach(function(el){
        let div=document.createElement("div")
        let im=document.createElement("img")
        im.setAttribute("src",el.image)
        let p1=document.createElement("p")
        p1.innerText=el.name
        let p2=document.createElement("p")
        p2.innerText=el.imbd
        div.append(im,p1,p2)
        document.querySelector("#movies").append(div)
    })
    localStorage.setItem("movies",JSON.stringify(data))
    // window.location.reload()
}
function display1(datas){
    datas.forEach(function(el){
        let div=document.createElement("div")
        let im=document.createElement("img")
        im.setAttribute("src",el.image)
        let p1=document.createElement("p")
        p1.innerText=el.name
        let p2=document.createElement("p")
        p2.innerText=el.imbd
        div.append(im,p1,p2)
        document.querySelector("#movies").append(div)
    })
    localStorage.setItem("movies",JSON.stringify(datas))
    // window.location.reload(
}
        
 let images=["https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/8105/1118105-v-cf275eb3c3f2","https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6828/556828-v","https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9317/1269317-v-c851767a526b"]

let i=0;
let id;
        let conatiner=document.querySelector("#slideshow")
        // let i=0;
      id=  setInterval(function(){
        console.log(i)
            if(i===images.length){
                i=0;
            }
            let img=document.createElement("img")
            img.src=images[i];
            conatiner.innerHTML=null;
            conatiner.append(img);
            i++
        },2000)
