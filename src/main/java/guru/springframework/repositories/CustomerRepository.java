package guru.springframework.repositories;

import guru.springframework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Database actions
 * Created : 04.04.2018
 *
 * @author : usauerbrei
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
