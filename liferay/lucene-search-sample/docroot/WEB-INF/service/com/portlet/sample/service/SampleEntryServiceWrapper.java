/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.portlet.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleEntryService}.
 *
 * @author Scalsysu5
 * @see SampleEntryService
 * @generated
 */
public class SampleEntryServiceWrapper implements SampleEntryService,
	ServiceWrapper<SampleEntryService> {
	public SampleEntryServiceWrapper(SampleEntryService sampleEntryService) {
		_sampleEntryService = sampleEntryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sampleEntryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sampleEntryService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sampleEntryService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SampleEntryService getWrappedSampleEntryService() {
		return _sampleEntryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSampleEntryService(
		SampleEntryService sampleEntryService) {
		_sampleEntryService = sampleEntryService;
	}

	@Override
	public SampleEntryService getWrappedService() {
		return _sampleEntryService;
	}

	@Override
	public void setWrappedService(SampleEntryService sampleEntryService) {
		_sampleEntryService = sampleEntryService;
	}

	private SampleEntryService _sampleEntryService;
}