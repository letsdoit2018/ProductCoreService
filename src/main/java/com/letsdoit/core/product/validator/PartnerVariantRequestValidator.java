package com.letsdoit.core.product.validator;

import com.letsdoit.core.product.domain.PartnerVariant;
import com.letsdoit.core.product.exception.ApplicationExceptions;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PartnerVariantRequestValidator {

    public static UnaryOperator<Mono<PartnerVariant>> validateForInsert() {
        return mono -> mono.filter(hasPartnerBusinessId())
                .switchIfEmpty(ApplicationExceptions.missingPartnerBusinessId());
    }

    public static UnaryOperator<Mono<PartnerVariant>> validateForUpdate() {
        return mono -> mono.filter(hasPartnerVariantId())
                .switchIfEmpty(ApplicationExceptions.missingPartnerVariantId());
    }
    private static Predicate<PartnerVariant> hasPartnerVariantId() {
        return domainObj -> Objects.nonNull(domainObj.getId());
    }

    private static Predicate<PartnerVariant> hasPartnerBusinessId() {
        return domainObj -> Objects.nonNull(domainObj.getPartnerBusinessId());
    }
}
