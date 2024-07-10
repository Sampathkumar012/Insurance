package com.neoteric.Licinsurance.model;

public class LicInsuranceForm {


    public String typeOfInsurance;
    public String name;
    public String fatherName;
    public int age;
    public String address;
    public long phoneNumber;
    public String relationStatus;
    public String signature;

    @Override
    public String toString() {
        return "LicInsuranceForm{" +
                "typeOfInsurance='" + typeOfInsurance + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", relationStatus='" + relationStatus + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
