package com.portlet.sample.searchcontainer;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DAOParamUtil;

public class SampleEntrySearchTerm extends SampleEntryDisplayTerm {

	public SampleEntrySearchTerm(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		userName = DAOParamUtil.getString(portletRequest, USER_NAME);
		title = DAOParamUtil.getString(portletRequest, TITLE);
		content = DAOParamUtil.getString(portletRequest, CONTENT);

	}

}
