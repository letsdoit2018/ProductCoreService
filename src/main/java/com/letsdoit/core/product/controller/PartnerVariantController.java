package com.letsdoit.core.product.controller;

import com.letsdoit.core.product.domain.PartnerVariant;
import com.letsdoit.core.product.exception.ApplicationExceptions;
import com.letsdoit.core.product.service.PartnerVariantService;
import com.letsdoit.core.product.validator.PartnerVariantRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("partner/partnervariant")
public class PartnerVariantController {
    @Autowired
    PartnerVariantService partnerVariantService;

    //Get all partner variants
    @GetMapping("all")
    public Flux<PartnerVariant> getAllPartnerVariants() {
        return this.partnerVariantService.getAllPartnerVariants();
    }

    @GetMapping("paginated")
    public Flux<PartnerVariant> getAllPartnerVariants(@RequestParam(defaultValue = "1") Integer page,
                                                      @RequestParam(defaultValue = "3") Integer size) {
        return this.partnerVariantService.getAllPartnerVariants(page, size);
    }

    //This needs to be confirmed with Arindam
    @GetMapping("{id}")
    public Flux<PartnerVariant> getPartnerVariant(@PathVariable String id) {
        return this.partnerVariantService.getPartnerVariantId(id)
                .switchIfEmpty(ApplicationExceptions.partnerVariantNotFound(id));
    }

    @PostMapping
    public Mono<PartnerVariant> insertPartnerVariant(@RequestBody Mono<PartnerVariant> mono) {
        return mono.transform(PartnerVariantRequestValidator.validate())
                .as(this.partnerVariantService::insertPartnerVariant);
    }

    @PutMapping("{id}")
    public Mono<PartnerVariant> updatePartnerVariant(@PathVariable String id, @RequestBody Mono<PartnerVariant> mono) {
        return mono.transform(PartnerVariantRequestValidator.validate())
                .as(validReq -> this.partnerVariantService.updatePartnerVariant(id, validReq))
                .switchIfEmpty(ApplicationExceptions.partnerVariantNotFound(id));
    }

//    @DeleteMapping("{id}")
//    public Mono<Void> deletePartnerVariant(@PathVariable String id) {
//        return this.partnerVariantService(id)
//                .filter(b -> b)
//                .switchIfEmpty(ApplicationExceptions.partnerVariantNotFound(id))
//                .then();
//    }
}
