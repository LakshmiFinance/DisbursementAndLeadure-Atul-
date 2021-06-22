package com.loandisbursment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursment.Model.LoanDisbursementMaster;
import com.loandisbursment.ServiceI.HomeLoanDisbursementMasterI;
@CrossOrigin("*")
@RestController
public class HomeLoanDisbursementMasterController 
{
     @Autowired
     private HomeLoanDisbursementMasterI hs;
     
     @PostMapping("/send")
     public void addLoanDisbursementMaster(@RequestBody LoanDisbursementMaster ldm)
     {
    	 hs.saveLoanDisbursementMaster(ldm);
     }
     @GetMapping("/fetch")
     public List<LoanDisbursementMaster> retriveData()
     {
    	 List<LoanDisbursementMaster> list=hs.fetchAllData();
    	 return list;
     }

}
