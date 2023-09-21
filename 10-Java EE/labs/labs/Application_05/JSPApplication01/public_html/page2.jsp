<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>page2</title>
  </head>
  <body>
    <p>
      &nbsp;
    </p>
    <p>
      <c:out value="${param.firstname}"/>
    </p>
    <p>
      <c:out value="${param.lastName}"/>
    </p>
    <p>
      <c:set value="${param.firstName}" var="firstName" scope="session"/>
    </p>
    <p>
      <c:set value="${param.lastName}" var="lastName" scope="session"/>
    </p>
    <form action="page3.jsp">
      <p>
        &nbsp;
      </p>
      <p>
        Street Address<input type="text" name="streeAddress"/>City 
        <input type="text" name="city"/><input type="submit" value="Next Page"/>
      </p>
      <p>
        &nbsp;
      </p>
    </form>
  </body>
</html>