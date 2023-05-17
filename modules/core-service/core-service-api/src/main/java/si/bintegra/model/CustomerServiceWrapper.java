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
 * This class is a wrapper for {@link CustomerService}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerService
 * @generated
 */
public class CustomerServiceWrapper
	extends BaseModelWrapper<CustomerService>
	implements CustomerService, ModelWrapper<CustomerService> {

	public CustomerServiceWrapper(CustomerService customerService) {
		super(customerService);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("price", getPrice());

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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public CustomerService cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the ID of this customer service.
	 *
	 * @return the ID of this customer service
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the price of this customer service.
	 *
	 * @return the price of this customer service
	 */
	@Override
	public double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this customer service.
	 *
	 * @return the primary key of this customer service
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this customer service.
	 *
	 * @return the title of this customer service
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the uuid of this customer service.
	 *
	 * @return the uuid of this customer service
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
	 * Sets the ID of this customer service.
	 *
	 * @param id the ID of this customer service
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the price of this customer service.
	 *
	 * @param price the price of this customer service
	 */
	@Override
	public void setPrice(double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this customer service.
	 *
	 * @param primaryKey the primary key of this customer service
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this customer service.
	 *
	 * @param title the title of this customer service
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the uuid of this customer service.
	 *
	 * @param uuid the uuid of this customer service
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
	protected CustomerServiceWrapper wrap(CustomerService customerService) {
		return new CustomerServiceWrapper(customerService);
	}

}