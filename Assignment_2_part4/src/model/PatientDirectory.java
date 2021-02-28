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
public class PatientDirectory {
    private ArrayList<Patient> patientHistory = new ArrayList<Patient>();
    private Patient p1;
    
    public void addPatient(Patient patient){
        this.p1 = patient;
        patientHistory.add(p1);
    }
    
    public void printPatients(){
        for (Patient p1 : patientHistory){
            System.out.println(p1.getFirstName());
            System.out.println(p1.getLastName());
            System.out.println(p1.getAge());
            System.out.println("_________________________________________");
                    
        }
    }
    
    public int totalPatient(){
        return patientHistory.size();
    }
}
