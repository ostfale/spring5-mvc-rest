package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Customer DTO object
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

	private String firstname;
	private String lastname;

	@JsonProperty("customer_url")
	private String customerUrl;
}
