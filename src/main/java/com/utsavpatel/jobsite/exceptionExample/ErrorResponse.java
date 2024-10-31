package com.utsavpatel.jobsite.exceptionExample;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorResponse {

    private Date datetime = new Date();
    private boolean status;
    private int statusCode;
    private String message;

    public ErrorResponse(boolean status, int statusCode, String message) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
