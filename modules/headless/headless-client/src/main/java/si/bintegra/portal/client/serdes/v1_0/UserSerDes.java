package si.bintegra.portal.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

import si.bintegra.portal.client.dto.v1_0.User;
import si.bintegra.portal.client.json.BaseJSONParser;

/**
 * @author Alen
 * @generated
 */
@Generated("")
public class UserSerDes {

	public static User toDTO(String json) {
		UserJSONParser userJSONParser = new UserJSONParser();

		return userJSONParser.parseToDTO(json);
	}

	public static User[] toDTOs(String json) {
		UserJSONParser userJSONParser = new UserJSONParser();

		return userJSONParser.parseToDTOs(json);
	}

	public static String toJSON(User user) {
		if (user == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (user.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(user.getId());
		}

		if (user.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(user.getName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		UserJSONParser userJSONParser = new UserJSONParser();

		return userJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(User user) {
		if (user == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (user.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(user.getId()));
		}

		if (user.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(user.getName()));
		}

		return map;
	}

	public static class UserJSONParser extends BaseJSONParser<User> {

		@Override
		protected User createDTO() {
			return new User();
		}

		@Override
		protected User[] createDTOArray(int size) {
			return new User[size];
		}

		@Override
		protected void setField(
			User user, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					user.setId(Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					user.setName((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}