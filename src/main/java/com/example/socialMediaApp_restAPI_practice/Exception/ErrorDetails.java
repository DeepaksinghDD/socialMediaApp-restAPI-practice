package com.example.socialMediaApp_restAPI_practice.Exception;

import java.time.LocalDate;

public class ErrorDetails {
    private LocalDate timestamp;
    private String  message;
    private String details;

    public ErrorDetails(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;

    }

    public String getDetails() {
        return details;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }


}
