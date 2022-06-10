package com.sparta.studywebpage.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
@RequiredArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
public enum ErrorCode {
    // 400 Bad Request
    TEMPORARY_SERVER_ERROR(HttpStatus.BAD_REQUEST, "400_0", "잘못된 요청입니다."),
    OUT_OF_RANGE_MIN_ORDER_PRICE(HttpStatus.BAD_REQUEST, "400_1", "최소 주문 가격은 1,000원 ~ 100,000원 입니다."),
    NOT100WON_MIN_ORDER_PRICE(HttpStatus.BAD_REQUEST, "400_2", "100원 단위로만 입력 가능합니다."),
    OUT_OF_RANGE_DELIVERY_FEE(HttpStatus.BAD_REQUEST, "400_3", "기본 배달 가격은 0원 ~ 10000원 입니다."),
    NOT500WON_MIN_DELIVERY_FEE(HttpStatus.BAD_REQUEST, "400_4", "500원 단위로만 입력 가능합니다."),

    OUT_OF_RANGE_FOOD_PRICE(HttpStatus.BAD_REQUEST, "400_5", "음식 가격은 100원 ~ 1000000원 입니다."),
    NOT100WON_FOOD_PRICE(HttpStatus.BAD_REQUEST, "400_6", "100원 단위로만 입력 가능합니다."),
    FOOD_QUANTITY_NOT_ALLOWED(HttpStatus.BAD_REQUEST, "400_7", "허용 값은 1부터 100입니다."),

    SAME_FOOD_EXISTS(HttpStatus.BAD_REQUEST, "400_8", "같은 이름의 음식이 존재합니다."),

    NOT_OVER_MINIMUM_PRICE(HttpStatus.BAD_REQUEST, "400_8", "최소 주문 가격을 넘도록 해주세요."),

    // 404 Not Found
    NOT_FOUND_RESTAURANT(HttpStatus.NOT_FOUND, "404_1", "해당 음식점 아이디가 존재하지 않습니다."),
    NOT_FOUND_FOOD(HttpStatus.NOT_FOUND, "404_2", "해당 음식 아이디가 존재하지 않습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String errorMessage;

    /*ErrorCode(HttpStatus httpStatus, String errorCode, String errorMessage) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }*/
}
