<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sec:authorize ifAnyGranted="ROLE_USER">
	<c:redirect url="user/home"/>
</sec:authorize>

<sec:authorize ifAnyGranted="ROLE_MANAGER">
	<c:redirect url="manager/home"/>
</sec:authorize>

<sec:authorize ifAnyGranted="ROLE_ADMIN">
	<c:redirect url="admin/home"/>
</sec:authorize>