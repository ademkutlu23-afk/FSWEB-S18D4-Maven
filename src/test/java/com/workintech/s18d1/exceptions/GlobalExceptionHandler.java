package com.workintech.s18d1.exceptions;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@AllArgsConstructor

public class GlobalExceptionHandler {
    @ExceptionHandler(BurgerErrorException.class)
public ResponseEntity<BurgerErrorResponse> handleException(BurgerErrorException burgerException){
        BurgerErrorResponse response = new BurgerErrorResponse(burgerException.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
}

}


