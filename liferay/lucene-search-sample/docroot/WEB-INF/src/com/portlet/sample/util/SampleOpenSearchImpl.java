package com.portlet.sample.util;

import com.liferay.portal.kernel.search.HitsOpenSearchImpl;

public class SampleOpenSearchImpl extends HitsOpenSearchImpl {

	
	public static final String SEARCH_PATH = "/c/sampleEntry/open_search";
	public static final String TITLE = "Liferay Sample Search: ";	
	
	
	@Override
	public String getPortletId() {
		// TODO Auto-generated method stub
		return SampleIndexer.PORTLET_ID;
	}

	@Override
	public String getSearchPath() {
		// TODO Auto-generated method stub
		return SEARCH_PATH;
	}

	@Override
	public String getTitle(String keywords) {
		// TODO Auto-generated method stub
		return TITLE + keywords;
	}

}
