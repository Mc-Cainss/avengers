<div style="height: 5vw; width: auto; border-radius: 5px;"></div>
<div class="span-10 apprend-1 last">
	<div class="divWelcome">
		<h2 class="atlWelcome" style="margin-bottom: 10px">
			<c:if test="${loggedUser eq name}">
				<fmt:message key="welcome" />
			</c:if>${name}</h2>
		<div style="margin-top: 5vw"></div>
		<%@ include file="/WEB-INF/templates/networkDetails.jspf"%>
	</div>
</div>
<div class="span-20 prepend-1 timeline"
	style="border-radius: 10px; margin-left: 4vw;">
	<div class="centre">
		<div class="span-15 prepend-1" style="margin-top:2vw">

			<c:choose>
				<c:when test="${loggedUser eq name}">
					<div id="updateform" class="box" style="margin-top:2w;">
						<form method="post" action="!${name}">
							<c:choose>
								<c:when test="${!empty replyTo}">
									<fmt:message key="replyto" />
									<i>${replyTo}</i>:
	  	</c:when>
								<c:otherwise>
									<b><i>${name}</i></b>, <fmt:message key="wazza" />
								</c:otherwise>
							</c:choose>
							<textarea name="content" placeholder="What's up?" rows="3" cols="60"><c:if
									test="${!empty replyTo}">@${replyTo} </c:if></textarea>
							<br /> <input type="hidden" name="replyTo" value="${replyTo}" />
							<input type="hidden" name="replyPid" value="${replyPid}" /> <input
								type="submit" class=bouton value="<fmt:message key="update"/>" />
						</form>
					</div>
				</c:when>
				<c:otherwise>
					<c:if test="${loggedIn}">
						<%@ include file="/WEB-INF/templates/userFollow.jspf"%>
					</c:if>
				</c:otherwise>
			</c:choose>
		</div>
	</div>

	<%@ include file="/WEB-INF/templates/posts.jspf"%>
</div>


