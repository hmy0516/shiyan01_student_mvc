<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stuDao" class="com.student.dao.StudentDao"/>
<% 
		request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
	System.out.println(id);
		stuDao.studentDel(id);
		response.sendRedirect("studentManagement.jsp");
%>
</body>
</html>