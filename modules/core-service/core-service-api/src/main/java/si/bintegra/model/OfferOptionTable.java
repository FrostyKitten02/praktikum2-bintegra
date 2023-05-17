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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;FOO_OfferOption&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OfferOption
 * @generated
 */
public class OfferOptionTable extends BaseTable<OfferOptionTable> {

	public static final OfferOptionTable INSTANCE = new OfferOptionTable();

	public final Column<OfferOptionTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OfferOptionTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OfferOptionTable, Long> offerId = createColumn(
		"offerId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfferOptionTable, Long> fullDuration = createColumn(
		"fullDuration", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfferOptionTable, Long> discountDuration = createColumn(
		"discountDuration", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfferOptionTable, Long> discountPrice = createColumn(
		"discountPrice", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfferOptionTable, Long> fullPrice = createColumn(
		"fullPrice", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfferOptionTable, Boolean> active = createColumn(
		"active_", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private OfferOptionTable() {
		super("FOO_OfferOption", OfferOptionTable::new);
	}

}