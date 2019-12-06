<h2 style="text-align: center">
	<fmt:message key="welcome" />
</h2>


<div class="span-11 box last">
	<h2>
		<fmt:message key="signup" />
	</h2>

	<c:if test="${errorduplicateuser}">
		<div class="error">
			<fmt:message key="error.duplicateuser" />
		</div>
	</c:if>

	<c:if test="${errormatch}">
		<div class="error">
			<fmt:message key="error.match" />
		</div>
	</c:if>

	<form action="signUp" method="post">
		<table>
			<tr>
				<td><fmt:message key="username" /></td>
				<td><input name="name" class=""/></td>
			</tr>
			<tr>
				<td><fmt:message key="password" /></td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td><fmt:message key="password.again" /></td>
				<td><input type="password" name="pass2" /></td>
			</tr>
		</table>
		<input type="submit" value="<fmt:message key="signup"/>">
	</form>
</div>

<p>&nbsp;</p>
<p>&nbsp;</p>