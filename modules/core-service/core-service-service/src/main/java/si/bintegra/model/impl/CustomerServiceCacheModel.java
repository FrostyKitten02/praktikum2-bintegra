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

package si.bintegra.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import si.bintegra.model.CustomerService;

/**
 * The cache model class for representing CustomerService in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CustomerServiceCacheModel
	implements CacheModel<CustomerService>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CustomerServiceCacheModel)) {
			return false;
		}

		CustomerServiceCacheModel customerServiceCacheModel =
			(CustomerServiceCacheModel)object;

		if (id == customerServiceCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", price=");
		sb.append(price);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerService toEntityModel() {
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

		if (uuid == null) {
			customerServiceImpl.setUuid("");
		}
		else {
			customerServiceImpl.setUuid(uuid);
		}

		customerServiceImpl.setId(id);

		if (title == null) {
			customerServiceImpl.setTitle("");
		}
		else {
			customerServiceImpl.setTitle(title);
		}

		customerServiceImpl.setPrice(price);

		customerServiceImpl.resetOriginalValues();

		return customerServiceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		title = objectInput.readUTF();

		price = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeDouble(price);
	}

	public String uuid;
	public long id;
	public String title;
	public double price;

}