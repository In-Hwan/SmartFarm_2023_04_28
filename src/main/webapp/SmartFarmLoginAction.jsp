<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import = "user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.nio.file.attribute.UserDefinedFileAttributeView" %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="UserID"/>
<jsp:setProperty name="user" property="UserPassword"/>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <meta name="viewport" content="width=device-width", initial-scale="1">
    <link rel="stylesheet" href="css/bootstrap.css">
    <title>DREAM</title>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="navbar">
        <button type="button" class="navbar-toggler collapse"
                data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                aria-expanded="false">
            <span> class="icon-bar"></span>
            <span> class="icon-bar"></span>
            <span> class="icon-bar"></span>
            <span> class="icon-bar"></span>
        </button>
        <!-- 로고 이미지 -->
        <div class="text-center">
            <a href="SmartFarmMain_cp.jsp"> <img class="img-responsive center-block img-circle" alt="스마트팜 로그인 로고" src="image/smartpage_login_logo.png"></a>
        </div>
    </div>
</nav>
    <%
        UserDAO userDAO = new UserDAO();
        int result = userDAO.login(user.getUserID(), user.getUserPassword());
        if (result == 1) {
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("location.href = 'SmartFarmMain.jsp");
            script.println("</script>");
        }
        else if (result == 0) {
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("alert('비밀번호가 틀립니다.')");
            script.println("history.back()");
            script.println("</script>");
        }
        else if (result == -1) {
            PrintWriter script = response.getWriter();
            script.println("<script>");
            script.println("alert('')");
            script.println("history.back()");
            script.println("</script>");

        }
    %>
</body>
</html>
