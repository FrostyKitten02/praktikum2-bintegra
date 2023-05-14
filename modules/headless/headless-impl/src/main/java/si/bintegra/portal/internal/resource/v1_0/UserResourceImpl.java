package si.bintegra.portal.internal.resource.v1_0;

import com.liferay.counter.kernel.service.CounterLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import si.bintegra.model.Foo;
import si.bintegra.portal.dto.v1_0.User;
import si.bintegra.portal.resource.v1_0.UserResource;
import si.bintegra.service.FooLocalService;


/**
 * @author Alen
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/user.properties",
	scope = ServiceScope.PROTOTYPE, service = UserResource.class
)
public class UserResourceImpl extends BaseUserResourceImpl {



	@Reference
	private FooLocalService fooLocalService;
	@Reference
	private CounterLocalService counterLocalService;

	@Override
	public User getTestPath() throws Exception {
		User user = new User();
		long newId = counterLocalService.increment();
		Foo foo = fooLocalService.createFoo(newId);
		foo.setField5("test");
		fooLocalService.addFoo(foo);
		user.setId(1);
		user.setName("Klara");
		return user;
	}
}