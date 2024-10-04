package inventory.tracker.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.tracker.controller.model.ProductData;
import inventory.tracker.entity.Product;
import inventory.tracker.service.ProductService;

@RestController
	@RequestMapping("/inventory_tracker")
	public class ProductController {

	    @Autowired
	    private ProductService productService;

	    // Create Product
	    @PostMapping("/product")
	    public ResponseEntity<ProductData> createProduct(@RequestBody ProductData productData) {
	        ProductData savedProduct = productService.saveProduct(productData);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
	    }

	    // Retrieve Product by ID
	    @GetMapping("/product/{productId}")
	    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
	        Product product = productService.getProduct(productId);
	        return ResponseEntity.ok(product);
	    }

	    // Get all Products
	    @GetMapping("/product")
	    public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> products = productService.getAllProducts();
	        return ResponseEntity.ok(products);
	    }

	    // Update Product
	    @PutMapping("/product/{productId}")
	    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product productDetails) {
	        Product updatedProduct = productService.updateProduct(productId, productDetails);
	        return ResponseEntity.ok(updatedProduct);
	    }

	    // Delete Product
	    @DeleteMapping("/product/{productId}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
	        productService.deleteProduct(productId);
	        return ResponseEntity.noContent().build();
	    }
	}
