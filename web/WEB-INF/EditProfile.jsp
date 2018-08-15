<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/EditProfile.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
        <div class="container bootstrap snippet" style="margin-top: 100px">
                <div class="row">
                    <div class="col-sm-3"><!--left col-->
                        <div class="text-center">
                            <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-square img-thumbnail" alt="avatar">
                            <h6>Upload a different photo...</h6>
                            <input type="file" class="text-center center-block file-upload">
                        </div>    
                    </div><!--/col-3-->

                    <div class="col-sm-9">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#name"><b>Edit Profile</b></a></li>
                            <li><a data-toggle="tab" href="#account"><b>Account Management</b></a></li>
                        </ul>
            
                          
                    <div class="tab-content">
                        <div class="tab-pane active" id="name">
                            <hr>
                              <form class="form" action="##" method="post" id="registrationForm">
                                  <div class="form-group">
                                      
                                      <div class="col-xs-6">
                                          <label for="first_name"><h4>First name</h4></label>
                                          <input type="text" class="form-control" name="first_name" id="first_name" placeholder="First name" title="Enter your first name." required>
                                      </div>
                                  </div>

                                  <div class="form-group">
                                      
                                      <div class="col-xs-6">
                                        <label for="last_name"><h4>Last name</h4></label>
                                          <input type="text" class="form-control" name="last_name" id="last_name" placeholder="Last name" title="Enter your last name." required>
                                      </div>
                                  </div>
                                  
                                  <div class="form-group">

                                  <div class="form-group">
                                      
                                        <div class="col-xs-6">
                                            <label for="email"><h4>Email</h4></label>
                                            <input type="email" class="form-control" name="email" id="email" placeholder="You@email.com" title="Enter your email." required>
                                        </div>
                                    </div>

                                  <div class="form-group">
                                      <div class="col-xs-6">
                                          <label for="phone"><h4>Phone</h4></label>
                                          <input type="tel" class="form-control" name="phone" id="phone" placeholder="Enter phone" maxlength="10" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" title="Enter your phone number." required>
                                      </div>
                                  </div>
                                     
                                  <div class="col-xs-6">
                                        <div  style="float: left"><label for="gender"><h4>Gender</h4></label></div>
                                        <div style="float: left; margin-left: 50px; margin-top: 9px;" >
                                            <input type="radio"  name="gender" id="male" value="male" style="float: left"><p style="float: left; font-size: 17px; margin-left: 8px">Male</p>  <br><br>
                                            <input type="radio"  name="gender" id="male" value="female" style="float: left"><p style="float: left; font-size: 17px;  margin-left: 8px">Female</p>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="form-group"> <!--BIRTHDATE -->
                                  
                                    <div class="col-xs-6">
                                        <label for="birthDate"><h4>Birth Date</h4></label>
                                        <input type="date" class="form-control" name="birthDate" id="birthDate" required>
                                    </div>
                                </div><!--BIRTHDATE -->

                                  <div class="form-group">
                                       <div class="col-xs-12">
                                            <br>
                                              <button class="btn btn-lg btn-success" type="submit"><i class="glyphicon glyphicon-ok-sign"></i> Save</button>
                                               <button class="btn btn-lg" type="reset"><i class="glyphicon glyphicon-repeat"></i> Reset</button>
                                        </div>
                                  </div>
                              </form>  
                        </div><!--/tab-content-->

                        <div class="tab-pane" id="account">
                                <hr>
                                  <form class="form" action="##" method="post" id="registrationForm">
                                      <div class="form-group">
                                          
                                          <div class="col-xs-6">
                                              <label for="username"><h4>Username</h4></label>
                                              <input type="text" class="form-control" name="username" id="username" placeholder="Username" title="Enter your Username." required>
                                          </div>
                                      </div>
                                      
                                      <div class="form-group">
                                          
                                          <div class="col-xs-6">
                                              <label for="password"><h4>Password</h4></label>
                                              <input type="password" class="form-control" name="password" id="password" placeholder="Password" title="Enter your password." required>
                                          </div>
                                      </div>
                                      
                                      <div class="form-group">
                                          
                                          <div class="col-xs-6">
                                            <label for="password2"><h4>Confirm password</h4></label>
                                              <input type="password" class="form-control" name="password2" id="password2" placeholder="Confirm password" title="Confirm your password." required>
                                          </div>
                                      </div>
    
                                      <div class="form-group">
                                           <div class="col-xs-12">
                                                <br>
                                                  <button class="btn btn-lg btn-success" type="submit"><i class="glyphicon glyphicon-ok-sign"></i> Save</button>
                                                   <button class="btn btn-lg" type="reset"><i class="glyphicon glyphicon-repeat"></i> Reset</button>
                                            </div>
                                      </div>
                                  </form>  
                            </div><!--/tab-content-->
            
                    </div><!--/col-9-->
                </div><!--/row-->
            </div>
</body>
</html>