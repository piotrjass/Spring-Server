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
        newProduct.setIngredient1(productDto.getIngredient1());
        newProduct.setIngredient2(productDto.getIngredient2());
        newProduct.setIngredient3(productDto.getIngredient3());
        newProduct.setIngredient4(productDto.getIngredient4());
        newProduct.setIngredient5(productDto.getIngredient5());
        productRepository.save(newProduct);
        return "Saved /Service";
    }
}
