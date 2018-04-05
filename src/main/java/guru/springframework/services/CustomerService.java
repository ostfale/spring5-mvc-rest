package guru.springframework.services;

import guru.springframework.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * Customer service
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
public interface CustomerService {

	List<CustomerDTO> getAllCustomers();

	CustomerDTO getCustomerById(Long id);

	CustomerDTO createNewCustomer(CustomerDTO customerDTO);

	CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO);

	CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);
}
