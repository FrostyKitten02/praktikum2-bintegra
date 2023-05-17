package si.bintegra.portal.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

import si.bintegra.portal.dto.v1_0.ServiceDto;
import si.bintegra.portal.dto.v1_0.User;
import si.bintegra.portal.resource.v1_0.ServiceDtoResource;

/**
 * @author Alen
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setServiceDtoResourceComponentServiceObjects(
		ComponentServiceObjects<ServiceDtoResource>
			serviceDtoResourceComponentServiceObjects) {

		_serviceDtoResourceComponentServiceObjects =
			serviceDtoResourceComponentServiceObjects;
	}

	@GraphQLField
	public ServiceDto addService(
			@GraphQLName("serviceDto") ServiceDto serviceDto)
		throws Exception {

		return _applyComponentServiceObjects(
			_serviceDtoResourceComponentServiceObjects,
			this::_populateResourceContext,
			serviceDtoResource -> serviceDtoResource.addService(serviceDto));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(ServiceDtoResource serviceDtoResource)
		throws Exception {

		serviceDtoResource.setContextAcceptLanguage(_acceptLanguage);
		serviceDtoResource.setContextCompany(_company);
		serviceDtoResource.setContextHttpServletRequest(_httpServletRequest);
		serviceDtoResource.setContextHttpServletResponse(_httpServletResponse);
		serviceDtoResource.setContextUriInfo(_uriInfo);
		serviceDtoResource.setContextUser(_user);
		serviceDtoResource.setGroupLocalService(_groupLocalService);
		serviceDtoResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<ServiceDtoResource>
		_serviceDtoResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}