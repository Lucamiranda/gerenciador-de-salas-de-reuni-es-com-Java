package com.dio.crud.saladereuniao.saladereuniao.exception;

import java.util.Date;

public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String detail;

    public ErrorDetails(Date timestamp, String messege, String detail) {
        super();
        this.timestamp = timestamp;
        this.message = messege;
        this.detail = detail;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessege() {
        return message;
    }

    public String getDetail() {
        return detail;
    }
}
