package guru.springframework.bootstrap;

import guru.springframework.domain.Category;
import guru.springframework.domain.Customer;
import guru.springframework.domain.Vendor;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.CustomerRepository;
import guru.springframework.repositories.VendorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Spring Boot specific class
 * Created by Uwe Sauerbrei on 02.04.2018
 */
@Slf4j
@Component
public class Bootstrap implements CommandLineRunner {

	private final CategoryRepository categoryRepository;
	private final CustomerRepository customerRepository;
	private final VendorRepository vendorRepository;

	public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
		this.categoryRepository = categoryRepository;
		this.customerRepository = customerRepository;
		this.vendorRepository = vendorRepository;
	}

	@Override
	public void run(String... args) {

		loadCategories();
		loadCustomers();
		loadVendors();
	}

	private void loadVendors() {
		Vendor vendor1 = new Vendor();
		vendor1.setName("Vendor 1");
		vendorRepository.save(vendor1);

		Vendor vendor2 = new Vendor();
		vendor2.setName("Vendor 2");
		vendorRepository.save(vendor2);

		System.out.println("Vendors Loaded: " + vendorRepository.count());

	}

	private void loadCategories() {
		Category fruits = new Category();
		fruits.setName("Fruits");

		Category dried = new Category();
		dried.setName("Dried");

		Category fresh = new Category();
		fresh.setName("Fresh");

		Category exotic = new Category();
		exotic.setName("Exotic");

		Category nuts = new Category();
		nuts.setName("Nuts");

		categoryRepository.save(fruits);
		categoryRepository.save(dried);
		categoryRepository.save(fresh);
		categoryRepository.save(exotic);
		categoryRepository.save(nuts);

		System.out.println("Categories Loaded: " + categoryRepository.count());
	}

	private void loadCustomers() {
		//given
		Customer customer1 = new Customer();
		customer1.setId(1l);
		customer1.setFirstname("Michale");
		customer1.setLastname("Weston");
		customerRepository.save(customer1);

		Customer customer2 = new Customer();
		customer2.setId(2l);
		customer2.setFirstname("Sam");
		customer2.setLastname("Axe");

		customerRepository.save(customer2);

		System.out.println("Customers Loaded: " + customerRepository.count());
	}
}
