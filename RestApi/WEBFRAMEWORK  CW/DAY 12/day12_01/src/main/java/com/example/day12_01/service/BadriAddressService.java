package com.example.day12_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.repository.BadriAddressRepo;
import com.example.day12_01.repository.BadriEmployeeRepo;

@Service
public class BadriAddressService {
    @Autowired
    DilipAddressRepo addressRepo;
    @Autowired
    BadriEmployeeRepo employeeRepo;
    public BadriAddress setAddressById(int id,BadriAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
