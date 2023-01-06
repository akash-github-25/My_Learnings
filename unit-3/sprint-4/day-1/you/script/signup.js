let students=JSON.parse(localStorage.getItem("users"))||[]
document.querySelector("form").addEventListener("submit",on)
function on(event){
    event.preventDefault()
class user{
    constructor(name,email,password){
        this.name=name;
        this.email=email
        this.password=password
    }
    signup(email,password){
      let isValidated=true;
      let take=false;
        // isValidated=this.validateemail && this.validatepassword
        if(isValidated){
            this.email=email
            this.password=password
            for(let i=0;i<students.length;i++){
                if(students[i].email==email){
                    alert("try another email")
                    take=true;
                    break;

                }
            }
            if(take==false){
            console.log(this)
            students.push(this)
            localStorage.setItem("users",JSON.stringify(students))
            window.location.href="login.html"
            }
        }
    }
}
let name=document.querySelector("#name").value
let email=document.querySelector("#email").value
let password=document.querySelector("#password").value
// let user
let s=new user(name,email,password)

s.signup(email,password)
}

