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

package si.bintegra.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import si.bintegra.model.CustomerService;

/**
 * The persistence utility for the customer service service. This utility wraps <code>si.bintegra.service.persistence.impl.CustomerServicePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerServicePersistence
 * @generated
 */
public class CustomerServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CustomerService customerService) {
		getPersistence().clearCache(customerService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CustomerService> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CustomerService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomerService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomerService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CustomerService> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CustomerService update(CustomerService customerService) {
		return getPersistence().update(customerService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CustomerService update(
		CustomerService customerService, ServiceContext serviceContext) {

		return getPersistence().update(customerService, serviceContext);
	}

	/**
	 * Returns all the customer services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching customer services
	 */
	public static List<CustomerService> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the customer services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CustomerServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of customer services
	 * @param end the upper bound of the range of customer services (not inclusive)
	 * @return the range of matching customer services
	 */
	public static List<CustomerService> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the customer services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CustomerServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of customer services
	 * @param end the upper bound of the range of customer services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching customer services
	 */
	public static List<CustomerService> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CustomerService> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the customer services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CustomerServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of customer services
	 * @param end the upper bound of the range of customer services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching customer services
	 */
	public static List<CustomerService> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CustomerService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching customer service
	 * @throws NoSuchCustomerServiceException if a matching customer service could not be found
	 */
	public static CustomerService findByUuid_First(
			String uuid, OrderByComparator<CustomerService> orderByComparator)
		throws si.bintegra.exception.NoSuchCustomerServiceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching customer service, or <code>null</code> if a matching customer service could not be found
	 */
	public static CustomerService fetchByUuid_First(
		String uuid, OrderByComparator<CustomerService> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching customer service
	 * @throws NoSuchCustomerServiceException if a matching customer service could not be found
	 */
	public static CustomerService findByUuid_Last(
			String uuid, OrderByComparator<CustomerService> orderByComparator)
		throws si.bintegra.exception.NoSuchCustomerServiceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching customer service, or <code>null</code> if a matching customer service could not be found
	 */
	public static CustomerService fetchByUuid_Last(
		String uuid, OrderByComparator<CustomerService> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the customer services before and after the current customer service in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current customer service
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next customer service
	 * @throws NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 */
	public static CustomerService[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<CustomerService> orderByComparator)
		throws si.bintegra.exception.NoSuchCustomerServiceException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the customer services where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of customer services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching customer services
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the customer service in the entity cache if it is enabled.
	 *
	 * @param customerService the customer service
	 */
	public static void cacheResult(CustomerService customerService) {
		getPersistence().cacheResult(customerService);
	}

	/**
	 * Caches the customer services in the entity cache if it is enabled.
	 *
	 * @param customerServices the customer services
	 */
	public static void cacheResult(List<CustomerService> customerServices) {
		getPersistence().cacheResult(customerServices);
	}

	/**
	 * Creates a new customer service with the primary key. Does not add the customer service to the database.
	 *
	 * @param id the primary key for the new customer service
	 * @return the new customer service
	 */
	public static CustomerService create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the customer service
	 * @return the customer service that was removed
	 * @throws NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 */
	public static CustomerService remove(long id)
		throws si.bintegra.exception.NoSuchCustomerServiceException {

		return getPersistence().remove(id);
	}

	public static CustomerService updateImpl(CustomerService customerService) {
		return getPersistence().updateImpl(customerService);
	}

	/**
	 * Returns the customer service with the primary key or throws a <code>NoSuchCustomerServiceException</code> if it could not be found.
	 *
	 * @param id the primary key of the customer service
	 * @return the customer service
	 * @throws NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 */
	public static CustomerService findByPrimaryKey(long id)
		throws si.bintegra.exception.NoSuchCustomerServiceException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the customer service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the customer service
	 * @return the customer service, or <code>null</code> if a customer service with the primary key could not be found
	 */
	public static CustomerService fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the customer services.
	 *
	 * @return the customer services
	 */
	public static List<CustomerService> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the customer services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CustomerServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer services
	 * @param end the upper bound of the range of customer services (not inclusive)
	 * @return the range of customer services
	 */
	public static List<CustomerService> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the customer services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CustomerServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer services
	 * @param end the upper bound of the range of customer services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer services
	 */
	public static List<CustomerService> findAll(
		int start, int end,
		OrderByComparator<CustomerService> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the customer services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CustomerServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer services
	 * @param end the upper bound of the range of customer services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of customer services
	 */
	public static List<CustomerService> findAll(
		int start, int end,
		OrderByComparator<CustomerService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the customer services from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of customer services.
	 *
	 * @return the number of customer services
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CustomerServicePersistence getPersistence() {
		return _persistence;
	}

	private static volatile CustomerServicePersistence _persistence;

}