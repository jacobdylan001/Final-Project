package inventory.tracker.controllor;

import inventory.tracker.entity.Product;
import inventory.tracker.entity.Tag;
import inventory.tracker.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory_tracker")
public class TagController {

    @Autowired
    private TagService tagService;

    // Create Tag
    @PostMapping("/tag")
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        Tag savedTag = tagService.createTag(tag);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTag);
    }

    // Get all Tags
    @GetMapping("/tag{tagId}")
    public ResponseEntity<List<Product>> getAllTags() {
        List<Product> tags = tagService.getAllTags();
        return ResponseEntity.ok(tags);
    }
}
