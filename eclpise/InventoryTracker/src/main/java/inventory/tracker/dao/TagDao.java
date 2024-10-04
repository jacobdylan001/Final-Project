package inventory.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import inventory.tracker.entity.Product;
import inventory.tracker.entity.Tag;

public interface TagDao extends JpaRepository<Product, Long> {

	Tag save(Tag tag);



}
