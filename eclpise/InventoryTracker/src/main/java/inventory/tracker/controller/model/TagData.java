package inventory.tracker.controller.model;

import inventory.tracker.entity.Tag;
import lombok.Data;
import lombok.NoArgsConstructor;
	
@Data
@NoArgsConstructor
	public class TagData {
		private Long tagId;
		private String tagName;
		 	
	  public TagData(Tag tag) {
		  this.tagId = tag.getTagId();
		  this.tagName = tag.getTagName();
	  }
			  
	  public Tag toTag() {
		  Tag tag = new Tag();
				  
		  tag.setTagId(tagId);
		  tag.setTagName(tagName);
				  
	  return tag;
	  }
}

