package inventory.tracker.controllor;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.tracker.controller.model.CategoryData;
import inventory.tracker.entity.Category;
import inventory.tracker.service.CategoryService;

@RestController
@RequestMapping("/inventory_tracker")
	public class CategoryController {

	    @Autowired
	    private CategoryService categoryService;

	    // Create Category
	    @PostMapping("/category")
	    public ResponseEntity<CategoryData> createCategory(@RequestBody CategoryData categoryData) {
	        CategoryData savedCategory = categoryService.saveCategory(categoryData);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);
	    }

	    // Retrieve Category by ID
	    @GetMapping("/category/{categoryId}")
	    public ResponseEntity<CategoryData> getCategoryById(@PathVariable Long categoryId) {
	        CategoryData categoryData = categoryService.retrieveCategoryById(categoryId);
	        return ResponseEntity.ok(categoryData);
	    }
	 // Retrieve all categories
	    @GetMapping("/category")
	    public List<Category> getAllCategories() {
	        return categoryService.getAllCategories(); 
	    
	}
}
