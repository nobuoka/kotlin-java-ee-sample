<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<html lang="ja">
<head>
  <title>こんにちは！ Kotlin！</title>
</head>
<body>
<section>
  <h1>Hello Kotlin!</h1>
  <form method="POST" action="/comments">
    コメント : <input type="text" name="comment-text">
    <input type="submit">
  </form>
  <c:forEach items="${comments}" var="c" varStatus="status">
  <div class="comment">
    <span class="comment-id">${c.id}</span>
    <span class="comment-text">${c.text}</span>
  </div>
  </c:forEach>
</section>
</body>
</html>
