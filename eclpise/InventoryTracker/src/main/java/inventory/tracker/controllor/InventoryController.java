//package inventory.tracker.controllor;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//import inventory.tracker.controller.model.CategoryData;
//import inventory.tracker.entity.Product;
//import inventory.tracker.service.CategoryService;
//import inventory.tracker.service.ProductService;
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@RequestMapping("/inventory_tracker")
//@Slf4j
//public class InventoryController {
//	@Autowired
//	private CategoryService  inventoryService;
//	
//	@PostMapping("/category")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public CategoryData createCategory(@RequestBody CategoryData categoryData) {
//		log.info("Creating category {}", categoryData);
//		return inventoryService.saveCategory(categoryData);
//	}
//	
//	@GetMapping("/category/{categoryId}")
//	public CategoryData retrieveCategory (@PathVariable Long categoryId) {
//		log.info("Retrieving category with ID={}", categoryId);
//		return inventoryService.retrieveCategoryById(categoryId);
//	}
//	
//	@RestController
//	@RequestMapping("/product")
//	public class ProductController {
//	    @Autowired
//	    private ProductService productService;
//
//	    @PostMapping("/product")
//	    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//	        Product createdProduct = productService.createProduct(product);
//	        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
//	    }
//
//	    @GetMapping("/product/{productId}")
//	    public ResponseEntity<Product> getProduct(@PathVariable Long productId) {
//	        Product product = productService.getProduct(productId);
//	        return ResponseEntity.ok(product);
//	    }
//
//	    @GetMapping
//	    public ResponseEntity<List<Product>> getAllProducts() {
//	        List<Product> products = productService.getAllProducts();
//	        return ResponseEntity.ok(products);
//	    }
//
//	    @PutMapping("/{productId}")
//	    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product productDetails) {
//	        Product updatedProduct = productService.updateProduct(productId, productDetails);
//	        return ResponseEntity.ok(updatedProduct);
//	    }
//
//	    @DeleteMapping("/{productId}")
//	    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
//	        productService.deleteProduct(productId);
//	        return ResponseEntity.noContent().build();
//	    }
//	}
//
//}




