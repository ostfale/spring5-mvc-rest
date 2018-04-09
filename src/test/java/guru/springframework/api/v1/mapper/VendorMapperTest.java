package guru.springframework.api.v1.mapper;

import guru.springframework.api.v1.model.VendorDTO;
import guru.springframework.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Vendor mapper test
 * Created : 09.04.2018
 *
 * @author : usauerbrei
 */
public class VendorMapperTest {

	private static final String NAME = "someName";

	private VendorMapper vendorMapper = VendorMapper.INSTANCE;

	@Test
	public void vendorToVendorDTO() {
		//given
		Vendor vendor = new Vendor();
		vendor.setName(NAME);

		//when
		VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

		//then
		assertEquals(vendor.getName(), vendorDTO.getName());
	}

	@Test
	public void vendorDTOtoVendor() {
		//given
		VendorDTO vendorDTO = new VendorDTO();
		vendorDTO.setName(NAME);

		//when
		Vendor vendor = vendorMapper.vendorDTOtoVendor(vendorDTO);

		//then
		assertEquals(vendorDTO.getName(), vendor.getName());
	}
}