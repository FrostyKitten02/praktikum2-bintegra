/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package si.bintegra.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import si.bintegra.model.Offer;
import si.bintegra.service.OfferService;
import si.bintegra.service.OfferServiceUtil;
import si.bintegra.service.persistence.CustomerServicePersistence;
import si.bintegra.service.persistence.FooPersistence;
import si.bintegra.service.persistence.OfferOptionPersistence;
import si.bintegra.service.persistence.OfferPersistence;
import si.bintegra.service.persistence.SubscriptionPersistence;

/**
 * Provides the base implementation for the offer remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link si.bintegra.service.impl.OfferServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see si.bintegra.service.impl.OfferServiceImpl
 * @generated
 */
public abstract class OfferServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, OfferService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OfferService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>OfferServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OfferService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		offerService = (OfferService)aopProxy;

		_setServiceUtilService(offerService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OfferService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Offer.class;
	}

	protected String getModelClassName() {
		return Offer.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = offerPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(OfferService offerService) {
		try {
			Field field = OfferServiceUtil.class.getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, offerService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected CustomerServicePersistence customerServicePersistence;

	@Reference
	protected FooPersistence fooPersistence;

	@Reference
	protected si.bintegra.service.OfferLocalService offerLocalService;

	protected OfferService offerService;

	@Reference
	protected OfferPersistence offerPersistence;

	@Reference
	protected OfferOptionPersistence offerOptionPersistence;

	@Reference
	protected SubscriptionPersistence subscriptionPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

	private static final Log _log = LogFactoryUtil.getLog(
		OfferServiceBaseImpl.class);

}