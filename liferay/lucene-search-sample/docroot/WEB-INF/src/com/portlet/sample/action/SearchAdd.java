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
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.portlet.sample.model.SampleEntry;
import com.portlet.sample.service.SampleEntryLocalServiceUtil;

public class SearchAdd extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Searcing................");
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
