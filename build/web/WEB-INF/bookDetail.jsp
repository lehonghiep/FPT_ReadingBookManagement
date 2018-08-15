<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <title>Magnetic - Stunning Responsive HTML5/CSS3 Photography Template</title>
        <meta charset="utf-8">
        <meta name="author" content="pixelhint.com">
        <meta name="description" content="Magnetic is a stunning responsive HTML5/CSS3 photography/portfolio website  template"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/mdb.min.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
    </head>
    <body>

        <%@include file="/WEB-INF/header-tag.jspf"%>

        <section class="main clearfix">

            <section class="top">	
                <div class="wrapper content_header clearfix">
                    <div class="work_nav">

                        <ul class="btn clearfix">
                            <li><a href="#" class="previous" data-title="Previous"></a></li>
                            <li><a href="index.html" class="grid" data-title="Portfolio"></a></li>
                            <li><a href="#" class="next" data-title="Next"></a></li>
                        </ul>							

                    </div><!-- end work_nav -->
                    <h1 class="title">${bookVO.title}</h1>
                </div>		
            </section><!-- end top -->

            <section class="wrapper">
                <div class="content">
                    <div style="width: 100%; height: 500px;">
                        <div style="float: left; width: 50%; text-align: center;">
                            <img style="width: 300px; height: 400px" src="${pageContext.servletContext.contextPath}/ProcessImage?book_id=${bookVO.bookID}" alt="">
                        </div>

                        <div style="float: left; width: 50%;">
                            <h1>${bookVO.authorName}</h1>
                            <span><i>${bookVO.publisherName}</i></span><br><br>
                            <p style="width: 550px;">${bookVO.brief}</p>
                            <div>
                                <c:if test="${!isAdded}">
                                    <form action="ProcessAddBook" method="POST">
                                        <input type="hidden" name="book_id" value="${bookVO.bookID}"/>
                                        <button type="submit" class="btn btn-dark-green" style="width: 170px; height: 35px; font-size: 12px; float: left;">Add to Bookcase</button>
                                    </form>
                                </c:if>
                                <c:if test="${isAdded}">
                                    <form action="ProcessDropBookFromBookCase" method="POST">
                                        <input type="hidden" name="book_id" value="${bookVO.bookID}"/>
                                        <button type="submit" class="btn btn-dark-green" style="width: 190px; height: 35px; font-size: 12px; float: left;">Drop From Bookcase</button>
                                    </form>
                                </c:if>
                                <form action="ProcessReadBook" method="POST">
                                    <input type="hidden" name="book_id" value="${bookVO.bookID}"/>
                                    <button type="submit" class="btn btn-dark-green" style="width: 100px; height: 35px; font-size: 12px; margin-left: 20px; float: left;">Read</button></form>
                            </div>
                        </div>
                    </div>
                </div><!-- end content -->
            </section>
        </section><!-- end main -->

    </body>
</html>