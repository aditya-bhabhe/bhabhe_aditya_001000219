/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author adity
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PatientDirectory patientDir = new PatientDirectory();
        PersonDirectory pd = new PersonDirectory();
        
        Person person1 = new Person();
        Patient p1 = new Patient();
        p1.setFirstName("Aditya");
        p1.setLastName("Bhabhe");
        p1.setAge(2);
        person1.setAge(p1.getAge());
        person1.setFirstName(p1.getFirstName());
        person1.setLastName(p1.getLastName());
        pd.setPerson(person1);
        Encounter e1 = p1.addEncounter();
        VitalSigns v1 = new VitalSigns();
        v1.setPatientBloodPressure(120);
        v1.setPatientHeartRate(90);
        v1.setPatientRespRate(25);
        v1.setPatientWeightKg(12);
        e1.setVitals(v1);
        p1.printVitals();
        
        Patient p2 = new Patient();
        Person person2 = new Person();
        p2.setAge(5);
        p2.setFirstName("Zarana");
        p2.setLastName("Bhadricha");
        person2.setAge(p2.getAge());
        person2.setFirstName(p2.getFirstName());
        person2.setLastName(p2.getLastName());
        pd.setPerson(person2);
        Encounter e2 = p2.addEncounter();
        VitalSigns v2 = new VitalSigns();
        v2.setPatientBloodPressure(100);
        v2.setPatientHeartRate(120);
        v2.setPatientRespRate(22);
        v2.setPatientWeightKg(18);
        e2.setVitals(v2);
        Encounter e4 = p2.addEncounter();
        VitalSigns v4 = new VitalSigns();
        v4.setPatientBloodPressure(110);
        v4.setPatientHeartRate(119);
        v4.setPatientRespRate(30);
        v4.setPatientWeightKg(15);
        e4.setVitals(v4);
        p2.printVitals();
        
        Person person3 = new Person();
        Patient p3 = new Patient();
        p3.setFirstName("John");
        p3.setLastName("Dow");
        p3.setAge(24);
        person3.setAge(p3.getAge());
        person3.setFirstName(p3.getFirstName());
        person3.setLastName(p3.getLastName());
        pd.setPerson(person3);
        Encounter e5 = p3.addEncounter();
        VitalSigns v5 = new VitalSigns();
        v5.setPatientBloodPressure(115);
        v5.setPatientHeartRate(60);
        v5.setPatientRespRate(15);
        v5.setPatientWeightKg(60);
        e5.setVitals(v5);
        p3.printVitals();
        
        Patient p4 = new Patient();
        Person person4 = new Person();
        p4.setAge(0);
        p4.setFirstName("Neha");
        p4.setLastName("Lokhande");
        person4.setAge(p4.getAge());
        person4.setFirstName(p4.getFirstName());
        person4.setLastName(p4.getLastName());
        pd.setPerson(person4);
        Encounter e6 = p4.addEncounter();
        VitalSigns v6 = new VitalSigns();
        v6.setPatientBloodPressure(110);
        v6.setPatientHeartRate(42);
        v6.setPatientRespRate(30);
        v6.setPatientWeightKg(5);
        e6.setVitals(v6);
        Encounter e7 = p4.addEncounter();
        VitalSigns v7 = new VitalSigns();
        v7.setPatientBloodPressure(105);
        v7.setPatientHeartRate(119);
        v7.setPatientRespRate(32);
        v7.setPatientWeightKg(7);
        e7.setVitals(v7);
        p4.printVitals();
        
        patientDir.setPatient(p1);
        patientDir.setPatient(p2);
        patientDir.setPatient(p3);
        patientDir.setPatient(p4);
        
        patientDir.printPatients();
        
    }
    
}
