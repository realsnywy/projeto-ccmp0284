CREATE TABLE product_variations (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    color VARCHAR(255) NOT NULL,
    size VARCHAR(255) NOT NULL,
    stock INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
);