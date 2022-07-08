package com.toomuchcoder.api.auth.exeption;

public class CustomExeption extends RuntimeException{
    private static final String MESSAGE = "이미 등록되어 있습니다.";
    public CustomExeption(){
        super(MESSAGE);
    }
}
