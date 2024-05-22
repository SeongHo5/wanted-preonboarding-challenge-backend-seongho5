package com.market.wanted.application.exception;

import lombok.Getter;

@Getter
public abstract class ApiException extends RuntimeException {

    private final Integer status;
    private final String message;

    protected ApiException(ExceptionStatus exceptionStatus) {
        super(exceptionStatus.getMessage());
        this.status = exceptionStatus.getStatus();
        this.message = exceptionStatus.getMessage();
    }

    protected ApiException(ExceptionStatus exceptionStatus, String additionalMessage) {
        super(exceptionStatus.getMessage());
        this.status = exceptionStatus.getStatus();
        this.message = exceptionStatus.getMessage() + " : " + additionalMessage;
    }

}
