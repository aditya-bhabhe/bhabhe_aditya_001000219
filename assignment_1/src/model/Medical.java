/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adity
 */
public class Medical {
    private String medicalNumber;
    private String allergy1;
    private String allergy2;
    private String allergy3;

    public String getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(String medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    public String getAllergy2() {
        return allergy2;
    }

    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    public String getAllergy3() {
        return allergy3;
    }

    public void setAllergy3(String allergy3) {
        this.allergy3 = allergy3;
    }
}
