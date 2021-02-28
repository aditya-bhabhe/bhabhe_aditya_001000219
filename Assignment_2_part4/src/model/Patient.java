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
public class Patient extends Person{
    private ArrayList<Encounter> encounterHistory = new ArrayList<Encounter>(); 
    private boolean abnormalBloodCases;
    
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addEncounter(){
        Encounter e1 = new Encounter();
        encounterHistory.add(e1);
        return e1;
    }
    
    public boolean isPatientNormal(Encounter e2){
        
        if(getAge() == 0){
            return ((e2.getVitals().getPatientRespRate() >= 30 && e2.getVitals().getPatientRespRate() <= 50) && (e2.getVitals().getPatientHeartRate() >= 120 && e2.getVitals().getPatientHeartRate() <= 160) && (e2.getVitals().getPatientBloodPressure() >= 50 && e2.getVitals().getPatientBloodPressure() <= 70) && ((e2.getVitals().getPatientWeightKg() >= 2 && e2.getVitals().getPatientWeightKg() <= 3) || (e2.getVitals().getPatientWeightPounds() >= 4.5 && e2.getVitals().getPatientWeightPounds() <= 7)));
        }
        else if(getAge() > 0 && getAge() < 1){
            return ((e2.getVitals().getPatientRespRate() >= 20 && e2.getVitals().getPatientRespRate() <= 30) && (e2.getVitals().getPatientHeartRate() >= 80 && e2.getVitals().getPatientHeartRate() <= 140) && (e2.getVitals().getPatientBloodPressure() >= 70 && e2.getVitals().getPatientBloodPressure() <= 100) && ((e2.getVitals().getPatientWeightKg() >= 4 && e2.getVitals().getPatientWeightKg() <= 10) || (e2.getVitals().getPatientWeightPounds() >= 9 && e2.getVitals().getPatientWeightPounds() <= 22)));
        }else if(getAge() >= 1 && getAge() < 3){
            return ((e2.getVitals().getPatientRespRate() >= 20 && e2.getVitals().getPatientRespRate() <= 30) && (e2.getVitals().getPatientHeartRate() >= 80 && e2.getVitals().getPatientHeartRate() <= 130) && (e2.getVitals().getPatientBloodPressure() >= 80 && e2.getVitals().getPatientBloodPressure() <= 110) && ((e2.getVitals().getPatientWeightKg() >= 10 && e2.getVitals().getPatientWeightKg() <= 14) || (e2.getVitals().getPatientWeightPounds() >= 22 && e2.getVitals().getPatientWeightPounds() <= 31)));
        }else if(getAge() >= 3 && getAge() < 6){
            return ((e2.getVitals().getPatientRespRate() >= 20 && e2.getVitals().getPatientRespRate() <= 30) && (e2.getVitals().getPatientHeartRate() >= 80 && e2.getVitals().getPatientHeartRate() <= 120) && (e2.getVitals().getPatientBloodPressure() >= 80 && e2.getVitals().getPatientBloodPressure() <= 110) && ((e2.getVitals().getPatientWeightKg() >= 14 && e2.getVitals().getPatientWeightKg() <= 18) || (e2.getVitals().getPatientWeightPounds() >= 31 && e2.getVitals().getPatientWeightPounds() <= 40)));
        }else if(getAge() >= 6 && getAge() < 13){
            return ((e2.getVitals().getPatientRespRate() >= 20 && e2.getVitals().getPatientRespRate() <= 30) && (e2.getVitals().getPatientHeartRate() >= 70 && e2.getVitals().getPatientHeartRate() <= 110) && (e2.getVitals().getPatientBloodPressure() >= 80 && e2.getVitals().getPatientBloodPressure() <= 120) && ((e2.getVitals().getPatientWeightKg() >= 20 && e2.getVitals().getPatientWeightKg() <= 42) || (e2.getVitals().getPatientWeightPounds() >= 41 && e2.getVitals().getPatientWeightPounds() <= 92)));
        }else{
            return ((e2.getVitals().getPatientRespRate() >= 12 && e2.getVitals().getPatientRespRate() <= 20) && (e2.getVitals().getPatientHeartRate() >= 55 && e2.getVitals().getPatientHeartRate() <= 105) && (e2.getVitals().getPatientBloodPressure() >= 110 && e2.getVitals().getPatientBloodPressure() <= 120) && ((e2.getVitals().getPatientWeightKg() > 50)  || (e2.getVitals().getPatientWeightPounds() > 110)));
        }
        
     
    }
    
    public void printVitals(){
           
        for(Encounter e1 : encounterHistory){
            VitalSigns v1 = e1.getVitals();
            System.out.println("Vital Signs " + (encounterHistory.indexOf(e1)+1));
            System.out.println("Patient's respiratory rate:" + v1.getPatientRespRate());
            System.out.println("Patient's heart rate:" + v1.getPatientHeartRate());
            System.out.println("Patient's blood pressure:" + v1.getPatientBloodPressure());
            System.out.println("Patient's weight in kg:" + v1.getPatientWeightKg());
            System.out.println("Patient's weight in pounds:" + v1.getPatientWeightPounds());
            System.out.println("Time Stamp:" + e1.getDate());
            System.out.println("----------------------------------------");
            
            System.out.println("Patient Normal: "+isPatientNormal(e1));
        }
    }
    
