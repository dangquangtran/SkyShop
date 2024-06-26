<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from askbootstrap.com/preview/osahan-eat/theme-sidebar/forgot.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 19 Oct 2022 05:04:58 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" type="image/png" href="img/logo1.png">
        <title>Onlinebookstore</title>
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="css/osahan.css" rel="stylesheet">
        <link href="font/stylesheet.css" rel="stylesheet">
        <link href="vendor/mdi-icons/css/materialdesignicons.min.css" rel="stylesheet">
        <link href="css/custom.css" rel="stylesheet">
    </head>
    <body id="page-top" style="background: whitesmoke">
        <div class="row osahan-login m-0">
            <div class="col-md-3  px-10">
            </div>
            <div class="col-md-6 d-flex justify-content-center flex-column px-0 w-100">
                <div class="col-lg-6 mx-auto">
                    <h1 class="mb-2 w-100" style="margin-top: 50%; color: #120851 ">QUÊN MẬT KHẨU</h1>
                    <p class="mb-5" style="color: red">Vui lòng nhập địa chỉ email của bạn để tiếp tục</p>
                    <form>
                        <div class="d-flex align-items-center mb-4">
                            <div class="mr-3 bg-light rounded p-2 osahan-icon"><i class="mdi mdi-email-outline"></i></div>
                            <div class="w-100">
                                <p class="mb-0 small font-weight-bold text-dark">Email Address</p>
                                <input type="email" class="form-control form-control-sm p-0 border-input border-0 rounded-0" placeholder="Enter Your Email">
                            </div>
                        </div>
                        <div class="mb-3">
                            <a href="contact.jsp" class="btn btn-primary btn-block mb-2" data-toggle="modal" data-target="#myforgotModal">GỬI</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myforgotModal" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog bg-white">
                <div class="modal-content">
                    <button type="button" class="close p-2" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <div class="modal-body text-center p-3 d-flex justify-content-center flex-column">
                        <i class="mdi mdi-check-circle-outline text-success mb-4 display-1"></i>
                        <h2 class="mb-3">Reset email sent</h2>
                        <p class="m-0 px-lg-3">We have just sent an email with a password reset link to <span class="font-weight-bold text-primary"><a href="https://askbootstrap.com/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="5e373f33312d3f363f301e39333f3732703d3133">[email&#160;protected]</a></span></p>
                    </div>
                    <div class="modal-footer border-0 pb-0 px-3 pt-0">
                        <a href="index.jsp" class="btn btn-primary btn-block m-0">Got it</a>
                        <a href="forgot.jsp" class="btn btn-light btn-block mt-2 mb-3">Send again</a>
                    </div>
                </div>
            </div>
        </div>

        <script data-cfasync="false" src="js/email-decode.min.js"></script><script src="vendor/jquery/jquery.min.js" type="c8acaba54e8507a041a6da4c-text/javascript"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js" type="c8acaba54e8507a041a6da4c-text/javascript"></script>

        <script src="vendor/jquery-easing/jquery.easing.min.js" type="c8acaba54e8507a041a6da4c-text/javascript"></script>

        <script src="js/osahan.min.js" type="c8acaba54e8507a041a6da4c-text/javascript"></script>
        <script src="js/rocket-loader.min.js" data-cf-settings="c8acaba54e8507a041a6da4c-|49" defer=""></script><script defer src="https://static.cloudflareinsights.com/beacon.min.js/v652eace1692a40cfa3763df669d7439c1639079717194" integrity="sha512-Gi7xpJR8tSkrpF7aordPZQlW2DLtzUlZcumS8dMQjwDHEnw9I7ZLyiOj/6tZStRBGtGgN6ceN6cMH8z7etPGlw==" data-cf-beacon='{"rayId":"75c6f94ece5f7d56","version":"2022.10.3","r":1,"token":"dd471ab1978346bbb991feaa79e6ce5c","si":100}' crossorigin="anonymous"></script>
    </body>

    <!-- Mirrored from askbootstrap.com/preview/osahan-eat/theme-sidebar/forgot.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 19 Oct 2022 05:04:58 GMT -->
</html>