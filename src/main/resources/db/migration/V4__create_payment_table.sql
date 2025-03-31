CREATE TABLE payments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    payment_method VARCHAR(255) NOT NULL,
    transaction_id VARCHAR(255) NOT NULL,
    amount FLOAT NOT NULL,
    status VARCHAR(255) NOT NULL,
    created_at DATE NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id)
);