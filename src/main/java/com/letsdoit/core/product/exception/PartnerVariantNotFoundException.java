package com.letsdoit.core.product.exception;

public class PartnerVariantNotFoundException extends RuntimeException{
    private static final String MESSAGE = "Variant [id=%s] is not found";
    public PartnerVariantNotFoundException(String id) {
        super(MESSAGE.formatted(id));
    }
}