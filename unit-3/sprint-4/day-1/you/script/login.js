let students=JSON.parse(localStorage.getItem("users"))||[]


document.querySelector("form").addEventListener("submit",on)
function on(event){
    event.preventDefault()
let email1=document.querySelector("#email").value
let password1=document.querySelector("#password").value
// console.log(email1)
// console.log(password1)
class login{
    constructor(name,email,password){
        this.name=name
        this.email=email
        this.password=password
    }
    logincheck(email1,password1){
        // console.log(email1)
        // console.log(password1)
       let isValidated=false;
       isValidated=this.validateemail() && this.validatepassword()
        // isValidated=this.validateemail && this.validatepassword
        if(isValidated){
            // this.email=email
            // this.password=password
            // console.log(this)
            // students.push(this)
            // localStorage.setItem("users",JSON.stringify(students))
            // window.location.href="login.html"
            alert(`${this.name} is logged in`)
            window.location.href="index.html"
            return true
            
        }

        // }else{
        //     alert("failed login")
        // }
    }
        validateemail(){
            console.log(this.email,email1)
         if(this.email==email1){
            return true
         }
        }
        validatepassword(){
    if(this.password==password1){
        return true
    }
        }
    }



// let user
let t;
for(let i=students.length-1;i>=0;i--){
let s=new login(students[i].name,students[i].email,students[i].password)
 t=s.logincheck(email1,password1)
if(t==true){
    break;
}
}if(t!=true){
    alert("failed login")
}


}