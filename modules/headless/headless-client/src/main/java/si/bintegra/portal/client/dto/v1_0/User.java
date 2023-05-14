package si.bintegra.portal.client.dto.v1_0;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

import si.bintegra.portal.client.function.UnsafeSupplier;
import si.bintegra.portal.client.serdes.v1_0.UserSerDes;

/**
 * @author Alen
 * @generated
 */
@Generated("")
public class User implements Cloneable, Serializable {

	public static User toDTO(String json) {
		return UserSerDes.toDTO(json);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Integer, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String name;

	@Override
	public User clone() throws CloneNotSupportedException {
		return (User)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof User)) {
			return false;
		}

		User user = (User)object;

		return Objects.equals(toString(), user.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return UserSerDes.toJSON(this);
	}

}