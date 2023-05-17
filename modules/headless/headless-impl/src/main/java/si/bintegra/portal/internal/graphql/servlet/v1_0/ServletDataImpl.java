package si.bintegra.portal.internal.graphql.servlet.v1_0;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

import si.bintegra.portal.internal.graphql.mutation.v1_0.Mutation;
import si.bintegra.portal.internal.graphql.query.v1_0.Query;
import si.bintegra.portal.internal.resource.v1_0.ServiceDtoResourceImpl;
import si.bintegra.portal.internal.resource.v1_0.UserResourceImpl;
import si.bintegra.portal.resource.v1_0.ServiceDtoResource;
import si.bintegra.portal.resource.v1_0.UserResource;

/**
 * @author Alen
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setServiceDtoResourceComponentServiceObjects(
			_serviceDtoResourceComponentServiceObjects);

		Query.setServiceDtoResourceComponentServiceObjects(
			_serviceDtoResourceComponentServiceObjects);
		Query.setUserResourceComponentServiceObjects(
			_userResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "Headless";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/headless-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#addService",
						new ObjectValuePair<>(
							ServiceDtoResourceImpl.class, "addService"));

					put(
						"query#serviceById",
						new ObjectValuePair<>(
							ServiceDtoResourceImpl.class, "getServiceById"));
					put(
						"query#testPath",
						new ObjectValuePair<>(
							UserResourceImpl.class, "getTestPath"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ServiceDtoResource>
		_serviceDtoResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<UserResource>
		_userResourceComponentServiceObjects;

}