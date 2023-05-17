package si.bintegra.portal.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

import si.bintegra.portal.client.dto.v1_0.ServiceDto;
import si.bintegra.portal.client.json.BaseJSONParser;

/**
 * @author Alen
 * @generated
 */
@Generated("")
public class ServiceDtoSerDes {

	public static ServiceDto toDTO(String json) {
		ServiceDtoJSONParser serviceDtoJSONParser = new ServiceDtoJSONParser();

		return serviceDtoJSONParser.parseToDTO(json);
	}

	public static ServiceDto[] toDTOs(String json) {
		ServiceDtoJSONParser serviceDtoJSONParser = new ServiceDtoJSONParser();

		return serviceDtoJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ServiceDto serviceDto) {
		if (serviceDto == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (serviceDto.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(serviceDto.getId());
		}

		if (serviceDto.getPrice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append(serviceDto.getPrice());
		}

		if (serviceDto.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(serviceDto.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ServiceDtoJSONParser serviceDtoJSONParser = new ServiceDtoJSONParser();

		return serviceDtoJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ServiceDto serviceDto) {
		if (serviceDto == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (serviceDto.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(serviceDto.getId()));
		}

		if (serviceDto.getPrice() == null) {
			map.put("price", null);
		}
		else {
			map.put("price", String.valueOf(serviceDto.getPrice()));
		}

		if (serviceDto.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(serviceDto.getTitle()));
		}

		return map;
	}

	public static class ServiceDtoJSONParser
		extends BaseJSONParser<ServiceDto> {

		@Override
		protected ServiceDto createDTO() {
			return new ServiceDto();
		}

		@Override
		protected ServiceDto[] createDTOArray(int size) {
			return new ServiceDto[size];
		}

		@Override
		protected void setField(
			ServiceDto serviceDto, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					serviceDto.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "price")) {
				if (jsonParserFieldValue != null) {
					serviceDto.setPrice(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					serviceDto.setTitle((String)jsonParserFieldValue);
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