package com.letsdoit.core.product.exception;

public class PartnerProductCategoryNotFoundException extends RuntimeException{
    private static final String MESSAGE = "Partner Product Category [id=%s] is not found";
    public PartnerProductCategoryNotFoundException(String id) {
        super(MESSAGE.formatted(id));
    }
}
