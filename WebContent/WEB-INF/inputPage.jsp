<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		Employee Input Page<br/><br/>
		<c:if test="${requestScope.a=='a'}">
			<form action="${pageContext.request.contextPath }/emp/add">
				<table cellpadding="10" cellspacing="0">
					<tr>
						<td>LastName:</td>
						<td><input type="text" name="lastName"></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Birth:</td>
						<td><input type="text" name="birth"></td>
					</tr>
					<tr>
						<td>Department:</td>
						<td>
							<select name="dept">
								<c:forEach items="${requestScope.deptList }" var="list">
									<option>${list.name }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
				</table>
				<input type="submit">
			</form>
		</c:if>
		
		<c:if test="${requestScope.a=='b'}">
			<form action="${pageContext.request.contextPath }/emp/update?id=${requestScope.emp.id}">
				<table cellpadding="10" cellspacing="0">
					<tr>
						<td>LastName:</td>
						<td><input type="text" name="lastName">${requestScope.emp.lastName }</td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input type="text" name="email">${requestScope.emp.email }</td>
					</tr>
					<tr>
						<td>Birth:</td>
						<td><input type="text" name="birth">${requestScope.emp.birth }</td>
					</tr>
					<tr>
						<td>Department:</td>
						<td>
							<select name="dept">
								<option>${requestScope.emp.dept }</option>
								<c:forEach items="${requestScope.deptList }" var="list">
									<option>${list.name }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
				</table>
				<input type="submit">
			</form>
		</c:if>
	</center>
</body>
</html>