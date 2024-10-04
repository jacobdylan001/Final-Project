package inventory.tracker.entity;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
	public class Tag {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	  private Long tagId;
	  private String tagName;

 @ManyToMany(mappedBy = "tags")
	    
 	private Set<Product> products = new HashSet<>();

}
