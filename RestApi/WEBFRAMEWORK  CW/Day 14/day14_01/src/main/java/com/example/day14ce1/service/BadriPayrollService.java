package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.BadriPayroll;
import com.example.day14ce1.repository.BadriPayrollRepo;

@Service
public class BadriPayrollService {
    @Autowired
    BadriPayrollRepo payrollRepo;

    public BadriPayroll addPayroll(Long id,BadriPayroll payroll)
    {
        BadriPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<BadriPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
