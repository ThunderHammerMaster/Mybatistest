<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		Employee List Page<br/><br/>
		<table border="2" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>LASTNAME</td>
				<td>EMAIL</td>
				<td>BIRTH</td>
				<td>CREATETIME</td>
				<td>DEPT</td>
				<td>DELETE</td>
				<td>EDIT</td>
			</tr>
			<c:forEach items="${requestScope.empL }" var="list">
				<tr>
					<td>${list.id }</td>
					<td>${list.lastName }</td>
					<td>${list.email }</td>
					<td>${list.birth }</td>
					<td>${list.createTime }</td>
					<td>${list.dept }</td>
					<td><a href="${pageContext.request.contextPath }/emp/del?id=${list.id }">delete</a></td>
					<td><a href="${pageContext.request.contextPath }/emp/edit?id=${list.id }">edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>