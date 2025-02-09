package com.letsdoit.core.product.validator;

import reactor.core.publisher.Mono;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import com.letsdoit.core.product.domain.PartnerProductCategory;
import com.letsdoit.core.product.exception.ApplicationExceptions;

public class PartnerProductCategoryRequestValidator {

    public static UnaryOperator<Mono<PartnerProductCategory>> validateForInsert() {
        return mono -> mono.filter(hasPartnerBusinessId())
                .switchIfEmpty(ApplicationExceptions.missingPartnerBusinessId());
    }

    public static UnaryOperator<Mono<PartnerProductCategory>> validateForUpdate() {
        return mono -> mono.filter(hasPartnerVariantId())
                .switchIfEmpty(ApplicationExceptions.missingPartnerVariantId());
    }
    private static Predicate<PartnerProductCategory> hasPartnerVariantId() {
        return domainObj -> Objects.nonNull(domainObj.getId());
    }

    private static Predicate<PartnerProductCategory> hasPartnerBusinessId() {
        return domainObj -> Objects.nonNull(domainObj.getPartnerBusinessId());
    }
}