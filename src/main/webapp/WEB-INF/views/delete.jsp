<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jp.co.example.entity.Library"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除画面</title>
<link href="css/style.css" rel="stylesheet">

</head>
<body>
	<h1>

		<%=(String) request.getAttribute("delete")%>
		を削除しました。
	</h1>

	<a href="/menu" class="href">メニューへ戻る</a>
</body>
</html>
