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

package com.portlet.sample.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.portlet.sample.model.EntryComment;
import com.portlet.sample.service.EntryCommentService;
import com.portlet.sample.service.persistence.EntryCommentPersistence;
import com.portlet.sample.service.persistence.SampleEntryPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the entry comment remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.portlet.sample.service.impl.EntryCommentServiceImpl}.
 * </p>
 *
 * @author Scalsysu5
 * @see com.portlet.sample.service.impl.EntryCommentServiceImpl
 * @see com.portlet.sample.service.EntryCommentServiceUtil
 * @generated
 */
public abstract class EntryCommentServiceBaseImpl extends BaseServiceImpl
	implements EntryCommentService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.portlet.sample.service.EntryCommentServiceUtil} to access the entry comment remote service.
	 */

	/**
	 * Returns the entry comment local service.
	 *
	 * @return the entry comment local service
	 */
	public com.portlet.sample.service.EntryCommentLocalService getEntryCommentLocalService() {
		return entryCommentLocalService;
	}

	/**
	 * Sets the entry comment local service.
	 *
	 * @param entryCommentLocalService the entry comment local service
	 */
	public void setEntryCommentLocalService(
		com.portlet.sample.service.EntryCommentLocalService entryCommentLocalService) {
		this.entryCommentLocalService = entryCommentLocalService;
	}

	/**
	 * Returns the entry comment remote service.
	 *
	 * @return the entry comment remote service
	 */
	public com.portlet.sample.service.EntryCommentService getEntryCommentService() {
		return entryCommentService;
	}

	/**
	 * Sets the entry comment remote service.
	 *
	 * @param entryCommentService the entry comment remote service
	 */
	public void setEntryCommentService(
		com.portlet.sample.service.EntryCommentService entryCommentService) {
		this.entryCommentService = entryCommentService;
	}

	/**
	 * Returns the entry comment persistence.
	 *
	 * @return the entry comment persistence
	 */
	public EntryCommentPersistence getEntryCommentPersistence() {
		return entryCommentPersistence;
	}

	/**
	 * Sets the entry comment persistence.
	 *
	 * @param entryCommentPersistence the entry comment persistence
	 */
	public void setEntryCommentPersistence(
		EntryCommentPersistence entryCommentPersistence) {
		this.entryCommentPersistence = entryCommentPersistence;
	}

	/**
	 * Returns the sample entry local service.
	 *
	 * @return the sample entry local service
	 */
	public com.portlet.sample.service.SampleEntryLocalService getSampleEntryLocalService() {
		return sampleEntryLocalService;
	}

	/**
	 * Sets the sample entry local service.
	 *
	 * @param sampleEntryLocalService the sample entry local service
	 */
	public void setSampleEntryLocalService(
		com.portlet.sample.service.SampleEntryLocalService sampleEntryLocalService) {
		this.sampleEntryLocalService = sampleEntryLocalService;
	}

	/**
	 * Returns the sample entry remote service.
	 *
	 * @return the sample entry remote service
	 */
	public com.portlet.sample.service.SampleEntryService getSampleEntryService() {
		return sampleEntryService;
	}

	/**
	 * Sets the sample entry remote service.
	 *
	 * @param sampleEntryService the sample entry remote service
	 */
	public void setSampleEntryService(
		com.portlet.sample.service.SampleEntryService sampleEntryService) {
		this.sampleEntryService = sampleEntryService;
	}

	/**
	 * Returns the sample entry persistence.
	 *
	 * @return the sample entry persistence
	 */
	public SampleEntryPersistence getSampleEntryPersistence() {
		return sampleEntryPersistence;
	}

	/**
	 * Sets the sample entry persistence.
	 *
	 * @param sampleEntryPersistence the sample entry persistence
	 */
	public void setSampleEntryPersistence(
		SampleEntryPersistence sampleEntryPersistence) {
		this.sampleEntryPersistence = sampleEntryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return EntryComment.class;
	}

	protected String getModelClassName() {
		return EntryComment.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = entryCommentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.portlet.sample.service.EntryCommentLocalService.class)
	protected com.portlet.sample.service.EntryCommentLocalService entryCommentLocalService;
	@BeanReference(type = com.portlet.sample.service.EntryCommentService.class)
	protected com.portlet.sample.service.EntryCommentService entryCommentService;
	@BeanReference(type = EntryCommentPersistence.class)
	protected EntryCommentPersistence entryCommentPersistence;
	@BeanReference(type = com.portlet.sample.service.SampleEntryLocalService.class)
	protected com.portlet.sample.service.SampleEntryLocalService sampleEntryLocalService;
	@BeanReference(type = com.portlet.sample.service.SampleEntryService.class)
	protected com.portlet.sample.service.SampleEntryService sampleEntryService;
	@BeanReference(type = SampleEntryPersistence.class)
	protected SampleEntryPersistence sampleEntryPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private EntryCommentServiceClpInvoker _clpInvoker = new EntryCommentServiceClpInvoker();
}