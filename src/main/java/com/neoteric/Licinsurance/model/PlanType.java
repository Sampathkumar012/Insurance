package com.neoteric.Licinsurance.model;

public class PlanType {

    public String typeOfInsurance;
    public String policyNumbber;
    public  final double price=1000000.00;

    @Override
    public String toString() {
        return "PlanType{" +
                "typeOfInsurance='" + typeOfInsurance + '\'' +
                ", policyNumbber='" + policyNumbber + '\'' +
                ", price=" + price +
                '}';
    }
}
