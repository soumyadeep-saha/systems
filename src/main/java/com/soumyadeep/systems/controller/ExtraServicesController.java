package com.soumyadeep.systems.controller;


import com.soumyadeep.systems.model.SellerDto;
import com.soumyadeep.systems.service.ExtraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtraServicesController {

    @Autowired
    ExtraServices extraServices;

    @RequestMapping(value = "/external/employee", method = RequestMethod.GET)
    public SellerDto getEmployee() {

        System.out.println("Inside controller ");
        SellerDto emp = extraServices.getEmp();
        return emp;
    }
}
