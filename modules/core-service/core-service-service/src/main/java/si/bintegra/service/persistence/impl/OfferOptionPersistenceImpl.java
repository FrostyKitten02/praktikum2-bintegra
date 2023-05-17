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

package si.bintegra.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import si.bintegra.exception.NoSuchOfferOptionException;
import si.bintegra.model.OfferOption;
import si.bintegra.model.OfferOptionTable;
import si.bintegra.model.impl.OfferOptionImpl;
import si.bintegra.model.impl.OfferOptionModelImpl;
import si.bintegra.service.persistence.OfferOptionPersistence;
import si.bintegra.service.persistence.OfferOptionUtil;
import si.bintegra.service.persistence.impl.constants.FOOPersistenceConstants;

/**
 * The persistence implementation for the offer option service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OfferOptionPersistence.class)
public class OfferOptionPersistenceImpl
	extends BasePersistenceImpl<OfferOption> implements OfferOptionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OfferOptionUtil</code> to access the offer option persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OfferOptionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the offer options where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching offer options
	 */
	@Override
	public List<OfferOption> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<OfferOption> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<OfferOption> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OfferOption> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<OfferOption> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OfferOption> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<OfferOption> list = null;

		if (useFinderCache) {
			list = (List<OfferOption>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OfferOption offerOption : list) {
					if (!uuid.equals(offerOption.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_OFFEROPTION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OfferOptionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<OfferOption>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offer option
	 * @throws NoSuchOfferOptionException if a matching offer option could not be found
	 */
	@Override
	public OfferOption findByUuid_First(
			String uuid, OrderByComparator<OfferOption> orderByComparator)
		throws NoSuchOfferOptionException {

		OfferOption offerOption = fetchByUuid_First(uuid, orderByComparator);

		if (offerOption != null) {
			return offerOption;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOfferOptionException(sb.toString());
	}

	/**
	 * Returns the first offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offer option, or <code>null</code> if a matching offer option could not be found
	 */
	@Override
	public OfferOption fetchByUuid_First(
		String uuid, OrderByComparator<OfferOption> orderByComparator) {

		List<OfferOption> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offer option
	 * @throws NoSuchOfferOptionException if a matching offer option could not be found
	 */
	@Override
	public OfferOption findByUuid_Last(
			String uuid, OrderByComparator<OfferOption> orderByComparator)
		throws NoSuchOfferOptionException {

		OfferOption offerOption = fetchByUuid_Last(uuid, orderByComparator);

		if (offerOption != null) {
			return offerOption;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOfferOptionException(sb.toString());
	}

	/**
	 * Returns the last offer option in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offer option, or <code>null</code> if a matching offer option could not be found
	 */
	@Override
	public OfferOption fetchByUuid_Last(
		String uuid, OrderByComparator<OfferOption> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OfferOption> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offer options before and after the current offer option in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current offer option
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offer option
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	@Override
	public OfferOption[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<OfferOption> orderByComparator)
		throws NoSuchOfferOptionException {

		uuid = Objects.toString(uuid, "");

		OfferOption offerOption = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OfferOption[] array = new OfferOptionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, offerOption, uuid, orderByComparator, true);

			array[1] = offerOption;

			array[2] = getByUuid_PrevAndNext(
				session, offerOption, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OfferOption getByUuid_PrevAndNext(
		Session session, OfferOption offerOption, String uuid,
		OrderByComparator<OfferOption> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OFFEROPTION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(OfferOptionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(offerOption)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OfferOption> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offer options where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OfferOption offerOption :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(offerOption);
		}
	}

	/**
	 * Returns the number of offer options where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching offer options
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OFFEROPTION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"offerOption.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(offerOption.uuid IS NULL OR offerOption.uuid = '')";

	public OfferOptionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OfferOption.class);

		setModelImplClass(OfferOptionImpl.class);
		setModelPKClass(long.class);

		setTable(OfferOptionTable.INSTANCE);
	}

	/**
	 * Caches the offer option in the entity cache if it is enabled.
	 *
	 * @param offerOption the offer option
	 */
	@Override
	public void cacheResult(OfferOption offerOption) {
		entityCache.putResult(
			OfferOptionImpl.class, offerOption.getPrimaryKey(), offerOption);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the offer options in the entity cache if it is enabled.
	 *
	 * @param offerOptions the offer options
	 */
	@Override
	public void cacheResult(List<OfferOption> offerOptions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (offerOptions.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OfferOption offerOption : offerOptions) {
			if (entityCache.getResult(
					OfferOptionImpl.class, offerOption.getPrimaryKey()) ==
						null) {

				cacheResult(offerOption);
			}
		}
	}

	/**
	 * Clears the cache for all offer options.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OfferOptionImpl.class);

		finderCache.clearCache(OfferOptionImpl.class);
	}

	/**
	 * Clears the cache for the offer option.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OfferOption offerOption) {
		entityCache.removeResult(OfferOptionImpl.class, offerOption);
	}

	@Override
	public void clearCache(List<OfferOption> offerOptions) {
		for (OfferOption offerOption : offerOptions) {
			entityCache.removeResult(OfferOptionImpl.class, offerOption);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OfferOptionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OfferOptionImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new offer option with the primary key. Does not add the offer option to the database.
	 *
	 * @param id the primary key for the new offer option
	 * @return the new offer option
	 */
	@Override
	public OfferOption create(long id) {
		OfferOption offerOption = new OfferOptionImpl();

		offerOption.setNew(true);
		offerOption.setPrimaryKey(id);

		String uuid = _portalUUID.generate();

		offerOption.setUuid(uuid);

		return offerOption;
	}

	/**
	 * Removes the offer option with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option that was removed
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	@Override
	public OfferOption remove(long id) throws NoSuchOfferOptionException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the offer option with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the offer option
	 * @return the offer option that was removed
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	@Override
	public OfferOption remove(Serializable primaryKey)
		throws NoSuchOfferOptionException {

		Session session = null;

		try {
			session = openSession();

			OfferOption offerOption = (OfferOption)session.get(
				OfferOptionImpl.class, primaryKey);

			if (offerOption == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOfferOptionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(offerOption);
		}
		catch (NoSuchOfferOptionException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected OfferOption removeImpl(OfferOption offerOption) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(offerOption)) {
				offerOption = (OfferOption)session.get(
					OfferOptionImpl.class, offerOption.getPrimaryKeyObj());
			}

			if (offerOption != null) {
				session.delete(offerOption);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (offerOption != null) {
			clearCache(offerOption);
		}

		return offerOption;
	}

	@Override
	public OfferOption updateImpl(OfferOption offerOption) {
		boolean isNew = offerOption.isNew();

		if (!(offerOption instanceof OfferOptionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(offerOption.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(offerOption);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in offerOption proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OfferOption implementation " +
					offerOption.getClass());
		}

		OfferOptionModelImpl offerOptionModelImpl =
			(OfferOptionModelImpl)offerOption;

		if (Validator.isNull(offerOption.getUuid())) {
			String uuid = _portalUUID.generate();

			offerOption.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(offerOption);
			}
			else {
				offerOption = (OfferOption)session.merge(offerOption);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OfferOptionImpl.class, offerOptionModelImpl, false, true);

		if (isNew) {
			offerOption.setNew(false);
		}

		offerOption.resetOriginalValues();

		return offerOption;
	}

	/**
	 * Returns the offer option with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the offer option
	 * @return the offer option
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	@Override
	public OfferOption findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOfferOptionException {

		OfferOption offerOption = fetchByPrimaryKey(primaryKey);

		if (offerOption == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOfferOptionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return offerOption;
	}

	/**
	 * Returns the offer option with the primary key or throws a <code>NoSuchOfferOptionException</code> if it could not be found.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option
	 * @throws NoSuchOfferOptionException if a offer option with the primary key could not be found
	 */
	@Override
	public OfferOption findByPrimaryKey(long id)
		throws NoSuchOfferOptionException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the offer option with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option, or <code>null</code> if a offer option with the primary key could not be found
	 */
	@Override
	public OfferOption fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the offer options.
	 *
	 * @return the offer options
	 */
	@Override
	public List<OfferOption> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<OfferOption> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<OfferOption> findAll(
		int start, int end, OrderByComparator<OfferOption> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<OfferOption> findAll(
		int start, int end, OrderByComparator<OfferOption> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<OfferOption> list = null;

		if (useFinderCache) {
			list = (List<OfferOption>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OFFEROPTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OFFEROPTION;

				sql = sql.concat(OfferOptionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OfferOption>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the offer options from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OfferOption offerOption : findAll()) {
			remove(offerOption);
		}
	}

	/**
	 * Returns the number of offer options.
	 *
	 * @return the number of offer options
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OFFEROPTION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OFFEROPTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OfferOptionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the offer option persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_setOfferOptionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setOfferOptionUtilPersistence(null);

		entityCache.removeCache(OfferOptionImpl.class.getName());
	}

	private void _setOfferOptionUtilPersistence(
		OfferOptionPersistence offerOptionPersistence) {

		try {
			Field field = OfferOptionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, offerOptionPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OFFEROPTION =
		"SELECT offerOption FROM OfferOption offerOption";

	private static final String _SQL_SELECT_OFFEROPTION_WHERE =
		"SELECT offerOption FROM OfferOption offerOption WHERE ";

	private static final String _SQL_COUNT_OFFEROPTION =
		"SELECT COUNT(offerOption) FROM OfferOption offerOption";

	private static final String _SQL_COUNT_OFFEROPTION_WHERE =
		"SELECT COUNT(offerOption) FROM OfferOption offerOption WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "offerOption.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OfferOption exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OfferOption exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OfferOptionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id", "active"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}