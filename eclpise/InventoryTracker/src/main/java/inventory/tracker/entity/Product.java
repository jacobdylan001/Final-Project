package inventory.tracker.entity;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long productId;
    private String productName;
    private int quantity;
    private double price;
    
@ManyToOne
@JoinColumn(name = "category_id")
    private Category category;

@ManyToMany
@JoinTable(
       name = "product_tag",
       joinColumns = @JoinColumn(name = "product_id"),
       inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();
}
