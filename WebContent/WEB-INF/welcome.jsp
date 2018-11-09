<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
	<c:forEach items="${clothesList}" var="m">
		<tr>
			<td>
				${m.category}
			</td>
			<td>
				${m.style}
			</td>
			<td>
				${m.type}
			</td>
			<td>
				${m.colour}
			</td>
		<td>
				${m.cost}
			</td>
		<td>
				${m.size}
			</td>
			<td>
				<a class="btn btn-primary" href='Product?clothes_id=${m.clothes_id}'> Details</a>
			</td>
		
		</tr>
	</c:forEach>
</table>
</body>
</html>