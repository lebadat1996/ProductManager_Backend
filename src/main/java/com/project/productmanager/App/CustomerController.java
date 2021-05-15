package com.project.productmanager.App;

import com.project.productmanager.Entity.Customer;
import com.project.productmanager.Service.Impl.CustomerServiceImpl;
import com.project.productmanager.Utils.Util;
import com.project.productmanager.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Customer customer) {
        try {
            customerService.save(customer);
            return new ResponseEntity<>(Util.responseSuccess(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(Util.responseUnSuccess(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Customer customer) {
        try {
            Response response = null;
            customerService.update(customer);
            return new ResponseEntity<>(new Response("Cập nhật khách hàng thành công", "000", "Success"), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new Response("Cập nhật khách hàng không  thành công", "001", "No Success"), HttpStatus.BAD_REQUEST);
        }
    }
}
