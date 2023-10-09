package com.workintech.burger.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BurgerException extends RuntimeException {
    private HttpStatus status;

    public BurgerException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
