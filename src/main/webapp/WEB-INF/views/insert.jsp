<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規作成</title>
<link href="css/style.css" rel="stylesheet">

</head>
<body>

	<form:form modelAttribute="insert" method="post"
		action="/insertConfirm">
		<div class="insert">
			<p>
				<form:errors path="insertVocabularys" cssStyle="color:red" />
				単語:
				<form:input type="text" path="insertVocabularys" class="vocabularys" />
			</p>

			<p>
				<form:errors path="insertMeaning" cssStyle="color:red" />
				意味:
				<form:input type="text" path="insertMeaning" class="insertMeaning" />
			</p>

			<button type="submit" class="btn">登録する</button>


		</div>
	</form:form>
	<a href="/menu" class="returnMenu">メニューへ戻る</a>
</body>
</html>