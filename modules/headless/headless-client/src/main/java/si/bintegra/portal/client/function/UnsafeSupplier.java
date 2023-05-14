package si.bintegra.portal.client.function;

import javax.annotation.Generated;

/**
 * @author Alen
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}