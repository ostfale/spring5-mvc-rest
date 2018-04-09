package guru.springframework.services;

import guru.springframework.api.v1.model.VendorDTO;
import guru.springframework.api.v1.model.VendorListDTO;

/**
 * Declaration of service functions
 * Created : 09.04.2018
 *
 * @author : usauerbrei
 */
public interface VendorService {

	VendorDTO getVendorById(Long id);

	VendorListDTO getAllVendors();

	VendorDTO createNewVendor(VendorDTO vendorDTO);

	VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

	VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

	void deleteVendorById(Long id);
}
