package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.ProductDto;
import phcare_project.entity.Product;
import phcare_project.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public String addNewProduct(ProductDto productDto){
        Product newProduct = new Product();
        newProduct.setName(productDto.getName());
        productRepository.save(newProduct);
        return "Saved /Service";
    }
}
