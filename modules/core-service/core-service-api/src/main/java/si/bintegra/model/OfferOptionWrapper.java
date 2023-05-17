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

package si.bintegra.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OfferOption}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfferOption
 * @generated
 */
public class OfferOptionWrapper
	extends BaseModelWrapper<OfferOption>
	implements ModelWrapper<OfferOption>, OfferOption {

	public OfferOptionWrapper(OfferOption offerOption) {
		super(offerOption);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("offerId", getOfferId());
		attributes.put("fullDuration", getFullDuration());
		attributes.put("discountDuration", getDiscountDuration());
		attributes.put("discountPrice", getDiscountPrice());
		attributes.put("fullPrice", getFullPrice());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long offerId = (Long)attributes.get("offerId");

		if (offerId != null) {
			setOfferId(offerId);
		}

		Long fullDuration = (Long)attributes.get("fullDuration");

		if (fullDuration != null) {
			setFullDuration(fullDuration);
		}

		Long discountDuration = (Long)attributes.get("discountDuration");

		if (discountDuration != null) {
			setDiscountDuration(discountDuration);
		}

		Long discountPrice = (Long)attributes.get("discountPrice");

		if (discountPrice != null) {
			setDiscountPrice(discountPrice);
		}

		Long fullPrice = (Long)attributes.get("fullPrice");

		if (fullPrice != null) {
			setFullPrice(fullPrice);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	@Override
	public OfferOption cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the active of this offer option.
	 *
	 * @return the active of this offer option
	 */
	@Override
	public Boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the discount duration of this offer option.
	 *
	 * @return the discount duration of this offer option
	 */
	@Override
	public long getDiscountDuration() {
		return model.getDiscountDuration();
	}

	/**
	 * Returns the discount price of this offer option.
	 *
	 * @return the discount price of this offer option
	 */
	@Override
	public long getDiscountPrice() {
		return model.getDiscountPrice();
	}

	/**
	 * Returns the full duration of this offer option.
	 *
	 * @return the full duration of this offer option
	 */
	@Override
	public long getFullDuration() {
		return model.getFullDuration();
	}

	/**
	 * Returns the full price of this offer option.
	 *
	 * @return the full price of this offer option
	 */
	@Override
	public long getFullPrice() {
		return model.getFullPrice();
	}

	/**
	 * Returns the ID of this offer option.
	 *
	 * @return the ID of this offer option
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the offer ID of this offer option.
	 *
	 * @return the offer ID of this offer option
	 */
	@Override
	public long getOfferId() {
		return model.getOfferId();
	}

	/**
	 * Returns the primary key of this offer option.
	 *
	 * @return the primary key of this offer option
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this offer option.
	 *
	 * @return the uuid of this offer option
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the active of this offer option.
	 *
	 * @param active the active of this offer option
	 */
	@Override
	public void setActive(Boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the discount duration of this offer option.
	 *
	 * @param discountDuration the discount duration of this offer option
	 */
	@Override
	public void setDiscountDuration(long discountDuration) {
		model.setDiscountDuration(discountDuration);
	}

	/**
	 * Sets the discount price of this offer option.
	 *
	 * @param discountPrice the discount price of this offer option
	 */
	@Override
	public void setDiscountPrice(long discountPrice) {
		model.setDiscountPrice(discountPrice);
	}

	/**
	 * Sets the full duration of this offer option.
	 *
	 * @param fullDuration the full duration of this offer option
	 */
	@Override
	public void setFullDuration(long fullDuration) {
		model.setFullDuration(fullDuration);
	}

	/**
	 * Sets the full price of this offer option.
	 *
	 * @param fullPrice the full price of this offer option
	 */
	@Override
	public void setFullPrice(long fullPrice) {
		model.setFullPrice(fullPrice);
	}

	/**
	 * Sets the ID of this offer option.
	 *
	 * @param id the ID of this offer option
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the offer ID of this offer option.
	 *
	 * @param offerId the offer ID of this offer option
	 */
	@Override
	public void setOfferId(long offerId) {
		model.setOfferId(offerId);
	}

	/**
	 * Sets the primary key of this offer option.
	 *
	 * @param primaryKey the primary key of this offer option
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this offer option.
	 *
	 * @param uuid the uuid of this offer option
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected OfferOptionWrapper wrap(OfferOption offerOption) {
		return new OfferOptionWrapper(offerOption);
	}

}