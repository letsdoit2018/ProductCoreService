package com.letsdoit.core.product.repository;

import com.letsdoit.core.product.domain.PartnerProductCategory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
//import org.springframework.data.r2dbc.repository.Modifying;

@Repository
public interface PartnerProductCategoryRepository extends ReactiveMongoRepository<PartnerProductCategory, String> {
    Mono<PartnerProductCategory> findById(String id);

    Flux<PartnerProductCategory> findBy(Pageable pageable);

//    @Modifying // for demo
//    @Query("delete from partnervariant where id=:id")
//    Mono<Boolean> deleteById(String id);
}