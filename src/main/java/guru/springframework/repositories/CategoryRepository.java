package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Uwe Sauerbrei on 02.04.2018
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
