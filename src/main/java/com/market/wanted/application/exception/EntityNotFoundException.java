package com.market.wanted.application.exception;

public class EntityNotFoundException extends ApiException {

    public EntityNotFoundException(ExceptionStatus exceptionStatus) {
        super(exceptionStatus);
    }

}
