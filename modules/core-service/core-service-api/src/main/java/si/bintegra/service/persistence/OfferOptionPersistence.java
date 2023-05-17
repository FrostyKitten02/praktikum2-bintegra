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

import si.bintegra.exception.NoSuchOfferOptionException;
import si.bintegra.model.OfferOption;

/**
 * The persistence interface for the offer option service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfferOptionUtil
 * @generated
 */
@ProviderType
public interface OfferOptionPersistence extends BasePersistence<OfferOption> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfferOptionUtil} to access the offer option persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the offer options where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching offer options
	 */
	public java.util.List<OfferOption> findByUuid(String uuid);

	/**
	 * Returns a range of all the offer options where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @return the range of matching offer options
	 */
	public java.util.List<OfferOption> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the offer options where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offer options
	 */
	public java.util.List<OfferOption> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offer options where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching offer options
	 */
	public java.util.List<OfferOption> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offer option
	 * @throws NoSuchOfferOptionException if a matching offer option could not be found
	 */
	public OfferOption findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
				orderByComparator)
		throws NoSuchOfferOptionException;

	/**
	 * Returns the first offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offer option, or <code>null</code> if a matching offer option could not be found
	 */
	public OfferOption fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
			orderByComparator);

	/**
	 * Returns the last offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offer option
	 * @throws NoSuchOfferOptionException if a matching offer option could not be found
	 */
	public OfferOption findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
				orderByComparator)
		throws NoSuchOfferOptionException;

	/**
	 * Returns the last offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offer option, or <code>null</code> if a matching offer option could not be found
	 */
	public OfferOption fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
			orderByComparator);

	/**
	 * Returns the offer options before and after the current offer option in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current offer option
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offer option
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	public OfferOption[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
				orderByComparator)
		throws NoSuchOfferOptionException;

	/**
	 * Removes all the offer options where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of offer options where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching offer options
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the offer option in the entity cache if it is enabled.
	 *
	 * @param offerOption the offer option
	 */
	public void cacheResult(OfferOption offerOption);

	/**
	 * Caches the offer options in the entity cache if it is enabled.
	 *
	 * @param offerOptions the offer options
	 */
	public void cacheResult(java.util.List<OfferOption> offerOptions);

	/**
	 * Creates a new offer option with the primary key. Does not add the offer option to the database.
	 *
	 * @param id the primary key for the new offer option
	 * @return the new offer option
	 */
	public OfferOption create(long id);

	/**
	 * Removes the offer option with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option that was removed
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	public OfferOption remove(long id) throws NoSuchOfferOptionException;

	public OfferOption updateImpl(OfferOption offerOption);

	/**
	 * Returns the offer option with the primary key or throws a <code>NoSuchOfferOptionException</code> if it could not be found.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	public OfferOption findByPrimaryKey(long id)
		throws NoSuchOfferOptionException;

	/**
	 * Returns the offer option with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option, or <code>null</code> if a offer option with the primary key could not be found
	 */
	public OfferOption fetchByPrimaryKey(long id);

	/**
	 * Returns all the offer options.
	 *
	 * @return the offer options
	 */
	public java.util.List<OfferOption> findAll();

	/**
	 * Returns a range of all the offer options.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @return the range of offer options
	 */
	public java.util.List<OfferOption> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the offer options.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of offer options
	 */
	public java.util.List<OfferOption> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
			orderByComparator);

	/**
	 * Returns an ordered range of all the offer options.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of offer options
	 */
	public java.util.List<OfferOption> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OfferOption>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the offer options from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of offer options.
	 *
	 * @return the number of offer options
	 */
	public int countAll();

}