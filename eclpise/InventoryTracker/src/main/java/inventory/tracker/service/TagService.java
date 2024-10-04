package inventory.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inventory.tracker.dao.TagDao;
import inventory.tracker.entity.Product;
import inventory.tracker.entity.Tag;

@Service
	public class TagService {

	    @Autowired
	    private TagDao tagDao;

	    // Create Tag
	    @Transactional(readOnly = false)
	    public Tag createTag(Tag tag) {
	        return tagDao.save(tag);
	    }

	    // Get all Tags
	    @Transactional(readOnly = true)
	    public List<Product> getAllTags() {
	        return tagDao.findAll();
	    }
	}

