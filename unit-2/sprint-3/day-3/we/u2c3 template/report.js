// write code here, dont change anything in HTML and css files 
// refer to id's mentioned in html files carefully
// Follow the exact column order for tables,for eg: name should be filled under "name" column 
// we are using form here, make sure you are using "submit" eventListener , or else you will get 0 marks
document.querySelector("form").addEventListener("submit",on)
function on(event){
     event.preventDefault()
     let photo=document.querySelector("#image").value;
     let nam=document.querySelector("#name").value;
     let bat=document.querySelector("#batch").value;
     let dsa=document.querySelector("#dsa").value;
     let skill=document.querySelector("#cs").value;
     let code=document.querySelector("#coding").value;
     let tr=document.createElement("tr");
     let td1=document.createElement("td");
     let imge=document.createElement("img")
    imge.setAttribute("src","https://cdn.pixabay.com/photo/2015/03/04/22/35/head-659652__340.png")
     let td2=document.createElement("td");
     td2.innerText=nam
     let td3=document.createElement("td");
     td3.innerText=bat
     let td4=document.createElement("td");
     td4.innerText=dsa
     let td5=document.createElement("td");
     td5.innerText=skill
     let td6=document.createElement("td");
     td6.innerText=code
     let td7=document.createElement("td");
     let per=((Number(dsa)+Number(skill)+Number(code))/30)*100;
     td7.innerText=per.toFixed(2);
     let td8=document.createElement("td");
     td8.style.backgroundColor="green"
     if(per>50){
        td8.innerText="Regular";
    }else if(per<50){
        td8.innerText="Async";
    }
     let td9=document.createElement("td");
     td9.innerText="DELETE";
     td9.style.backgroundColor="red";
     td9.addEventListener("click",del);
     td1.append(imge);
     tr.append(td1,td2,td3,td4,td5,td6,td7,td8,td9);
     document.querySelector("tbody").append(tr);
     

}
function del(event){
    event.target.parentNode.remove();
    event.target.parentNode.innerHTML=""
}
