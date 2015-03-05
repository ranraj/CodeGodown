package com.portlet.sample.searchcontainer;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class SampleEntryDisplayTerm extends DisplayTerms {

	public static final String USER_NAME = "userName";

	public static final String TITLE = "title";

	public static final String CONTENT = "content";

	public SampleEntryDisplayTerm(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		userName = ParamUtil.getString(portletRequest, USER_NAME);
		title = ParamUtil.getString(portletRequest, TITLE);
		content = ParamUtil.getString(portletRequest, CONTENT);

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	protected String userName;
	protected String title;
	protected String content;

}
