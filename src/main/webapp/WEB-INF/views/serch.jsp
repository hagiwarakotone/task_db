<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div>
		<%
		String message = (String) request.getAttribute("noDataMassage");
		if (message != null && !message.isEmpty()) {
		%>
		<span class="error"><%=message%></span>
		<%
		}
		%>

		<form:form modelAttribute="serch" method="post" action="/sertchResult">
			<h1 class="h1">
				検索したい単語を入力してください。 </br> 空白検索の場合は全件表示します。
			</h1>


			<div class="serch">
				<p>
					単語名:
					<form:input type="text" path="serchname" class="serchname" />
				</p>

			</div>
	</div>



	<a href="/menu" class="returnMenu">メニューへ戻る</a>
</body>
</html>