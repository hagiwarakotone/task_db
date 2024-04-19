<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jp.co.example.entity.Library"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果画面</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<form:form modelAttribute="delete" method="post" action="/delete">
		<div class="serchResult">
			<h1>↓↓検索結果↓↓</h1>


			<div class="serchList">
				<table border="1" table="table">
					<thead>
						<tr>
							<th>単語</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<%
						List<Library> vocAndMeanList = (List<Library>) request.getAttribute("VocAndMean");
						int listSize = vocAndMeanList.size();
						if (vocAndMeanList != null) {
							for (Library vam : vocAndMeanList) {
						%>
						<tr>
							<td><%=vam.getVocabularys()%></td>
							<td><%=vam.getMeaning()%></td>
						</tr>
						<%
						}
						}
						%>
					</tbody>
				</table>
			</div>
			<a href="/menu" class="href">メニューへ戻る</a>
		</div>
		<form:form modelAttribute="delete" method="post" action="/delete">
			<%
			if (listSize == 1) {
			%>
			<input type="hidden" name="vocabularys"
				value="<%=vocAndMeanList.get(0).getVocabularys()%>">
			<input type="hidden" name="meaning"
				value="<%=vocAndMeanList.get(0).getMeaning()%>">
			<button type="submit" class="btn">削除</button>
			<%
			}
			%>
		</form:form>
</body>
</html>
