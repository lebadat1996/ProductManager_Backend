package com.project.productmanager.App;

import com.project.productmanager.Entity.Customer;
import com.project.productmanager.Entity.Product;
import com.project.productmanager.Service.Impl.ProductServiceImpl;
import com.project.productmanager.Utils.Util;
import com.project.productmanager.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.project.productmanager.Constant.Constant.*;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Product product) {
        try {
            productService.save(product);
            return new ResponseEntity<>(new Response("Thêm mới sản phẩm thành công", STATUS_SUCCESS, RESPONSE_SUCCESS), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new Response("Thêm mới sản phẩm không thành công", STATUS_NO_SUCCESS, RESPONSE_NO_SUCCESS), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Product product) {
        try {
            productService.update(product);
            return new ResponseEntity<>(new Response("Cập nhật sản phẩm thành công", STATUS_SUCCESS, RESPONSE_SUCCESS), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new Response("Cập nhật sản phẩm không  thành công", STATUS_NO_SUCCESS, RESPONSE_NO_SUCCESS), HttpStatus.BAD_REQUEST);
        }
    }
}
