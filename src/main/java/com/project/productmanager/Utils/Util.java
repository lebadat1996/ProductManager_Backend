package com.project.productmanager.Utils;

import com.project.productmanager.model.Response;

public class Util {
    public static Response responseSuccess() {
        Response response = new Response();
        response.setMessage("Thêm Mới Khách Hàng Thành Công");
        response.setStatus("000");
        response.setResponse("Success");
        return response;
    }

    public static Response responseUnSuccess() {
        Response response = new Response();
        response.setMessage("Thêm Mới Khách Hàng Không Thành Công");
        response.setStatus("001");
        response.setResponse("No Success");
        return response;
    }
}
