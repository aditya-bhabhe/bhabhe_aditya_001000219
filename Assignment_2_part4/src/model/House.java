/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class House {
    private ArrayList<Patient> patientDirectory = new ArrayList<Patient>();
    private Patient patient;
    private int countAbnormalCaseInHouse;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        patientDirectory.add(patient);
    }
    
    public int abnormalCasesInHouse(){
        countAbnormalCaseInHouse=0;
        for(Patient p:patientDirectory){
            if(p.isBloodPressureNormal()==false){
                countAbnormalCaseInHouse+=1;
            }
        }
        return countAbnormalCaseInHouse;
    }
    
}
