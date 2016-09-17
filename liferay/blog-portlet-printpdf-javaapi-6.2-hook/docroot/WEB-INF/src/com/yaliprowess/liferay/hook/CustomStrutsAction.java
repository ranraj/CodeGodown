package com.yaliprowess.liferay.hook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.portlet.PortletConfig;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.DocumentConversionUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portlet.blogs.service.BlogsEntryServiceUtil;

public class CustomStrutsAction extends BaseStrutsPortletAction {

	@Override
	public void serveResource(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) {
		
		long entryId = ParamUtil.getLong(resourceRequest, "entryId");
		ThemeDisplay themeDisplay =
				(ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

		BlogsEntry entry;
		try {			
			entry = BlogsEntryServiceUtil.getEntry(entryId);
			StringBundler sb = new StringBundler();

			sb.append("<html>");

			sb.append("<head>");
			sb.append("<meta content=\"");
			sb.append(ContentTypes.TEXT_HTML_UTF8);
			sb.append("\" http-equiv=\"content-type\" />");
			sb.append("<base href=\"");
			sb.append(themeDisplay.getPortalURL());
			sb.append("\" />");
			sb.append("</head>");

			sb.append("<body>");
			sb.append(entry.getContent());
			sb.append("</body>");
			sb.append("</html>");

			InputStream is = new UnsyncByteArrayInputStream(sb.toString().getBytes(StringPool.UTF8));
			File destinationFile = null;
			
			destinationFile = DocumentConversionUtil.convert(entry.getEntryId()
					+ "", is, "html", "pdf");
			OutputStream out = resourceResponse.getPortletOutputStream();
			InputStream in = new FileInputStream(destinationFile);
			HttpServletResponse httpRes = PortalUtil
					.getHttpServletResponse(resourceResponse);
			HttpServletRequest httpReq = PortalUtil
					.getHttpServletRequest(resourceRequest);
			String contentType = MimeTypesUtil.getContentType(destinationFile);
			ServletResponseUtil.sendFile(httpReq, httpRes,
					destinationFile.getName(), in, contentType);
			out.close();

		} catch (PortalException e) {
			System.out.println("PortalException : " + getClass().getName() + "\n" + e);
			//e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("SystemException : " + getClass().getName() + "\n" + e);
			//e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException : " + getClass().getName() + "\n" + e);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception : " + getClass().getName() + "\n" + e);
			//e.printStackTrace();
		}
	}
}