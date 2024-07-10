package com.neoteric.Licinsurance;

import com.neoteric.Licinsurance.model.LicInsuranceForm;
import com.neoteric.Licinsurance.model.PlanType;
import com.neoteric.Licinsurance.service.InsuranceService;
import org.junit.jupiter.api.Test;

public class LicInsuranceTest {
    @Test

    public void  test(){
        InsuranceService insuranceService=new InsuranceService();


    LicInsuranceForm customer=new LicInsuranceForm();

     customer.typeOfInsurance="Lic life insurance";
     customer.name="sampath";
     customer.fatherName="kodandharamulu";
     customer.age=24;
     customer.relationStatus="single";
     customer.phoneNumber=7569962663l;
     customer.address="khammam";
     customer.signature="sampathkumar";
     //System.out.println("lic life insurance"+customer);

     PlanType planType= insuranceService.getInsurance(customer);

        System.out.println("LICInsurence is"+planType);


    }
}
