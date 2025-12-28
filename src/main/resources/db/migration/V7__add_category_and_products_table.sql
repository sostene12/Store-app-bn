-- CREATE CATEGORY TABLE
CREATE TABLE categories
(
    id   TINYINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- CREATE products Table
CREATE TABLE products
(
    id    BIGINT AUTO_INCREAMENT PRIMARY KEY ,
    name  VARCHAR(255) NOT NULL ,
    price DECIMAL(10, 2) NOT NULL ,
    category_id TINYINT,
    CONSTRAINT fk_category
        FOREIGN KEY (category_id) REFERENCES categories (id)
        ON DELETE RESTRICT

);