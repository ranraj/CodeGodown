package com.yaliprowess.liferay.portlet.hook;

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
import com.liferay.portal.kernel.util.DocumentConversionUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portlet.blogs.service.BlogsEntryServiceUtil;

public class CustomStrutsAction extends BaseStrutsPortletAction {

	@Override
	public void serveResource(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) {

		long entryId = ParamUtil.getLong(resourceRequest, "entryId");		
		BlogsEntry entry;
		try {
			entry = BlogsEntryServiceUtil.getEntry(entryId);
			InputStream is = new UnsyncByteArrayInputStream(entry.getContent()
					.toString().getBytes(StringPool.UTF8));
			File destinationFile = null;

			destinationFile = DocumentConversionUtil.convert(entry.getEntryId()
					+ "", is, "html", "pdf");
			OutputStream out = resourceResponse.getPortletOutputStream();
			InputStream in = new FileInputStream(destinationFile);
			HttpServletResponse httpRes = PortalUtil
					.getHttpServletResponse(resourceResponse);
			HttpServletRequest httpReq = PortalUtil
					.getHttpServletRequest(resourceRequest);
			ServletResponseUtil.sendFile(httpReq, httpRes,
					destinationFile.getName(), in, "application/pdf");
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