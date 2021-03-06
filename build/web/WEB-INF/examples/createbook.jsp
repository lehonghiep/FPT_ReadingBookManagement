<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    ADMIN
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="../assets/css/material-dashboard.css?v=2.1.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <!-- <link href="../assets/demo/demo.css" rel="stylesheet" /> -->
  <!-- <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
</head>

<body class="">
  <div class="wrapper ">
    <div class="sidebar" data-color="purple" data-background-color="white" data-image="../assets/img/sidebar-1.jpg">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

        Tip 2: you can also add an image using data-image tag
    -->
      <div class="logo">
        <a href="http://www.creative-tim.com" class="simple-text logo-normal">
          MAGNETIC
        </a>
      </div>
      <div class="sidebar-wrapper">
        <ul class="nav">
          



          
          <li class="nav-item ">
            <a class="nav-link" href="listbook.html">
              <i class="material-icons">list_alt</i>
              <p>Book List</p>
            </a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="createbook.html">
                <i class="material-icons">library_books</i>
                 <p>Create Book</p>
            </a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="createauthor.html">
              <i class="material-icons">person_add</i>
              <p>Create Author</p>
            </a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="createpublisher.html">
                <i class="material-icons">business</i>
                <p>Create Publisher</p>
              </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="createcategory.html">
                  <i class="material-icons">category</i>
                  <p>Create Category</p>
                </a>
              </li>
              <li class="nav-item ">
                  <a class="nav-link" href="report.html">
                    <i class="material-icons">report</i>
                    <p>Report</p>
                  </a>
                </li>
        </ul>
      </div>
    </div>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <a class="navbar-brand" href="#">CREATE BOOK</a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end">
            <form class="navbar-form">
              <div class="input-group no-border">
                <input type="text" value="" class="form-control" placeholder="Search...">
                <button type="submit" class="btn btn-white btn-round btn-just-icon">
                  <i class="material-icons">search</i>
                  <div class="ripple-container"></div>
                </button>
              </div>
            </form>
            <ul class="navbar-nav">
              



              <li class="nav-item dropdown">
                <a class="nav-link" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="material-icons">notifications</i>
                  <span class="notification">5</span>
                  <p class="d-lg-none d-md-block">
                    Some Actions
                  </p>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                  <a class="dropdown-item" href="#">Mike John responded to your email</a>
                  <a class="dropdown-item" href="#">You have 5 new tasks</a>
                  <a class="dropdown-item" href="#">You're now friend with Andrew</a>
                  <a class="dropdown-item" href="#">Another Notification</a>
                  <a class="dropdown-item" href="#">Another One</a>
                </div>
              </li>

            <!--BĂT SỰ KIỆN LOG OUT CHO ICON-->
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <i class="material-icons">person_add_disabled</i>
                  <p class="d-lg-none d-md-block">
                    Log out
                  </p>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-6">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title">Create New Book</h4>
                  <!-- <p class="card-category">Complete your profile</p> -->
                </div>

                <div class="card-body">
                  <form>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label class="bmd-label-floating">Title</label>
                          <input type="text" class="form-control" >
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label class="bmd-label-floating">Author</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                          <div class="form-group">
                            <label class="bmd-label-floating">Category</label>
                            <input type="text" class="form-control">
                          </div>
                        </div>
                      </div>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label class="bmd-label-floating">Publisher</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label class="bmd-label-floating"> Brief</label>
                          <textarea class="form-control" rows="5"></textarea>
                        </div>
                      </div>
                    </div><br>

                  <!--NÚT TẠO SÁCH - SAU KHI TẠO PHẢI SHOW ĐC TOÀN BỘ FILE SANG CỘT BÊN PHẢI TRÊN GIAO DIỆN WEB-->
                    <button type="submit" class="btn btn-primary pull-right">CREATE BOOK</button> 

                    <div class="clearfix"></div>
                  </form>
                </div>
              </div>
            </div>
          
            <!--NỘI DUNG SÁCH VỪA ĐƯỢC TẠO MỚI PHẢI ĐC SHOW Ở MỤC DƯỚI NÀY-->
            <div class="col-md-6">
              <div class="card card-profile">
                <div class=" text-center">
                  <a href="#">
                    <img class="img avatar img-square img-thumbnail" src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" alt="avatar" style="width: 300px; height:300px;"/>
                  </a>
                </div><br>
                
                <form action="" method="POST" role="form">
                    <input id="file" type="file" name="sortpic" class="file-upload" required=""/>
                </form><br>

                <!-- <button id="upload" class="btn btn-primary btn-round" style="width: 100px; margin-left: 210px">Upload</button> -->

                <div class="card-body">
                  <h3 class="card-category text-gray"><b>SHERLOCK HOLMES</b></h3> <!--Tên sách-->
                  <h4 class="card-title">Arthur Conan Doyle</h4> <!--Tác giả-->
                  <h6 class="text-gray">-NXB Kim Dong-</h6><br> <!--Nhà xuất bản-->
                  <p class="card-description"> <!--BRIEF-->
                    Don't be scared of the truth because we need to restart the human foundation in truth And I love you like Kanye loves Kanye 
                    I love Rick Owens’ bed design but the back is... Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime, explicabo 
                    beatae? Ducimus, qui quod hic nihil ratione ad? Natus fugit quam quaerat placeat, nisi impedit dolore cum officia voluptate. Minus
                  </p>
                  <!-- <a href="#pablo" class="btn btn-primary btn-round">Follow</a> -->
                </div>
              </div>
            </div>
            
          </div>
        </div>
      </div>

      
    </div>
  </div>
  <!--   Core JS Files   -->
  <script src="../assets/js/core/jquery.min.js" type="text/javascript"></script>
  <script src="../assets/js/core/popper.min.js" type="text/javascript"></script>
  <script src="../assets/js/core/bootstrap-material-design.min.js" type="text/javascript"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chartist JS -->
  <script src="../assets/js/plugins/chartist.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="../assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="../assets/js/material-dashboard.min.js?v=2.1.0" type="text/javascript"></script>
  <!-- Material Dashboard DEMO methods, don't include it in your project! -->
  <!-- <script src="../assets/demo/demo.js"></script> -->
  <script src="../assets/js/createbook.js"></script>
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script> -->

  <!-- <script>
      //xử lý khi có sự kiện click
      $('#upload').on('click', function () {
          //Lấy ra files
          var file_data = $('#file').prop('files')[0];
          //lấy ra kiểu file
          var type = file_data.type;
          //Xét kiểu file được upload
          var match = ["image/gif", "image/png", "image/jpg",];
          //kiểm tra kiểu file
          if (type == match[0] || type == match[1] || type == match[2]) {
              //khởi tạo đối tượng form data
              var form_data = new FormData();
              //thêm files vào trong form data
              form_data.append('file', file_data);
              //sử dụng ajax post
              $.ajax({
                  url: 'upload.php', // gửi đến file upload.php 
                  dataType: 'text',
                  cache: false,
                  contentType: false,
                  processData: false,
                  data: form_data,
                  type: 'post',
                  success: function (res) {
                      $('.status').text(res);
                      $('#file').val('');
                  }
              });
          } else {
              $('.status').text('Chỉ được upload file ảnh');
              $('#file').val('');
          }
          return false;
      });
  </script> -->
</body>

</html>