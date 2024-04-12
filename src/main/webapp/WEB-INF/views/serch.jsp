<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div>




		<form:form modelAttribute="serch" method="post" action="/serchResult">
			<h1 class="h1">
				検索したい単語を入力してください。 </br> 空白検索の場合は全件表示します。
			</h1>

			<%
			String message = (String) request.getAttribute("noVocMassage");
			if (message != null && !message.isEmpty()) {
			%>
			<span class="error"><%=message%></span>
			<%
			}
			%>

			<div class="serch">
				<p>
					単語名:
					<form:input type="text" path="serchName" class="serchName" />
				</p>
			</div>
			<button type="submit" class="btn">検索</button>

		</form:form>
	</div>



	<a href="/menu" class="returnMenu">メニューへ戻る</a>
</body>
</html>