package com.test;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

public class MyCustomLoginAction extends Action {

	private static Logger log = Logger.getLogger(MyCustomLoginAction.class);

	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		log.info(" Custom action hook run method");
		HttpSession session = request.getSession();
		try {
			User user = UserLocalServiceUtil.getUser(PortalUtil
					.getUserId(request));			 		
			
			LastPath lastPath = null;
			String siteUrl = "/web" // Can be modified to /group
					        + user.getGroup().getFriendlyURL() // Getting current user group site. 
					        + "/" + "home";
			lastPath = new LastPath(request.getContextPath(), siteUrl);
			if (lastPath != null) {
				log.info("lastPath = " + lastPath.toString());
				session.setAttribute(WebKeys.LAST_PATH, lastPath);
			}
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
}