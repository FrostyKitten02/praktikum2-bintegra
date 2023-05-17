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
 * Provides a wrapper for {@link OfferOptionService}.
 *
 * @author Brian Wing Shun Chan
 * @see OfferOptionService
 * @generated
 */
public class OfferOptionServiceWrapper
	implements OfferOptionService, ServiceWrapper<OfferOptionService> {

	public OfferOptionServiceWrapper() {
		this(null);
	}

	public OfferOptionServiceWrapper(OfferOptionService offerOptionService) {
		_offerOptionService = offerOptionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _offerOptionService.getOSGiServiceIdentifier();
	}

	@Override
	public OfferOptionService getWrappedService() {
		return _offerOptionService;
	}

	@Override
	public void setWrappedService(OfferOptionService offerOptionService) {
		_offerOptionService = offerOptionService;
	}

	private OfferOptionService _offerOptionService;

}