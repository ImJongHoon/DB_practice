<%--
  Created by IntelliJ IDEA.
  User: imJongHoon
  Date: 2022-12-05
  Time: 오후 7:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="customer.CustomerDAO" %>
<jsp:useBean id="customer" class="customer.Customer" scope="page" />
<jsp:setProperty name="customer" property="customer_name" />
<jsp:setProperty name="customer" property="customer_phone" />
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if(customer.getCustomer_name() == null || customer.getCustomer_phone() == null){
    %>
        <script>
            alert("입력이 안 된 사항이 있습니다.");
            history.back();
        </script>
    <%
        } else {
            CustomerDAO customerDAO = new CustomerDAO();
            customerDAO.join(customer);%>
        <script>
            location.href = 'customer.jsp';
        </script>
    <%
        }
    %>
</body>
</html>
