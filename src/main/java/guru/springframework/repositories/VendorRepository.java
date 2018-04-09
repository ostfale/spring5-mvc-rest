package guru.springframework.repositories;

import guru.springframework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vendor repository
 * Created : 09.04.2018
 *
 * @author : usauerbrei
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
