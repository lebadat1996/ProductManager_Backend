package com.project.productmanager.model;

import lombok.Data;

@Data
public class Response {
    private String message;
    private String status;
    private String response;

    public Response() {
    }

    public Response(String message, String status, String response) {
        this.message = message;
        this.status = status;
        this.response = response;
    }
}
