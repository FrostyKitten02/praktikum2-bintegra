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

import si.bintegra.model.OfferOption;

/**
 * The cache model class for representing OfferOption in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OfferOptionCacheModel
	implements CacheModel<OfferOption>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OfferOptionCacheModel)) {
			return false;
		}

		OfferOptionCacheModel offerOptionCacheModel =
			(OfferOptionCacheModel)object;

		if (id == offerOptionCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", offerId=");
		sb.append(offerId);
		sb.append(", fullDuration=");
		sb.append(fullDuration);
		sb.append(", discountDuration=");
		sb.append(discountDuration);
		sb.append(", discountPrice=");
		sb.append(discountPrice);
		sb.append(", fullPrice=");
		sb.append(fullPrice);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OfferOption toEntityModel() {
		OfferOptionImpl offerOptionImpl = new OfferOptionImpl();

		if (uuid == null) {
			offerOptionImpl.setUuid("");
		}
		else {
			offerOptionImpl.setUuid(uuid);
		}

		offerOptionImpl.setId(id);
		offerOptionImpl.setOfferId(offerId);
		offerOptionImpl.setFullDuration(fullDuration);
		offerOptionImpl.setDiscountDuration(discountDuration);
		offerOptionImpl.setDiscountPrice(discountPrice);
		offerOptionImpl.setFullPrice(fullPrice);
		offerOptionImpl.setActive(active);

		offerOptionImpl.resetOriginalValues();

		return offerOptionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		offerId = objectInput.readLong();

		fullDuration = objectInput.readLong();

		discountDuration = objectInput.readLong();

		discountPrice = objectInput.readLong();

		fullPrice = objectInput.readLong();

		active = objectInput.readBoolean();
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

		objectOutput.writeLong(offerId);

		objectOutput.writeLong(fullDuration);

		objectOutput.writeLong(discountDuration);

		objectOutput.writeLong(discountPrice);

		objectOutput.writeLong(fullPrice);

		objectOutput.writeBoolean(active);
	}

	public String uuid;
	public long id;
	public long offerId;
	public long fullDuration;
	public long discountDuration;
	public long discountPrice;
	public long fullPrice;
	public boolean active;

}