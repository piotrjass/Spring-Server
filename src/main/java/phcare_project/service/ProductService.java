package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import phcare_project.dto.ProductDto;
import phcare_project.entity.Drug;
import phcare_project.entity.Product;
import phcare_project.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getSingleProduct(String productName) {
        return productRepository.findByName(productName);
    }

    public String addNewProduct(ProductDto productDto) {
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

    public List<Drug> getIngredientsList(Product product) {
        List<String> ingredients = new ArrayList<>();
        List<String> formattedIngredients = new ArrayList<>();
        List<Drug> drugs = new ArrayList<>();
        ingredients.add(product.getIngredient1());
        ingredients.add(product.getIngredient2());
        ingredients.add(product.getIngredient3());
        ingredients.add(product.getIngredient4());
        ingredients.add(product.getIngredient5());
        ingredients.removeIf(Objects::isNull);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            formattedIngredients.add(formatIngredient(ingredient));
        }

        RestTemplate restTemplate = new RestTemplate();
        for (String ing : formattedIngredients) {
            String drugUrl = "http://localhost:8080/drug/" + ing;
            try {
                Drug drugInfo = restTemplate.getForObject(drugUrl, Drug.class);
                drugs.add(drugInfo);
            } catch (RestClientResponseException e) {
                System.out.println("Error retrieving information for " + ing + ": " + e.getMessage());
            }
        }
        return drugs;
    }


    private static String formatIngredient(String ingredient) {
        String[] parts = ingredient.split("\\s+");
        if (parts.length > 1) {
            StringBuilder formattedIngredient = new StringBuilder(parts[0]);
            for (int i = 1; i < parts.length - 1; i++) {
                formattedIngredient.append(" ").append(parts[i]);
            }
            return formattedIngredient.toString();
        }
        return ingredient;
    }


}
