package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Vendor DTO
 * Created : 09.04.2018
 *
 * @author : usauerbrei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {

	@ApiModelProperty(value = "Name of the Vendor", required = true)
	private String name;

	@JsonProperty("vendor_url")
	private String vendorUrl;
}
