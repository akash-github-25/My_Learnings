let students=JSON.parse(localStorage.getItem("users"))||[]
document.querySelector("#sign_up").addEventListener("click",on)

function on(){
    // event.preventDefault()
    let name=document.querySelector("#name").value
    let email=document.querySelector("#email").value
    let password=document.querySelector("#password").value

    // if(email==)
    class user{
        constructor(name,email,password){
            this.name=name;
            this.email=email
            this.password=password
        }
        signup(email,password){
          let isValidated=true;
            // isValidated=this.validateemail && this.validatepassword
            if(isValidated){
                this.email=email
                this.password=password
                console.log(this)
                students.push(this)
                localStorage.setItem("users",JSON.stringify(students))
                window.location.href="login.html"
            }
        }
    }
    let s=new user(name,email,password)
    
    s.signup(email,password)
    
}
