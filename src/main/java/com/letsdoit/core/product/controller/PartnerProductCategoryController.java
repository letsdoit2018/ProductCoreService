package com.letsdoit.core.product.controller;

import com.letsdoit.core.product.domain.PartnerProductCategory;
import com.letsdoit.core.product.service.PartnerProductCategoryService;
import com.letsdoit.core.product.validator.PartnerProductCategoryRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("partner/productcategory")
public class PartnerProductCategoryController {
    @Autowired
    PartnerProductCategoryService partnerProductCategoryService;

    //Get all partner product categories
    @GetMapping("/all")
    public Flux<PartnerProductCategory> getAllPartnerProductCategories() {
        return this.partnerProductCategoryService.getAllPartnerProductCategories();
    }

    @GetMapping("/paginated")
    public Flux<PartnerProductCategory> getAllPartnerProductCategories(@RequestParam(defaultValue = "1") Integer page,
                                                                      @RequestParam(defaultValue = "3") Integer size) {
        return this.partnerProductCategoryService.getAllPartnerProductCategories(page, size);
    }

    @GetMapping("{id}")
    public Mono<PartnerProductCategory> getPartnerProductCategory(@RequestParam String id) {
        return this.partnerProductCategoryService.getPartnerProductCategoryById(id);
    }

    //Insert a new partner product category
    @PostMapping
    public Mono<PartnerProductCategory> insertPartnerProductCategory(@RequestBody Mono<PartnerProductCategory> mono) {
        return mono
                .transform(PartnerProductCategoryRequestValidator.validateForInsert())
                .as(this.partnerProductCategoryService::insertPartnerProductCategory);
    }

    //Update an existing partner product category
    @PutMapping("{id}")
    public Mono<PartnerProductCategory> updatePartnerProductCategory(@PathVariable String id, @RequestBody Mono<PartnerProductCategory> mono) {
        return mono.transform(PartnerProductCategoryRequestValidator.validateForUpdate())
                .as(validReq -> this.partnerProductCategoryService.updatePartnerProductCategory(id, validReq));
    }

    //Need to check how to send a boolean response
    @DeleteMapping("{id}")
    public Mono<Void> deletePartnerProductCategory(@PathVariable String id) {
        return this.partnerProductCategoryService.deletePartnerProductCategory(id);
    }
}