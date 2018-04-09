package guru.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * VendoList DTO
 * Created : 09.04.2018
 *
 * @author : usauerbrei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorListDTO {

	List<VendorDTO> vendors;
}
