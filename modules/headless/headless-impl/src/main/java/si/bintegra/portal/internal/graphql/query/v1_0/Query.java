package si.bintegra.portal.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

import si.bintegra.portal.dto.v1_0.User;
import si.bintegra.portal.resource.v1_0.UserResource;

/**
 * @author Alen
 * @generated
 */
@Generated("")
public class Query {

	public static void setUserResourceComponentServiceObjects(
		ComponentServiceObjects<UserResource>
			userResourceComponentServiceObjects) {

		_userResourceComponentServiceObjects =
			userResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {testPath{id, name}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "returns user")
	public User testPath() throws Exception {
		return _applyComponentServiceObjects(
			_userResourceComponentServiceObjects,
			this::_populateResourceContext,
			userResource -> userResource.getTestPath());
	}

	@GraphQLName("UserPage")
	public class UserPage {

		public UserPage(Page userPage) {
			actions = userPage.getActions();

			items = userPage.getItems();
			lastPage = userPage.getLastPage();
			page = userPage.getPage();
			pageSize = userPage.getPageSize();
			totalCount = userPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<User> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

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

	private void _populateResourceContext(UserResource userResource)
		throws Exception {

		userResource.setContextAcceptLanguage(_acceptLanguage);
		userResource.setContextCompany(_company);
		userResource.setContextHttpServletRequest(_httpServletRequest);
		userResource.setContextHttpServletResponse(_httpServletResponse);
		userResource.setContextUriInfo(_uriInfo);
		userResource.setContextUser(_user);
		userResource.setGroupLocalService(_groupLocalService);
		userResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<UserResource>
		_userResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}