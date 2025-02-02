package com.letsdoit.core.product.service;

import com.letsdoit.core.product.domain.PartnerVariant;
import com.letsdoit.core.product.repository.PartnerVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PartnerVariantService {
    @Autowired
    PartnerVariantRepository partnerVariantRepository;

    public Flux<PartnerVariant> getAllPartnerVariants() {
        return this.partnerVariantRepository.findAll();
    }

    public Flux<PartnerVariant> getAllPartnerVariants(Integer page, Integer size) {
        return this.partnerVariantRepository.findBy(PageRequest.of(page - 1, size)); // zero-indexed
    }

    public Mono<PartnerVariant> getPartnerVariantById(String id) {
        return this.partnerVariantRepository.findById(id);
    }

    //Inserting a new PartnerVariant
    public Mono<PartnerVariant> insertPartnerVariant(Mono<PartnerVariant> partnerVariantMono) {
        return partnerVariantMono
                //.log("Inside Service")
                .flatMap(partnerVariant -> this.partnerVariantRepository.insert(partnerVariant));
    }

    //Updating an existing PartnerVariant
    public Mono<PartnerVariant> updatePartnerVariant(String id, Mono<PartnerVariant> partnerVariantMono) {
        return this.partnerVariantRepository.findById(id)
                .flatMap(partnerVariant -> partnerVariantMono
                        .doOnNext(partnerVariant1 -> partnerVariant1.setId(id))
                        .flatMap(this.partnerVariantRepository::save));
    }
    //Deleting a PartnerVariant
    //Need to check how to make it Mono<Boolean>
    public Mono<Void> deletePartnerVariant(String id) {
        return this.partnerVariantRepository.deleteById(id);
    }
}