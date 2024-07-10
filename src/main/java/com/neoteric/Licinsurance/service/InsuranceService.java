package com.neoteric.Licinsurance.service;

import com.neoteric.Licinsurance.model.LicInsuranceForm;
import com.neoteric.Licinsurance.model.PlanType;

public class InsuranceService {





    public PlanType getInsurance(LicInsuranceForm licInsuranceForm){



        if(licInsuranceForm.age>10&&licInsuranceForm.age<75){
            PlanType planType=new PlanType();
            planType.typeOfInsurance="Health Insurence";
            planType.policyNumbber="LIC002";

          return planType;
        }else {
            System.out.println( "your are not elgible for Insurence");
          return null;
        }

    }


}
