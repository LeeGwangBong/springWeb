<%--
  Created by IntelliJ IDEA.
  User: leegb
  Date: 2019-10-23
  Time: 오후 4:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookList</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/bookList.css">
</head>
<body>
<h1>BookList</h1>
<div>
    <button onclick="location.href='/bookRegist';">Regitst</button>
  <table style="border: 1px solid #cccccc;" cellpadding="1" cellspacing="1">
      <tr>
          <td>BookName</td>
          <td>Author</td>
          <td>Price</td>
          <td>Company</td>
          <td>Delete</td>
      </tr>
      <c:forEach items="${list}" var="book">

          <tr>
              <td>${book.bookName}</td>
              <td>${book.bookAuthor}</td>
              <td>${book.price}</td>
              <td>${book.company}</td>
              <td>
                  <button id="deleteBtn">delete</button>
              </td>
          </tr>
      </c:forEach>
  </table>
</div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="/resources/js/bookList.js"></script>

</body>
</html>
