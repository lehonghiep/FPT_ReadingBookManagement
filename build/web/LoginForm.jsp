<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/LoginForm.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type = "text/javascript" src="js/LoginForm.js"></script>
</head>
<body>
    <div class="login-page">
        <div class="form">
            <form action="ProcessRegister" method="POST" class="register-form">
              <input type="text" name="first-name" placeholder="first name" required/>
              <input type="text" name="last-name" placeholder="last name" required/>
              <input type="text" name="username" placeholder="username" required/>
              <input type="password" name="password" placeholder="password" required/>
              <input type="password" name="confirm-password" placeholder="confirm password" required/>
              <input type="email" name="email" placeholder="email address" required/>
              <input type="tel" name="phone" placeholder="phone" maxlength="10" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" required/>
              <input type="date" name="birthday" placeholder="birth date" required/>

            <button>create</button>
            <p class="message">Already registered? <a href="#">Sign In</a></p>
          </form>
    
          <form class="login-form" action="ProcessLogin" method="POST">
            <input type="text" name="username" placeholder="username" required/>
            <input type="password" name="password" placeholder="password" required/>
            <button type="submit">login</button>
            <p class="message">Not registered? <a href="#">Create an account</a></p>
          </form>
        </div>
      </div>
</body>
</html>
<script>
    $(function(){
        var message="${sessionScope.message}";
        if(message=='Invalid username or password'){
            alert(message);
        }
        
        var action="${sessionScope['action-register']}";
        if(action !=''){
            alert('Register '+action);
        }
    });  
</script>
