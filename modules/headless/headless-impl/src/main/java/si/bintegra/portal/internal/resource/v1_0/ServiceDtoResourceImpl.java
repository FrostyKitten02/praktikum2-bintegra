package si.bintegra.portal.internal.resource.v1_0;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import si.bintegra.model.CustomerService;
import si.bintegra.model.CustomerServiceWrapper;
import si.bintegra.portal.dto.v1_0.ServiceDto;
import si.bintegra.portal.resource.v1_0.ServiceDtoResource;
import si.bintegra.service.CustomerServiceLocalService;
import si.bintegra.service.CustomerServiceLocalServiceUtil;
import si.bintegra.service.persistence.CustomerServiceUtil;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Alen
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/service-dto.properties",
	scope = ServiceScope.PROTOTYPE, service = ServiceDtoResource.class
)
public class ServiceDtoResourceImpl extends BaseServiceDtoResourceImpl {
	@Reference
	private CustomerServiceLocalService customerServiceLocalService;

	@Override
	public ServiceDto getServiceById(Long id) throws Exception {
		if (id == null) {
			throw new IllegalArgumentException("Id is null");
		}
		return toServiceDto(customerServiceLocalService.getCustomerService(id));
	}

	@Override
	public ServiceDto addService(ServiceDto serviceDto) throws Exception {
		if (serviceDto == null) {
			throw new IllegalArgumentException("ServiceDto is null");
		}
		return toServiceDto(customerServiceLocalService.addCustomerService(toCustomerService(serviceDto)));
	}

	//MAPPERS from entity to dto and vice versa
	private CustomerService toCustomerService(ServiceDto serviceDto) {
		CustomerService customerService = customerServiceLocalService.createCustomerService();
		customerService.setPrice(serviceDto.getPrice());
		customerService.setTitle(serviceDto.getTitle());
		return customerService;
	}

	private ServiceDto toServiceDto(CustomerService customerService) {
		ServiceDto serviceDto = new ServiceDto();
		serviceDto.setId(customerService.getId());
		serviceDto.setPrice(customerService.getPrice());
		serviceDto.setTitle(customerService.getTitle());
		return serviceDto;
	}
}