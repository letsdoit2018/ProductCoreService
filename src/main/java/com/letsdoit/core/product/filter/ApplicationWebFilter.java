//package com.letsdoit.core.product.filter;
//
//import com.letsdoit.core.product.constant.Constants;
//import org.apache.commons.lang3.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.MDC;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.WebFilter;
//import org.springframework.web.server.WebFilterChain;
//import org.springframework.web.util.HtmlUtils;
//import reactor.core.publisher.Mono;
//
//import java.util.UUID;
//
//@Service
//public class ApplicationWebFilter implements WebFilter {
//    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationWebFilter.class);
//
//    protected String identifier(String id, long startTime) {
//
//        return id + "-" + startTime;
//    }
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
//        return chain.filter(exchange);
//        // Pre-handle logic
////        System.out.println("Pre-handle logic");
////        preHandle(exchange,chain);
////        // to get the unix timestamp or epoch seconds, the value of System.currentTimeMillis() should be divided by zero
////        long startTimestamp = System.currentTimeMillis();
////        // to get the nano timeframe precision computation, use value of System.nanoTime()
////        long nanoFrameStart = System.nanoTime();
////
////        String apiUriPath = exchange.getRequest().getPath().value();
////        System.out.println("Pre-handle logic MDC"+ MDC.get(Constants.X_CORRELATION_ID));
////        LOGGER.info("request interceptor -> (requestId) {} (startTimestamp) {} (nanosFrameStart) {} (apiUriPath) {} ",
////                MDC.get(Constants.X_CORRELATION_ID), startTimestamp, nanoFrameStart, MDC.get(Constants.API));
////
////        String identifier = identifier(MDC.get(Constants.X_CORRELATION_ID), startTimestamp);
////        MDC.put("identifier", identifier);
////        return chain.filter(exchange)
////                .doFinally(ts -> {
////                    System.out.println("Post-handle logic doFinally");
////                    afterCompletion();
////                });
//    }
//
//
//
//    public boolean preHandle(ServerWebExchange exchange, WebFilterChain chain) {
//
//        final String correlationId= getCorrelationId(exchange.getRequest());
//        MDC.put(Constants.X_CORRELATION_ID, correlationId);
//        MDC.put(Constants.API, exchange.getRequest().getPath().value());
//        return true;
//    }
//
//    private String getCorrelationId(ServerHttpRequest request) {
//        String rawCorrelationId= StringUtils.defaultIfBlank(request.getHeaders().getFirst(Constants.X_CORRELATION_ID),
//                UUID.randomUUID().toString());
//        return HtmlUtils.htmlEscape(rawCorrelationId);
//    }
//
//    public void afterCompletion() {
//        MDC.remove(Constants.X_CORRELATION_ID);
//        MDC.remove(Constants.API);
//    }
//}
