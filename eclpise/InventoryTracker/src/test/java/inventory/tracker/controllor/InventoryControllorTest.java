//package inventory.tracker.controllor;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.jdbc.SqlConfig;
//
//import inventory.tracker.InventoryTrackerApplication;
//import inventory.tracker.controller.model.CategoryData;
//
//
//@SpringBootTest(webEnvironment = WebEnvironment.NONE, classes = InventoryTrackerApplication.class)
//@ActiveProfiles("test")
//@Sql(scripts = {"classpath:schema.sql"})
//@SqlConfig(encoding = "utf-8")
//class InventoryControllorTest extends InventoryServiceTestSupport {
//
//	@Test
//	void testInsertCategory() {
//		
//	// Given a category request
//		
//		CategoryData request = buildInsertCategory(1);
//		CategoryData expected = buildInsertCategory(1);
//		
//	// When the category is added to the category table
//		
//		CategoryData actual = insertCategory(request);
//		
//	// Then the category returned is what is expected
//		
//		assertThat(actual).isEqualTo(expected);
//		
//	// And there is one row in the category table
//		
//		assertThat(rowsInCategoryTable()).isOne();	
//	}
//}
