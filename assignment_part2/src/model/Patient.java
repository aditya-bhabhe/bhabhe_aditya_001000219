
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
public class Patient {
    private float patientAge;
    private String patientName;
    private VitalSigns vitals;
    public boolean result;

    private ArrayList<VitalSigns> patientHistory = new ArrayList<VitalSigns>();  

    public ArrayList<VitalSigns> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<VitalSigns> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    public double getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(float patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }
    
    
    public boolean isPatientNormal(){
   
        if(patientAge == 0){
            return ((vitals.getPatientRespRate() >= 30 && vitals.getPatientRespRate() <= 50) && (vitals.getPatientHeartRate() >= 120 && vitals.getPatientHeartRate() <= 160) && (vitals.getPatientBloodPressure() >= 50 && vitals.getPatientBloodPressure() <= 70) && ((vitals.getPatientWeightKg() >= 2 && vitals.getPatientWeightKg() <= 3) || (vitals.getPatientWeightPounds() >= 4.5 && vitals.getPatientWeightPounds() <= 7)));
        }
        else if(patientAge > 0 && patientAge < 1){
            return ((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30) && (vitals.getPatientHeartRate() >= 80 && vitals.getPatientHeartRate() <= 140) && (vitals.getPatientBloodPressure() >= 70 && vitals.getPatientBloodPressure() <= 100) && ((vitals.getPatientWeightKg() >= 4 && vitals.getPatientWeightKg() <= 10) || (vitals.getPatientWeightPounds() >= 9 && vitals.getPatientWeightPounds() <= 22)));
        }else if(patientAge >= 1 && patientAge < 3){
            return ((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30) && (vitals.getPatientHeartRate() >= 80 && vitals.getPatientHeartRate() <= 130) && (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110) && ((vitals.getPatientWeightKg() >= 10 && vitals.getPatientWeightKg() <= 14) || (vitals.getPatientWeightPounds() >= 22 && vitals.getPatientWeightPounds() <= 31)));
        }else if(patientAge >= 3 && patientAge < 6){
            return ((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30) && (vitals.getPatientHeartRate() >= 80 && vitals.getPatientHeartRate() <= 120) && (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 110) && ((vitals.getPatientWeightKg() >= 14 && vitals.getPatientWeightKg() <= 18) || (vitals.getPatientWeightPounds() >= 31 && vitals.getPatientWeightPounds() <= 40)));
        }else if(patientAge >= 6 && patientAge < 13){
            return ((vitals.getPatientRespRate() >= 20 && vitals.getPatientRespRate() <= 30) && (vitals.getPatientHeartRate() >= 70 && vitals.getPatientHeartRate() <= 110) && (vitals.getPatientBloodPressure() >= 80 && vitals.getPatientBloodPressure() <= 120) && ((vitals.getPatientWeightKg() >= 20 && vitals.getPatientWeightKg() <= 42) || (vitals.getPatientWeightPounds() >= 41 && vitals.getPatientWeightPounds() <= 92)));
        }else{
            return ((vitals.getPatientRespRate() >= 12 && vitals.getPatientRespRate() <= 20) && (vitals.getPatientHeartRate() >= 55 && vitals.getPatientHeartRate() <= 105) && (vitals.getPatientBloodPressure() >= 110 && vitals.getPatientBloodPressure() <= 120) && ((vitals.getPatientWeightKg() > 50)  || (vitals.getPatientWeightPounds() > 110)));
        }
        
     
    }
    
    public VitalSigns newVitalSigns(){
        VitalSigns v1 = new VitalSigns();
        patientHistory.add(v1);
        return v1;
    }
    
    public void printVitals(){
        for(VitalSigns v1 : this.getPatientHistory()){
            System.out.println("Vital Signs " + (this.getPatientHistory().indexOf(v1) + 1));
            System.out.println("Patient's respiratory rate:" + v1.getPatientRespRate());
            System.out.println("Patient's heart rate:" + v1.getPatientHeartRate());
            System.out.println("Patient's blood pressure:" + v1.getPatientBloodPressure());
            System.out.println("Patient's weight in kg:" + v1.getPatientWeightKg());
            System.out.println("Patient's weight in pounds:" + v1.getPatientWeightPounds());
            System.out.println("Time Stamp:" + v1.getTime());
            System.out.println("----------------------------------------");
        }
    }
    
    public void isThisVitalSignNormnal(String patientParameter){
        double age = this.getPatientAge();
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
}
