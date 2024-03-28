package phcare_project.dao;

public interface ProductDao {

    ProductDao findById(Long id);
    void extractProduct(Long id);
    void save(ProductDao productDao);
    void update(ProductDao productDao);
    void delete(ProductDao productDao);
}
