DROP TABLE IF EXISTS product_tag;
DROP TABLE IF EXISTS tag;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS category;

CREATE TABLE category (
	category_id INT NOT NULL AUTO_INCREMENT,
	category_name VARCHAR(256) NOT NULL,
	PRIMARY KEY (category_id)
);

CREATE TABLE product (
	product_id INT NOT NULL AUTO_INCREMENT,
	product_name VARCHAR(256) NOT NULL,
	quantity INT NOT NULL,
	price DECIMAL(10, 2) NOT NULL,
	category_id INT,
	PRIMARY KEY (product_id),
	FOREIGN KEY (category_id) REFERENCES category(category_id) ON DELETE CASCADE
);

CREATE TABLE tag (
	tag_id INT NOT NULL AUTO_INCREMENT,
	tag_name VARCHAR(256) NOT NULL,
	PRIMARY KEY (tag_id)
);

CREATE TABLE product_tag (
	product_id BIGINT NOT NULL,
	tag_id BIGINT NOT NULL,
	FOREIGN KEY (product_id) REFERENCES product (product_id) ON DELETE CASCADE,
	FOREIGN KEY (tag_id) REFERENCES tag (tag_id) ON DELETE CASCADE
);