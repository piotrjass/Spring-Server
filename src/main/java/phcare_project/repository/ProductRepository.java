package phcare_project.repository;

import org.springframework.data.repository.CrudRepository;
import phcare_project.entity.Drug;
import phcare_project.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findByName(String name);
}
