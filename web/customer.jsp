<%--
  Created by IntelliJ IDEA.
  User: imJongHoon
  Date: 2022-12-05
  Time: 오후 5:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>고객의 상담 신청</title>
    <link rel="stylesheet" href="./resources/styles/style.css">
</head>
<body class="customer__body">
<main class="customer__main">
    <div class="left__div">
        <h1 class="title">고객 등록하기</h1>
        <form method="post" action="customerAction.jsp">
            <input name="customer_name" type="text" placeholder="이름" required/>

            <input name="customer_phone" type="text" placeholder="전화번호" required/>

            <button class="submit_btn" type="submit">제출</button>
        </form>
    </div>

    <div class="right__div">
        <h1 class="title">상담 신청하기</h1>
        <form action="">

        </form>
    </div>
</main>
</body>
</html>
