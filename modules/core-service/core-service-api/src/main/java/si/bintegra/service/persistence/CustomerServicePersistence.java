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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import si.bintegra.exception.NoSuchCustomerServiceException;
import si.bintegra.model.CustomerService;

/**
 * The persistence interface for the customer service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerServiceUtil
 * @generated
 */
@ProviderType
public interface CustomerServicePersistence
	extends BasePersistence<CustomerService> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomerServiceUtil} to access the customer service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the customer services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching customer services
	 */
	public java.util.List<CustomerService> findByUuid(String uuid);

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
	public java.util.List<CustomerService> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<CustomerService> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
			orderByComparator);

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
	public java.util.List<CustomerService> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching customer service
	 * @throws NoSuchCustomerServiceException if a matching customer service could not be found
	 */
	public CustomerService findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
				orderByComparator)
		throws NoSuchCustomerServiceException;

	/**
	 * Returns the first customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching customer service, or <code>null</code> if a matching customer service could not be found
	 */
	public CustomerService fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
			orderByComparator);

	/**
	 * Returns the last customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching customer service
	 * @throws NoSuchCustomerServiceException if a matching customer service could not be found
	 */
	public CustomerService findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
				orderByComparator)
		throws NoSuchCustomerServiceException;

	/**
	 * Returns the last customer service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching customer service, or <code>null</code> if a matching customer service could not be found
	 */
	public CustomerService fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
			orderByComparator);

	/**
	 * Returns the customer services before and after the current customer service in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current customer service
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next customer service
	 * @throws NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 */
	public CustomerService[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
				orderByComparator)
		throws NoSuchCustomerServiceException;

	/**
	 * Removes all the customer services where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of customer services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching customer services
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the customer service in the entity cache if it is enabled.
	 *
	 * @param customerService the customer service
	 */
	public void cacheResult(CustomerService customerService);

	/**
	 * Caches the customer services in the entity cache if it is enabled.
	 *
	 * @param customerServices the customer services
	 */
	public void cacheResult(java.util.List<CustomerService> customerServices);

	/**
	 * Creates a new customer service with the primary key. Does not add the customer service to the database.
	 *
	 * @param id the primary key for the new customer service
	 * @return the new customer service
	 */
	public CustomerService create(long id);

	/**
	 * Removes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the customer service
	 * @return the customer service that was removed
	 * @throws NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 */
	public CustomerService remove(long id)
		throws NoSuchCustomerServiceException;

	public CustomerService updateImpl(CustomerService customerService);

	/**
	 * Returns the customer service with the primary key or throws a <code>NoSuchCustomerServiceException</code> if it could not be found.
	 *
	 * @param id the primary key of the customer service
	 * @return the customer service
	 * @throws NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 */
	public CustomerService findByPrimaryKey(long id)
		throws NoSuchCustomerServiceException;

	/**
	 * Returns the customer service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the customer service
	 * @return the customer service, or <code>null</code> if a customer service with the primary key could not be found
	 */
	public CustomerService fetchByPrimaryKey(long id);

	/**
	 * Returns all the customer services.
	 *
	 * @return the customer services
	 */
	public java.util.List<CustomerService> findAll();

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
	public java.util.List<CustomerService> findAll(int start, int end);

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
	public java.util.List<CustomerService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
			orderByComparator);

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
	public java.util.List<CustomerService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CustomerService>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the customer services from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of customer services.
	 *
	 * @return the number of customer services
	 */
	public int countAll();

}