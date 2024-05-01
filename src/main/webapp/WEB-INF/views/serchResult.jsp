<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jp.co.example.entity.Library"%>
<%@ page import="java.util.List"%>
<%@ page import="jp.co.example.controller.form.DeleteForm"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果画面</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="serchResult">
		<h1>↓↓検索結果↓↓</h1>


		<div class="serchList">
			<table border="1" table="table">
				<thead>
					<tr>
						<th>単語</th>
						<th>意味</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<Library> vocAndMeanList = (List<Library>) request.getAttribute("VocAndMean");
					int count = 0;
					if (vocAndMeanList != null) {
						for (Library vam : vocAndMeanList) {
					%>
					<tr>
						<td><%=vam.getVocabularys()%></td>
						<td><%=vam.getMeaning()%></td>
					</tr>
					<%
					count++;
					}
					}
					System.out.println(count);
					%>

				</tbody>

			</table>
		</div>
		<a href="/menu" class="href">メニューへ戻る</a>
	</div>

	<form:form action="/delete" modelAttribute="deleteForm">
		<%
		if (count == 1) {
		%>
		<form:hidden path="vocabularys"
			value="<%=vocAndMeanList.get(0).getVocabularys()%>" />

		<button type="submit" class="btn">削除</button>
		<%
		}
		%>
	</form:form>


</body>
</html>
