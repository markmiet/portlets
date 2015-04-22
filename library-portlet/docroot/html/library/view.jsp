<%@include file="/html/library/init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<portlet:renderURL var="updateBookURL">
	<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_UPDATE%>" />
</portlet:renderURL>
<br />
<a href="<%=updateBookURL%>">Add new Book &raquo;</a>
<%
	PortletURL listBooksURL = renderResponse.createRenderURL(); listBooksURL.setParameter("jspPage", LibraryConstants.PAGE_VIEW);
%>
&nbsp;|&nbsp;
<a href="<%=listBooksURL.toString()%>">Show All Books &raquo;</a>
