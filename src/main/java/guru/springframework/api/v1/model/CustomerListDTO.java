package guru.springframework.api.v1.model;

import guru.springframework.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO object
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListDTO {
	List<CustomerDTO> customers;
}
