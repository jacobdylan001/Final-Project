package inventory.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import inventory.tracker.entity.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

}
