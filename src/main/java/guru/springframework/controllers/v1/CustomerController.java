package guru.springframework.controllers.v1;

import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.api.v1.model.CustomerListDTO;
import guru.springframework.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Customer controller
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
@Controller
@RequestMapping("/api/v1/customers/")
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping
	public ResponseEntity<CustomerListDTO> getListofCustomers() {

		return new ResponseEntity<>(new CustomerListDTO(customerService.getAllCustomers()), HttpStatus.OK);
	}

	@GetMapping({"/{id}"})
	public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {
		return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CustomerDTO> createNewCustomer(@RequestBody CustomerDTO customerDTO){
		return new ResponseEntity<>(customerService.createNewCustomer(customerDTO),HttpStatus.CREATED);
	}

	@PutMapping({"/{id}"})
	public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
		return new ResponseEntity<>(customerService.saveCustomerByDTO(id, customerDTO),HttpStatus.OK);
	}
}
