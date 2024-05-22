package com.market.wanted.application.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionStatus {

    NOT_FOUND_PRODUCT(404, "상품을 찾을 수 없어요!"),
    DUPLICATED_USER_ENTITY(409, "이미 존재하는 사용자에요!"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final Integer status;
    private final String message;
}
