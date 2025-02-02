package com.letsdoit.core.product.repository;

import com.letsdoit.core.product.domain.PartnerVariant;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
//import org.springframework.data.r2dbc.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
//import org.springframework.data.r2dbc.repository.Modifying;


@Repository
public interface PartnerVariantRepository extends ReactiveMongoRepository<PartnerVariant, String> {
    Mono<PartnerVariant> findById(String id);

    Flux<PartnerVariant> findBy(Pageable pageable);

//    @Modifying // for demo
//    @Query("delete from partnervariant where id=:id")
//    Mono<Boolean> deleteById(String id);
}