    public void isThisVitalSignNormnal(String patientParameter){
        VitalSigns vitals = encounterHistory.get(encounterHistory.size()-1).getVitals();
        double age = this.getAge();
        if(age == 0){
                if(patientParameter.equals("Respiratory-Rate")){
                    System.out.println((vitals.getPatientRespRate() >= 30 && vitals.getPatientRespRate() <= 50)); 
                }else if(patientParameter.equals("Heart-Rate")){
                    System.out.println((vitals.getPatientHeartRate() >= 120 && vitals.getPatientHeartRate() <= 160));
                }else if(patientParameter.equals("Blood-Pressure")){
                    System.out.println((vitals.getPatientBloodPressure() >= 50 && vitals.getPatientBloodPressure() <= 70));
                }else if(patientParameter.equals("Weight-Kg")){
                    System.out.println((vitals.getPatientWeightKg() >= 2 && vitals.getPatientWeightKg() <= 3));
                }else{
                    System.out.println((vitals.getPatientWeightPounds() >= 4.5 && vitals.getPatientWeightPounds() <= 7));
                }
                 
        }else if(age > 0 && age < 1 ){
            if(patientParameter.equals("Respiratory-Rate")){
                System.out.println((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30));
            }else if(patientParameter.equals("Heart-Rate")){
                System.out.println((vitals.getPatientHeartRate() >= 80 && vitals.getPatientHeartRate() <= 140));
            }else if(patientParameter.equals("Blood-Pressure")){
                System.out.println((vitals.getPatientBloodPressure() >= 70 && vitals.getPatientBloodPressure() <= 100));
            }else if(patientParameter.equals("Weight-Kg")){
                System.out.println((vitals.getPatientWeightKg() >= 4 && vitals.getPatientWeightKg() <= 10));
            }else{
                System.out.println((vitals.getPatientWeightPounds() >= 9 && vitals.getPatientWeightPounds() <= 22));
            }
            
        }else if(age >= 1 && age < 3){
            if(patientParameter.equals("Respiratory-Rate")){
                System.out.println((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30));
            }else if(patientParameter.equals("Heart-Rate")){
                System.out.println((vitals.getPatientHeartRate() >= 80 && vitals.getPatientHeartRate() <= 130));
            }else if(patientParameter.equals("Blood-Pressure")){
                System.out.println((vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110));
            }else if(patientParameter.equals("Weight-Kg")){
                System.out.println((vitals.getPatientWeightKg() >= 10 && vitals.getPatientWeightKg() <= 14));
            }else{
                System.out.println((vitals.getPatientWeightPounds() >= 22 && vitals.getPatientWeightPounds() <= 31));
            }
           
        }else if(age >= 3 && age <= 5){
            if(patientParameter.equals("Respiratory-Rate")){
                System.out.println((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30));
            }else if(patientParameter.equals("Heart-Rate")){
                System.out.println((vitals.getPatientHeartRate() >= 80 && vitals.getPatientHeartRate() <= 120));
            }else if(patientParameter.equals("Blood-Pressure")){
                System.out.println((vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110));
            }else if(patientParameter.equals("Weight-Kg")){
                System.out.println((vitals.getPatientWeightKg() >= 14 && vitals.getPatientWeightKg() <= 18));
            }else{
                System.out.println((vitals.getPatientWeightPounds() >= 31 && vitals.getPatientWeightPounds() <= 40));
            }
        }else if(age >= 6 && age <= 12){
            if(patientParameter.equals("Respiratory-Rate")){
                System.out.println((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30));
            }else if(patientParameter.equals("Heart-Rate")){
                System.out.println((vitals.getPatientHeartRate() >= 70 && vitals.getPatientHeartRate() <= 110));
            }else if(patientParameter.equals("Blood-Pressure")){
                System.out.println((vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 120));
            }else if(patientParameter.equals("Weight-Kg")){
                System.out.println((vitals.getPatientWeightKg() >= 20 && vitals.getPatientWeightKg() <= 42));
            }else{
                System.out.println((vitals.getPatientWeightPounds() >= 41 && vitals.getPatientWeightPounds() <= 92));
            }
        }else if(age > 13){
            if(patientParameter.equals("Respiratory-Rate")){
                System.out.println((vitals.getPatientRespRate() >= 12 && vitals.getPatientRespRate() <= 20));
            }else if(patientParameter.equals("Heart-Rate")){
                System.out.println((vitals.getPatientHeartRate() >= 55 && vitals.getPatientHeartRate() <= 105));
            }else if(patientParameter.equals("Blood-Pressure")){
                System.out.println((vitals.getPatientBloodPressure() >= 110 && vitals.getPatientBloodPressure() <= 120));
            }else if(patientParameter.equals("Weight-Kg")){
                System.out.println((vitals.getPatientWeightKg() > 50));
            }else{
                System.out.println((vitals.getPatientWeightPounds() > 110));
            }
        }
    }
    
    public boolean isBloodPressureNormal(){
        double age = this.getAge();
        VitalSigns vitals = encounterHistory.get(encounterHistory.size()-1).getVitals();
        if(age == 0){
            abnormalBloodCases = (vitals.getPatientBloodPressure() >= 50 && vitals.getPatientBloodPressure() <= 70);
        }else if(age > 0 && age < 1 ){
            abnormalBloodCases = (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110);
        }else if(age >= 1 && age < 3){
            abnormalBloodCases = (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110);
        }else if(age >= 3 && age <= 5){
            abnormalBloodCases = (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110);
        }else if(age >= 6 && age <= 12){
            abnormalBloodCases = (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 120);
        }else if(age > 13){
            abnormalBloodCases = (vitals.getPatientBloodPressure() >= 110 && vitals.getPatientBloodPressure() <= 120);
        }
        return abnormalBloodCases;
    }
}



