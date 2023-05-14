package si.bintegra.portal.internal.resource.v1_0;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import si.bintegra.portal.dto.v1_0.User;
import si.bintegra.portal.resource.v1_0.UserResource;

/**
 * @author Alen
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/user.properties",
	scope = ServiceScope.PROTOTYPE, service = UserResource.class
)
public class UserResourceImpl extends BaseUserResourceImpl {
	@Override
	public User getTestPath() throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("Klara");
		return user;
	}
}