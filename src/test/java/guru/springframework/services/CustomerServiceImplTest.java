package guru.springframework.services;

import guru.springframework.api.v1.mapper.CustomerMapper;
import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.domain.Customer;
import guru.springframework.repositories.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;


/**
 * Test for CustomerService functions
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
public class CustomerServiceImplTest {

	@Mock
	private CustomerRepository customerRepository;

	private CustomerMapper customerMapper = CustomerMapper.INSTANCE;

	private CustomerService customerService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		customerService = new CustomerServiceImpl(customerMapper, customerRepository);
	}

	@Test
	public void getAllCustomers() {
		//given
		Customer customer1 = new Customer();
		customer1.setId(1l);
		customer1.setFirstname("Michale");
		customer1.setLastname("Weston");

		Customer customer2 = new Customer();
		customer2.setId(2l);
		customer2.setFirstname("Sam");
		customer2.setLastname("Axe");

		when(customerRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

		//when
		List<CustomerDTO> customerDTOS = customerService.getAllCustomers();

		//then
		assertEquals(2, customerDTOS.size());

	}

	@Test
	public void getCustomerById() {
		//given
		Customer customer1 = new Customer();
		customer1.setId(1l);
		customer1.setFirstname("Michale");
		customer1.setLastname("Weston");

		when(customerRepository.findById(anyLong())).thenReturn(java.util.Optional.ofNullable(customer1));

		//when
		CustomerDTO customerDTO = customerService.getCustomerById(1L);

		assertEquals("Michale", customerDTO.getFirstname());
	}

	@Test
	public void createNewCustomer() {

		//given
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setFirstname("Jim");

		Customer savedCustomer = new Customer();
		savedCustomer.setFirstname(customerDTO.getFirstname());
		savedCustomer.setLastname(customerDTO.getLastname());
		savedCustomer.setId(1l);

		when(customerRepository.save(any(Customer.class))).thenReturn(savedCustomer);

		//when
		CustomerDTO savedDto = customerService.createNewCustomer(customerDTO);

		//then
		assertEquals(customerDTO.getFirstname(), savedDto.getFirstname());
		assertEquals("/api/v1/customers/1", savedDto.getCustomerUrl());
	}

	@Test
	public void saveCustomerByDTO() {

		//given
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setFirstname("Jim");

		Customer savedCustomer = new Customer();
		savedCustomer.setFirstname(customerDTO.getFirstname());
		savedCustomer.setLastname(customerDTO.getLastname());
		savedCustomer.setId(1l);

		when(customerRepository.save(any(Customer.class))).thenReturn(savedCustomer);

		//when
		CustomerDTO savedDto = customerService.saveCustomerByDTO(1L, customerDTO);

		//then
		assertEquals(customerDTO.getFirstname(), savedDto.getFirstname());
		assertEquals("/api/v1/customers/1", savedDto.getCustomerUrl());
	}

	@Test
	public void deleteCustomerById() {
		Long id = 1L;
		customerRepository.deleteById(id);
		verify(customerRepository, times(1)).deleteById(anyLong());
	}
}
