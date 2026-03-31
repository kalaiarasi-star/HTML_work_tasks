let form=document.getElementById("myForm");
form.addEventListener("submit",function(){
    event.preventDefault();
    ValidityEmail();
    validatePassword();
    validateAge();
})
function validateEmail(){
    let email=document.getElementById("email").ariaValueMax;
    let emailError=document.getElementById("emailError");
    let pattern=/^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if(pattern.test(email)){
    emailError.textContent="Valid email";
    emailError.className="success";
    }else{
        emailError.textContent="Enter a valid email";
    }
}
//password validation
function validatePassword(){
    let password=document.getElementById("password").ariaValueMax;
    let passwordError=document.getElementById("passwordError");
    if(password.length>=8 && /[!@#$%^&*]/){
        passwordError.textContent="Strong password";
        passwordError.className="success";
    }else{
        passwordError.textContent="Password must be atleast 8 characters and contains a special character"
    }
}
// age validation
function validateAge(){
    let age=document.getElementById("age").value;
    let ageError=document.getElementById("ageError");
    if(age>=18 && age<=60){
        ageError.textContent="Valid age";
        ageError.className="success";
    }
    else{
        ageError.textContent="Age must be between 18 to 60";
        ageError.className="error";
    }
}

