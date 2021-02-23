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
public class Patient {
    private float patientAge;
    private String patientName;
    private VitalSigns vitals;

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
            return ((vitals.getPatientRespRate() >= 30 && vitals.getPatientRespRate() <= 50) && (vitals.getPatientHeartRate() >= 120 && vitals.getPatientHeartRate() <= 160) && (vitals.getPatientBloodPressure() >= 50 && vitals.getPatientBloodPressure() <= 70) && ((vitals.getPatientWeightKg() > 2 && vitals.getPatientWeightKg() < 3) || (vitals.getPatientWeightPounds() >= 4.5 && vitals.getPatientWeightPounds() <= 7)));
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
}
