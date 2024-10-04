package inventory.tracker.controller.model;


import java.util.HashSet;
import java.util.Set;

import inventory.tracker.entity.Category;
import inventory.tracker.entity.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryData {
	private Long categoryId;
	private String categoryName;
	private Set<ProductData> products = new HashSet<>();

	public CategoryData(Category category) {
		this.categoryId = category.getCategoryId();
		this.categoryName = category.getCategoryName();
		
	for(Product product : category.getProducts()) {
		this.products.add(new ProductData(product));
		}		
	}
	// For test later
	public CategoryData(Long categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public Category toCategory() {
		Category category = new Category();
				
		category.setCategoryId(categoryId);
		category.setCategoryName(categoryName);
		
		for(ProductData productData : products) {
			category.getProducts().add(productData.toProduct());
		}
		
		return category;
	}

}