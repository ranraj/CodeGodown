<%@ include file="/html/portlet/test/init.jsp"%>

<%    
	PortletURL viewPageURL = renderResponse.createActionURL();
	viewPageURL.setParameter("_spage", "/portlet_action/test/addView");
	viewPageURL.setParameter("urlType", "Action");
	viewPageURL.setWindowState(WindowState.NORMAL);
	
	
	PortletURL renderPageUrl = renderResponse.createActionURL();
	renderPageUrl.setParameter("_spage", "/portlet_action/test/searchPage");
	renderPageUrl.setParameter("urlType", "Action");
	renderPageUrl.setWindowState(WindowState.NORMAL);
%>

<form name="myform" action="<%= viewPageURL%>" method="post">

	<table style="border-spacing: 10px 10px; border-collapse: separate;">
		<tr>

			<td>Username :</td>
			<td><input type="text" name="<portlet:namespace/>userName" value=""/></td>
		</tr>
		<tr>
			<td>Title :</td>
			<td><input type="text" name="<portlet:namespace/>title" /></td>
		</tr>
		<tr>
			<td>Content :</td>
			<td><input type="text" name="<portlet:namespace/>content" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit"></td>
		</tr>

	</table>
</form>


<div align="left">
	<a href="<%=renderPageUrl%>">Search Page</a>
</div>