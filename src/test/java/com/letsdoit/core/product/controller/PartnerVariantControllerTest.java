//package com.letsdoit.core.product.controller;
//
//import com.letsdoit.core.product.domain.PartnerVariant;
//import com.letsdoit.core.product.service.PartnerVariantService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.reactive.server.WebTestClient;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//import static org.mockito.Mockito.when;
//
//@WebFluxTest(PartnerVariantController.class)
//public class PartnerVariantControllerTest {
//
//    @Autowired
//    private WebTestClient webTestClient;
//
//    @MockBean
//    private PartnerVariantService partnerVariantService;
//
//    private PartnerVariant partnerVariant;
//
//    @BeforeEach
//    public void setUp() {
//        partnerVariant = new PartnerVariant();
//        partnerVariant.setVariantId("123");
//        partnerVariant.setPartnerBusinessId("456");
//        partnerVariant.setProductTitle("Test Product");
//    }
//
//    @Test
//    public void testGetAllPartnerVariants() {
//        when(partnerVariantService.getAllPartnerVariants()).thenReturn(Flux.just(partnerVariant));
//
//        webTestClient.get().uri("/partner/partnervariant/all")
//                .exchange()
//                .expectStatus().isOk()
//                .expectBodyList(PartnerVariant.class)
//                .hasSize(1)
//                .contains(partnerVariant);
//    }
//
//    @Test
//    public void testGetPartnerVariant() {
//        when(partnerVariantService.getPartnerVariantId("123")).thenReturn(Flux.just(partnerVariant));
//
//        webTestClient.get().uri("/partner/partnervariant/123")
//                .exchange()
//                .expectStatus().isOk()
//                .expectBodyList(PartnerVariant.class)
//                .hasSize(1)
//                .contains(partnerVariant);
//    }
//
//    @Test
//    public void testInsertPartnerVariant() {
//        when(partnerVariantService.insertPartnerVariant(partnerVariant)).thenReturn(Mono.just(partnerVariant));
//
//        webTestClient.post().uri("/partner/partnervariant")
//                .bodyValue(partnerVariant)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(PartnerVariant.class)
//                .isEqualTo(partnerVariant);
//    }
//
//    @Test
//    public void testUpdatePartnerVariant() {
//        when(partnerVariantService.updatePartnerVariant("123", partnerVariant)).thenReturn(Mono.just(partnerVariant));
//
//        webTestClient.put().uri("/partner/partnervariant/123")
//                .bodyValue(partnerVariant)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(PartnerVariant.class)
//                .isEqualTo(partnerVariant);
//    }
//}