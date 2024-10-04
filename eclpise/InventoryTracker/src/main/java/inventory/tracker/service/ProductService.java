package inventory.tracker.service;

import inventory.tracker.dao.ProductDao;
import inventory.tracker.entity.Product;
import inventory.tracker.controller.model.ProductData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    // Create Product
    public ProductData saveProduct(ProductData productData) {
        // Convert ProductData to Product entity
        Product product = productData.toProduct();
        Product savedProduct = productDao.save(product);
        
        // Return the saved product as ProductData
        return new ProductData(savedProduct);
    }

    // Retrieve Product by ID
    public Product getProduct(Long productId) {
        return productDao.findById(productId)
                .orElseThrow(() -> new NoSuchElementException("Product with ID=" + productId + " was not found."));
    }

    // Get all Products
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    // Update Product
    public Product updateProduct(Long productId, Product updatedProductDetails) {
        // Find the existing product
        Product product = getProduct(productId);

        // Update the product fields with new details
        product.setProductName(updatedProductDetails.getProductName());
        product.setPrice(updatedProductDetails.getPrice());
        product.setCategory(updatedProductDetails.getCategory());
        product.setTags(updatedProductDetails.getTags());

        // Save the updated product
        return productDao.save(product);
    }

    // Delete Product
    public void deleteProduct(Long productId) {
        // Find the product by ID
        Product product = getProduct(productId);

        // Delete the product
        productDao.delete(product);
    }
}
