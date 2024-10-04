package inventory.tracker.entity;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
	public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long categoryId;
	private String categoryName;

@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	 
	private Set<Product> products = new HashSet<>();

}
