package inventory.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import inventory.tracker.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {

}