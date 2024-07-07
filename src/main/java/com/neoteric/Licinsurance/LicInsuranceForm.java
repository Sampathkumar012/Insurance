package com.neoteric.Licinsurance;

public class LicInsuranceForm {


    public String typeofinsurance;
    public String name;
    public String fathername;
    public int age;
    public String address;
    public long phonenumber;
    public String relationstatus;
    public String signature;

    @Override
    public String toString() {
        return "LicInsuranceForm{" +
                "typeofinsurance='" + typeofinsurance + '\'' +

                ",fathername='" + fathername+ '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phonenumber=" + phonenumber +
                ", relationstastus='" + relationstatus + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
