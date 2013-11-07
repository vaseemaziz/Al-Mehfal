<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authorize ifAnyGranted="ROLE_USER">
	<c:set var="role" value="user"></c:set>
</sec:authorize>

<sec:authorize ifAnyGranted="ROLE_MANAGER">
	<c:set var="role" value="manager" ></c:set>
</sec:authorize>

<sec:authorize ifAnyGranted="ROLE_ADMIN">
	<c:set var="role" value="admin"></c:set>
</sec:authorize>
<ul style="display: block;" class="nav">
	<li>
		<a href='<c:url value="/${role}/home" />'>Home</a>
	</li>
	<li>
		<a href='<c:url value="/${role}/sales" />'>Sales</a>
	</li>
	<sec:authorize ifAnyGranted="ROLE_MANAGER, ROLE_ADMIN">
		<li>
			<a href='<c:url value="/${role}/rawMaterials" />'>Raw Materials</a>
		</li>
		<li>
			<a href='<c:url value="/${role}/suppliers" />'>Suppliers</a>
		</li>
		<li>
			<a href='<c:url value="/${role}/purchases" />'>Purchases</a>
		</li>
	</sec:authorize>
	<li>
		<a href='<c:url value="/${role}/profile" />'>Profile</a>
	</li>
	<li>
		<a href='<c:url value="/logout" />'>Logout</a>
	</li>
</ul>