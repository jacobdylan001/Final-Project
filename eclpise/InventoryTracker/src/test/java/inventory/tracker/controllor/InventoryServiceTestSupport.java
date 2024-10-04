package inventory.tracker.controllor;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.jdbc.JdbcTestUtils;

import inventory.tracker.controller.model.CategoryData;
import inventory.tracker.entity.Category;

//public class InventoryServiceTestSupport {
//	
//	private static final String CATEGORY_TABLE = "category";

	//@formatter:off
	
//	private CategoryData insertCategoryName1 = new CategoryData(
//			1L,
//			"Electronics"
//			);
//	
//	private CategoryData insertCategoryName2 = new CategoryData(
//			2L,
//			"Fitness"
//			);
//	//@formatter:on
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	@Autowired
////	private InventoryController inventoryController;
//	
//	protected CategoryData buildInsertCategory(int which) {
//		
//		return which == 1 ? insertCategoryName1 : insertCategoryName2;
//	}
//	
//	protected int rowsInCategoryTable() {
//		return JdbcTestUtils.countRowsInTable(jdbcTemplate, CATEGORY_TABLE);
//	}
//
//	protected CategoryData insertCategory(CategoryData categoryData) {
//	Category category = categoryData.toCategory();
//	CategoryData clone = new CategoryData(category);
//	
//	clone.setCategoryId(null);
//	return inventoryController.createCategory(clone);
//	}
	
//}
