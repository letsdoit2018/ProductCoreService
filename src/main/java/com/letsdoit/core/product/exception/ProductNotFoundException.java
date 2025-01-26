package com.letsdoit.core.product.exception;

public class ProductNotFoundException extends RuntimeException {
    private static final String MESSAGE = "Product [id=%s] is not found";
    public ProductNotFoundException(String id) {
        super(MESSAGE.formatted(id));
    }
}