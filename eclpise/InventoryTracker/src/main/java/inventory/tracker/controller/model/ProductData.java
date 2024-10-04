package inventory.tracker.controller.model;

import java.util.HashSet;
import java.util.Set;

import inventory.tracker.entity.Product;
import inventory.tracker.entity.Tag;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
		public class ProductData {
		  private Long productId;
		   private String productName;
		   private int quantity;
		   private double price;
		   private Set<TagData> tags = new HashSet<>();
		   
		   public ProductData(Product product) {
			   this.productId = product.getProductId();
			   this.productName = product.getProductName();
			   this.quantity = product.getQuantity();
			   this.price = product.getPrice();
			   
			   for(Tag tag : product.getTags()) {
				   this.tags.add(new TagData(tag));
			   }
		   }
		   
		   public Product toProduct() {
			   Product product = new Product();
			   
			   product.setProductId(productId);
			   product.setProductName(productName);
			   product.setQuantity(quantity);
			   product.setPrice(price);
			   
			   for (TagData tagData : tags) {
				   product.getTags().add(tagData.toTag());
			   }
			   
		  return product;
		  }
	}
		

