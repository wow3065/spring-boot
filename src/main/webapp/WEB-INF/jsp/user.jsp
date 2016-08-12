<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
<c:choose>
<c:when test="${not empty user}">
<c:forEach items="${user}" var="item">
    ${item.id}--${item.username}--${item.userage}
    <br/>
</c:forEach>
</c:when>
<c:when test="${empty user}">
    There is no user.
</c:when>
</c:choose>
</body>

</html>