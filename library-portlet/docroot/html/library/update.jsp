<%@include file="/html/library/init.jsp"%>
<h1>Add / Edit Form</h1>
<%
	PortletURL updateBookURL = renderResponse.createActionURL(); 
updateBookURL.setParameter( ActionRequest.ACTION_NAME, "updateBook");
%>



<aui:form name="fm" method="POST" action="<%=updateBookURL.toString()%>">
	<aui:input name="bookTitle" label="Book Title">
		<aui:validator name="required" errorMessage="Pakollinen" />
	</aui:input>

	<aui:input name="author" helpMessage="helppi" />
	<aui:button type="submit" value="Save" />
</aui:form>



<br />
<a href="<portlet:renderURL/>">&laquo; Go Back</a>
<aui:script>
	Liferay.Util
			.focusFormField(document.<portlet:namespace/>fm.<portlet:namespace/>bookTitle);
</aui:script>
	

