package com.portlet.sample.action;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.portlet.sample.model.SampleEntry;
import com.portlet.sample.service.SampleEntryLocalServiceUtil;

public class SampleAdd extends Action {
	
	
	public void processAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		PortletRequest portletRequest = (PortletRequest) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);
		ThemeDisplay td = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		System.out.println("processAction calling ");
		String userName = request.getParameter("userName");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				SampleEntry.class.getName(), portletRequest);
		SampleEntryLocalServiceUtil.addEntry(td.getUserId(), td.getLayout()
				.getGroupId(), userName, title, content, serviceContext);
		

	}
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		PortletRequest portletRequest = (PortletRequest) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);
		ThemeDisplay td = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		System.out.println("execute method calling ");
		String userName = request.getParameter("userName");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				SampleEntry.class.getName(), portletRequest);
		SampleEntryLocalServiceUtil.addEntry(td.getUserId(), td.getLayout()
				.getGroupId(), userName, title, content, serviceContext);
		return mapping.findForward("portlet.test.search");
	}
	
	
	
	public ActionForward render(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		String search = ParamUtil.getString(request, "search");
		if (search.equalsIgnoreCase("search")) {
			System.out.println("search code executing");
			//String searchTitle = request.getParameter("searchTitle");
			//String searchContent = request.getParameter("searchContent");
			//System.out.println("searchtitle" + searchTitle);
			//System.out.println("searchContent" + searchContent);
			//request.setAttribute("searchTitle", searchTitle);
			//request.setAttribute("searchContent", searchContent);
			String keyword = request.getParameter("keyword");
			request.setAttribute("keyword", keyword);
			return mapping.findForward("portlet.test.display");
		}
		return mapping.findForward("portlet.test.search");
	}

}
