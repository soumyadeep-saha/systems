package com.soumyadeep.systems.service;

import com.soumyadeep.systems.model.Item;
import com.soumyadeep.systems.model.SellerDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ExtraServices {

    public SellerDto getEmp() {

        SellerDto emp = getEmployeeFromDb();
        return emp;
    }

    public SellerDto getEmployeeFromDb() {

        System.out.println("Into External Services");
        SellerDto seller = new SellerDto();
        seller.setEmailId("original-email-id@gmail.com");
        seller.setFirstName("Original First Name");
        seller.setLastName("Original Last Name");
        seller.setId(1L);
        Item item = new Item();
        item.setCategory("Original Item Category");
        item.setId(1L);
        item.setName("Original Item Name");
        item.setPrice(100.0d);
        seller.setItemsSold(Arrays.asList(item));
        return seller;
    }
}
