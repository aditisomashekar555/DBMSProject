<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">
<div class="col-xs-6">
	<img src='${clothes.imgUrl}' style="width:100%">
</div>
<div class="col-xs-6">

	<table class="table">
		<tr>
			<td>
				${clothes.category}
			</td>
			<td>
				${clothes.cost}
			</td>
		<td>
				${clothes.style}
			</td>
		<td>
				${clothes.type}
			</td>
		<td>
				${clothes.size}
			</td>
		<td>
				${clothes.colour}
			</td>
		</tr>

</table>
</div>
</div>
</body>
</html>