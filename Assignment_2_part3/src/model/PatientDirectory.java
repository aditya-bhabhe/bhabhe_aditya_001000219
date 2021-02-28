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
    
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        patientHistory.add(patient);
    }
    
    
    public void printPatients(){
        for (Patient p1 : patientHistory){
            System.out.println("First Name: "+p1.getFirstName());
            System.out.println("Last Name: "+p1.getLastName());
            System.out.println("Age: "+p1.getAge());
            System.out.println("Total Records: "+p1.getEncounterHistory().size());
            System.out.println("_________________________________________");
        }
    }
    
    public int totalPatient(){
        return patientHistory.size();
    }
    
    
}
