CREATE TABLE cart_items (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cart_id INT,
    variation_id INT NOT NULL,
    quantity INT NOT NULL,
    subtotal FLOAT NOT NULL,
    FOREIGN KEY (cart_id) REFERENCES cart(id)
);