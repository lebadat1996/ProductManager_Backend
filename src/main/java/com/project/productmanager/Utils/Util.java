package com.project.productmanager.Utils;

import com.project.productmanager.model.Response;

public class Util {
    public static Response responseSuccess() {
        Response response = new Response();
        response.setMessage("Success");
        response.setStatus("000");
        return response;
    }
    public static Response responseUnSuccess() {
        Response response = new Response();
        response.setMessage("No Success");
        response.setStatus("001");
        return response;
    }
}
