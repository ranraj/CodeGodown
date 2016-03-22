package com.yaliprowess.banner.display.portlet;

import java.io.File;
import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Image;
import com.liferay.portal.service.ImageLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DisplayController extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
				 
		ThemeDisplay themeDisplay =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
 		String expandoValue = themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("banner-name").toString();
 		FileEntry fe;
		try {
			fe = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), 0, expandoValue);
			File file = (DLFileEntryLocalServiceUtil.getFile(fe.getUserId(), fe.getFileEntryId(), fe.getVersion(), true));
			
			System.out.println(file.getAbsolutePath());
			Image image = ImageLocalServiceUtil.getImage(file);
			/*System.out.println(image);
			System.out.println(expandoValue);			
			*/
			String url = null;
			if(image != null){
			url = themeDisplay.getPortalURL()+"/c/document_library/get_file?uuid="+fe.getUuid()+"&groupId="+themeDisplay.getScopeGroupId();
			}
			request.setAttribute("imgUrl", url);
			
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		
		super.render(request, response);
	}
		
}
