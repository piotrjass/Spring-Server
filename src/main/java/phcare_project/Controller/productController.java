    package phcare_project.Controller;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.*;
    import phcare_project.dto.ProductDto;
    import phcare_project.entity.Disease;
    import phcare_project.entity.Drug;
    import phcare_project.entity.Product;
    import phcare_project.repository.ProductRepository;
    import phcare_project.service.ProductService;

    @Controller
    @RequestMapping("/product")
    public class productController {
        @Autowired
        private ProductRepository productRepository;
        @Autowired
        private ProductService productService;

        @GetMapping(path="/all")
        public @ResponseBody Iterable<Product> getAllProducts() {
            return productRepository.findAll();
        }

        @GetMapping(path = "/{productName}")
        public @ResponseBody Product getSingleProduct(@PathVariable String productName) {
            return productService.getSingleProduct(productName);
        }

        @GetMapping(path = "/details/{productName}")
        public @ResponseBody Product getSingleProductDetails(@PathVariable String productName) {
            Product product = productService.getSingleProduct(productName);
            productService.getIngredientsList(product);
            return productService.getSingleProduct(productName);
        }

        @PostMapping("/add")
        public @ResponseBody String addNewProduct (@RequestBody ProductDto productDto ){
            return productService.addNewProduct(productDto);
        }
    }
