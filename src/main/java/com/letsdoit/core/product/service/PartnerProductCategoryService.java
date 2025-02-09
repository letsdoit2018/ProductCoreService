package com.letsdoit.core.product.service;

import com.letsdoit.core.product.domain.PartnerProductCategory;
import com.letsdoit.core.product.repository.PartnerProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PartnerProductCategoryService {
    @Autowired
    PartnerProductCategoryRepository partnerProductCategoryRepository;

    public Flux<PartnerProductCategory> getAllPartnerProductCategories() {
        return this.partnerProductCategoryRepository.findAll();
    }

    public Flux<PartnerProductCategory> getAllPartnerProductCategories(Integer page, Integer size) {
        return this.partnerProductCategoryRepository.findBy(PageRequest.of(page - 1, size)); // zero-indexed
    }

    public Mono<PartnerProductCategory> getPartnerProductCategoryById(String id) {
        return this.partnerProductCategoryRepository.findById(id);
    }

    //Inserting a new PartnerProductCategory
    public Mono<PartnerProductCategory> insertPartnerProductCategory(Mono<PartnerProductCategory> partnerProductCategoryMono) {
        return partnerProductCategoryMono
                .flatMap(partnerProductCategory -> this.partnerProductCategoryRepository.insert(partnerProductCategory));
    }

    //Updating an existing PartnerProductCategory
    public Mono<PartnerProductCategory> updatePartnerProductCategory(String id, Mono<PartnerProductCategory> partnerProductCategoryMono) {
        return this.partnerProductCategoryRepository.findById(id)
                .flatMap(partnerProductCategory -> partnerProductCategoryMono
                        .doOnNext(partnerProductCategory1 -> partnerProductCategory1.setId(id))
                        .flatMap(this.partnerProductCategoryRepository::save));
    }

    //Deleting a PartnerProductCategory
    //Need to check how to make it Mono<Boolean>
    public Mono<Void> deletePartnerProductCategory(String id) {
        return this.partnerProductCategoryRepository.deleteById(id);
    }
}
