package com.star.productservicenov.controlleradvice;

import com.star.productservicenov.exceptions.ProductNotFoundExcption;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundExcption.class)
    public void handleProductNotFoundException(){

    }

}
