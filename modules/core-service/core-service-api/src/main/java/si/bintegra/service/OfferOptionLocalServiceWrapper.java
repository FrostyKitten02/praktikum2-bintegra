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

package si.bintegra.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OfferOptionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OfferOptionLocalService
 * @generated
 */
public class OfferOptionLocalServiceWrapper
	implements OfferOptionLocalService,
			   ServiceWrapper<OfferOptionLocalService> {

	public OfferOptionLocalServiceWrapper() {
		this(null);
	}

	public OfferOptionLocalServiceWrapper(
		OfferOptionLocalService offerOptionLocalService) {

		_offerOptionLocalService = offerOptionLocalService;
	}

	/**
	 * Adds the offer option to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfferOptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param offerOption the offer option
	 * @return the offer option that was added
	 */
	@Override
	public si.bintegra.model.OfferOption addOfferOption(
		si.bintegra.model.OfferOption offerOption) {

		return _offerOptionLocalService.addOfferOption(offerOption);
	}

	/**
	 * Creates a new offer option with the primary key. Does not add the offer option to the database.
	 *
	 * @param id the primary key for the new offer option
	 * @return the new offer option
	 */
	@Override
	public si.bintegra.model.OfferOption createOfferOption(long id) {
		return _offerOptionLocalService.createOfferOption(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _offerOptionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the offer option with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfferOptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option that was removed
	 * @throws PortalException if a offer option with the primary key could not be found
	 */
	@Override
	public si.bintegra.model.OfferOption deleteOfferOption(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _offerOptionLocalService.deleteOfferOption(id);
	}

	/**
	 * Deletes the offer option from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfferOptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param offerOption the offer option
	 * @return the offer option that was removed
	 */
	@Override
	public si.bintegra.model.OfferOption deleteOfferOption(
		si.bintegra.model.OfferOption offerOption) {

		return _offerOptionLocalService.deleteOfferOption(offerOption);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _offerOptionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _offerOptionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _offerOptionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _offerOptionLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _offerOptionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>si.bintegra.model.impl.OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _offerOptionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>si.bintegra.model.impl.OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _offerOptionLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _offerOptionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _offerOptionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public si.bintegra.model.OfferOption fetchOfferOption(long id) {
		return _offerOptionLocalService.fetchOfferOption(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _offerOptionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _offerOptionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the offer option with the primary key.
	 *
	 * @param id the primary key of the offer option
	 * @return the offer option
	 * @throws PortalException if a offer option with the primary key could not be found
	 */
	@Override
	public si.bintegra.model.OfferOption getOfferOption(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _offerOptionLocalService.getOfferOption(id);
	}

	/**
	 * Returns a range of all the offer options.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>si.bintegra.model.impl.OfferOptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of offer options
	 * @param end the upper bound of the range of offer options (not inclusive)
	 * @return the range of offer options
	 */
	@Override
	public java.util.List<si.bintegra.model.OfferOption> getOfferOptions(
		int start, int end) {

		return _offerOptionLocalService.getOfferOptions(start, end);
	}

	/**
	 * Returns the number of offer options.
	 *
	 * @return the number of offer options
	 */
	@Override
	public int getOfferOptionsCount() {
		return _offerOptionLocalService.getOfferOptionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _offerOptionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _offerOptionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the offer option in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfferOptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param offerOption the offer option
	 * @return the offer option that was updated
	 */
	@Override
	public si.bintegra.model.OfferOption updateOfferOption(
		si.bintegra.model.OfferOption offerOption) {

		return _offerOptionLocalService.updateOfferOption(offerOption);
	}

	@Override
	public OfferOptionLocalService getWrappedService() {
		return _offerOptionLocalService;
	}

	@Override
	public void setWrappedService(
		OfferOptionLocalService offerOptionLocalService) {

		_offerOptionLocalService = offerOptionLocalService;
	}

	private OfferOptionLocalService _offerOptionLocalService;

}