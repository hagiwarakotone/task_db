<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet">
<title>新規入力画面</title>
</head>
<body>
	<h1 class=top>新規入力画面</h1>
	<form:form modelAttribute="insert" method="post"
		action="/insertConfirm">
		<div class="insert">
			<div class="grupeA">
				<p class="insertP">
					<form:input type="text" path="year" class="text" />
					年
				</p>
				<p class="insertP">
					<form:input type="text" path="month" class="text" />
					月分
				</p>
			</div>
			<p class="totalP">
				合計：
				<form:input type="text" path="monthTotal" class="text" />
			</p>

			<button type="submit" class="btn">登録する</button>
		</div>
	</form:form>
	<a href="/">メニューへ戻る</a>
</body>
</html>