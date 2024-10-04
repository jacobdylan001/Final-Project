package inventory.tracker.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inventory.tracker.controller.model.CategoryData;
import inventory.tracker.dao.CategoryDao;
import inventory.tracker.entity.Category;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
@Transactional(readOnly = false)
	public CategoryData saveCategory(CategoryData categoryData) {
		Category category = categoryData.toCategory(); 
		Category dbCategory = categoryDao.save(category);
		
		return new CategoryData(dbCategory);
	}

@Transactional(readOnly = true)
	public CategoryData retrieveCategoryById(Long categoryId) {
		Category category = findCategoryById(categoryId);
		return new CategoryData(category);
	}

	private Category findCategoryById(Long categoryId) {
		return categoryDao.findById(categoryId)
				.orElseThrow(() -> new NoSuchElementException("Category with ID=" + categoryId + "was not found."));
	}
	 // Retrieve all categories
    public List<Category> getAllCategories() {
        return categoryDao.findAll();
    }
}
