package si.bintegra.sp.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import si.bintegra.sp.dto.UserDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@Component(
        properties = "userController.properties",
        scope = ServiceScope.PROTOTYPE,
        service = UserController.class
)
@Path("/user")
@Produces("application/json")
public class UserController extends Application {

    @GET
    public UserDto getCurrentUser() {
        UserDto userDto = new UserDto();
        userDto.setFisrtname("Klara");
        userDto.setLastname("Kebrič");
        userDto.setEmail("klara.kebrič@student.um.si");
        return userDto;
    }

}
