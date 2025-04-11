CREATE TABLE order_items (
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    variation_id INT NOT NULL,
    quantity INT NOT NULL,
    subtotal FLOAT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id)
);