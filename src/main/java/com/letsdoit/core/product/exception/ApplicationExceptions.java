package com.letsdoit.core.product.exception;

import reactor.core.publisher.Mono;

public class ApplicationExceptions {
    public static <T> Mono<T> productNotFound(String id){
        return Mono.error(new ProductNotFoundException(id));
    }

    public static <T> Mono<T> partnerVariantNotFound(String id){
        return Mono.error(new PartnerVariantNotFoundException(id));
    }

    public static <T> Mono<T> partnerProductCategoryNotFound(String id){
        return Mono.error(new PartnerProductCategoryNotFoundException(id));
    }

    //This needs to be revisited
    public static <T> Mono<T> missingPlatformProductSupplierId(){
        return Mono.error(new InvalidInputException("PlatformProductSupplierId is required"));
    }

    public static <T> Mono<T> missingPartnerVariantId(){
        return Mono.error(new InvalidInputException("Variant Id is required"));
    }

    public static <T> Mono<T> missingPartnerBusinessId(){
        return Mono.error(new InvalidInputException("Partner Business Id is required"));
    }
}