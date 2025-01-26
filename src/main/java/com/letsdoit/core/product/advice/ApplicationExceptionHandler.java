package com.letsdoit.core.product.advice;

import com.letsdoit.core.product.exception.InvalidInputException;
import com.letsdoit.core.product.exception.PartnerVariantNotFoundException;
import com.letsdoit.core.product.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.function.Consumer;

@ControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ProblemDetail handleException(ProductNotFoundException ex) {
         return build(HttpStatus.NOT_FOUND, ex, problem -> {
            problem.setTitle("Product not found");
         });
    }

    @ExceptionHandler(PartnerVariantNotFoundException.class)
    public ProblemDetail handleException(PartnerVariantNotFoundException ex) {
        return build(HttpStatus.NOT_FOUND, ex, problem -> {
            problem.setTitle("Partner variant not found");
        });
    }

    @ExceptionHandler(InvalidInputException.class)
    public ProblemDetail handleException(InvalidInputException ex) {
        return build(HttpStatus.BAD_REQUEST, ex, problem -> {
            problem.setTitle("Invalid input");
        });
    }

    private ProblemDetail build(HttpStatus status, Exception ex, Consumer<ProblemDetail> consumer) {
        var problem = ProblemDetail.forStatusAndDetail(status, ex.getMessage());
        consumer.accept(problem);
        return problem;
    }
}