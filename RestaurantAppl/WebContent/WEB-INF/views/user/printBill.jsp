<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Print Bill</title>
		<style>
			table {
				font-family: Arial;
				font-size: 15px;
			}
			td.fixedWidth {
				width: 160px;
			}
		</style>
	</head>
	
	<body>
		<table>
			<tr>
				<td> Bill No.: &nbsp;${orderForm.billNum} </td>
				<td class="fixedWidth" align="right"> ${orderForm.billDate} </td>
			</tr>
			<tr>
				<td colspan="2"> <br /> </td>
			</tr>
			<c:forEach items="${orderForm.orderedItems}" var="orderItem">
				<tr>
					<td> ${orderItem.itemName} - ${orderItem.quantity} </td>
					<c:set var="cost" value="${orderItem.quantity * orderItem.itemCost}" />
					<td>  &nbsp; &nbsp; <b>${cost}</b> </td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2"> <hr /> </td>
			</tr>
			<tr>
				<td align="right"> Bill Amount: </td>
				<td> &nbsp; &nbsp; <b>${orderForm.billAmount}</b> </td>
			</tr>
			<c:set var="discount" value="${orderForm.discount}"/>
			<c:if test="${discount > 0}">
				<tr>
					<td align="right"> Discount: </td>
					<td> &nbsp; &nbsp; <b>${orderForm.discount}</b> </td>
				</tr>
				<tr>
					<td align="right"> Net Amount: </td>
					<td> &nbsp; &nbsp; <b>${orderForm.billNetAmount}</b> </td>
				</tr>
			</c:if>
			<tr>
				<td colspan="2"> <br /> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="Print Bill" onclick="window.print()" />
				</td>
			</tr>
		</table>
	</body>
</html>