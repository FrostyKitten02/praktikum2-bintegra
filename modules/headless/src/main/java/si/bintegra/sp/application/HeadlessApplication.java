package si.bintegra.sp.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author Alen
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/headless",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Headless.Rest"
	},
	service = Application.class
)
public class HeadlessApplication extends Application {

}