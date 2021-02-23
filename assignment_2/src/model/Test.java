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
public class Test {
    public void case1(){
        Patient p1 = new Patient();
        VitalSigns vs = new VitalSigns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patient Information");
        System.out.println("Enter Patient Name");
        p1.setPatientName("Aditya");
        System.out.println(p1.getPatientName());
        System.out.println("Enter Patient Age");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
        i = 0;
        if(i == 0){
            int age;
            System.out.println("Enter patient's age in months");
            p1.setPatientAge(0/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            int age;
            System.out.println("Enter patient's age in years");
            p1.setPatientAge(scan.nextFloat());
            System.out.println(p1.getPatientAge());
        }
        System.out.println("Enter patient's heart rate");
        vs.setPatientHeartRate(120);
        System.out.println(vs.getPatientHeartRate());
        System.out.println("Enter patient's respiratory rate");
        vs.setPatientRespRate(50);
        System.out.println(vs.getPatientRespRate());
        System.out.println("Enter patient's blood pressure");
        vs.setPatientBloodPressure(51.0);
        System.out.println(vs.getPatientBloodPressure());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
        int a = 0;
        if(a == 0){
            System.out.println("Enter patient weight in pounds");
            double weight = 5.0;
            vs.setPatientWeightPounds(weight);
            System.out.println(vs.getPatientWeightPounds());
            vs.setPatientWeightKg(weight/2.21);
        }else{
            System.out.println("Enter patient weight in kg");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
        }
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        System.out.println("----------------------------------------");
        System.out.println(p1.getPatientName() + "'s" + " Report:");
        if(report == true){
            System.out.println("Patient is normal.");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("Patient is abnormal.");
            System.out.println("----------------------------------------");
        }
    }
    
    public void case2(){
        Patient p1 = new Patient();
        VitalSigns vs = new VitalSigns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patient Information");
        System.out.println("Enter Patient Name");
        p1.setPatientName("Saurabh");
        System.out.println(p1.getPatientName());
        System.out.println("Enter Patient Age");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
        i = 0;
        if(i == 0){
            float age;
            System.out.println("Enter patient's age in months");
            int months = 6;
            System.out.println(months);
            p1.setPatientAge((float) 6/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            float age;
            System.out.println("Enter patient's age in years");
            p1.setPatientAge(scan.nextFloat());
            System.out.println(p1.getPatientAge());
        }
        System.out.println("Enter patient's heart rate");
        vs.setPatientHeartRate(90);
        System.out.println(vs.getPatientHeartRate());
        System.out.println("Enter patient's respiratory rate");
        vs.setPatientRespRate(19);
        System.out.println(vs.getPatientRespRate());
        System.out.println("Enter patient's blood pressure");
        vs.setPatientBloodPressure(100.0);
        System.out.println(vs.getPatientBloodPressure());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
        int a = 0;
        if(a == 0){
            System.out.println("Enter patient weight in pounds");
            double weight = 21.0;
            vs.setPatientWeightPounds(weight);
            System.out.println(vs.getPatientWeightPounds());
            vs.setPatientWeightKg(weight/2.21);
        }else{
            System.out.println("Enter patient weight in kg");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
            System.out.println(vs.getPatientWeightKg());
            System.out.println(vs.getPatientWeightPounds());
        }
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        System.out.println("----------------------------------------");
        System.out.println(p1.getPatientName() + "'s" + " Report:");
        if(report == true){
            System.out.println("Patient is normal.");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("Patient is abnormal.");
            System.out.println("----------------------------------------");
        }
    }
    
    public void case3(){
        Patient p1 = new Patient();
        VitalSigns vs = new VitalSigns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patient Information");
        System.out.println("Enter Patient Name");
        p1.setPatientName("Rakshit");
        System.out.println(p1.getPatientName());
        System.out.println("Enter Patient Age");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
        i = 1;
        if(i == 0){
            int age;
            System.out.println("Enter patient's age in months");
            p1.setPatientAge(scan.nextFloat()/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            int age;
            System.out.println("Enter patient's age in years");
            p1.setPatientAge(2);
            System.out.println(p1.getPatientAge());
            System.out.println(p1.getPatientAge());
        }
        System.out.println("Enter patient's heart rate");
        vs.setPatientHeartRate(85);
        System.out.println(vs.getPatientHeartRate());
        System.out.println("Enter patient's respiratory rate");
        vs.setPatientRespRate(25);
        System.out.println(vs.getPatientRespRate());
        System.out.println("Enter patient's blood pressure");
        vs.setPatientBloodPressure(90.0);
        System.out.println(vs.getPatientBloodPressure());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
        int a = 1;
        if(a == 0){
            System.out.println("Enter patient weight in pounds");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight);
            vs.setPatientWeightKg(weight/2.21);
            System.out.println(vs.getPatientWeightKg());
            System.out.println(vs.getPatientWeightPounds());
        }else{
            System.out.println("Enter patient weight in kg");
            double weight = 10.0;
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
            System.out.println(vs.getPatientWeightKg());
        }
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        System.out.println("----------------------------------------");
        System.out.println(p1.getPatientName() + "'s" + " Report:");
        if(report == true){
            System.out.println("Patient is normal.");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("Patient is abnormal.");
            System.out.println("----------------------------------------");
        }
    }
    
    
    public void case4(){
        Patient p1 = new Patient();
        VitalSigns vs = new VitalSigns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patient Information");
        System.out.println("Enter Patient Name");
        p1.setPatientName("Zarana");
        System.out.println(p1.getPatientName());
        System.out.println("Enter Patient Age");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
        i = 1;
        if(i == 0){
            int age;
            System.out.println("Enter patient's age in months");
            p1.setPatientAge(scan.nextFloat()/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            int age;
            System.out.println("Enter patient's age in years");
            p1.setPatientAge(5);
            System.out.println(p1.getPatientAge());
        }
        System.out.println("Enter patient's heart rate");
        vs.setPatientHeartRate(120);
        System.out.println(vs.getPatientHeartRate());
        System.out.println("Enter patient's respiratory rate");
        vs.setPatientRespRate(30);
        System.out.println(vs.getPatientRespRate());
        System.out.println("Enter patient's blood pressure");
        vs.setPatientBloodPressure(85.0);
        System.out.println(vs.getPatientBloodPressure());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
        int a = 0;
        if(a == 0){
            System.out.println("Enter patient weight in pounds");
            double weight = 32.0;
            vs.setPatientWeightPounds(weight);
            System.out.println(vs.getPatientWeightPounds());
            vs.setPatientWeightKg(weight/2.21);
        }else{
            System.out.println("Enter patient weight in kg");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
            System.out.println(vs.getPatientWeightKg());
            System.out.println(vs.getPatientWeightPounds());
        }
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        System.out.println("----------------------------------------");
        System.out.println(p1.getPatientName() + "'s" + " Report:");
        if(report == true){
            System.out.println("Patient is normal.");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("Patient is abnormal.");
            System.out.println("----------------------------------------");
        }
    }
    
    public void case5(){
        Patient p1 = new Patient();
        VitalSigns vs = new VitalSigns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patient Information");
        System.out.println("Enter Patient Name");
        p1.setPatientName("Daniel");
        System.out.println(p1.getPatientName());
        System.out.println("Enter Patient Age");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
        i = 1;
        if(i == 0){
            int age;
            System.out.println("Enter patient's age in months");
            p1.setPatientAge(scan.nextFloat()/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            int age;
            System.out.println("Enter patient's age in years");
            p1.setPatientAge(12);
            System.out.println(p1.getPatientAge());
        }
        System.out.println("Enter patient's heart rate");
        vs.setPatientHeartRate(111);
        System.out.println(vs.getPatientHeartRate());
        System.out.println("Enter patient's respiratory rate");
        vs.setPatientRespRate(35);
        System.out.println(vs.getPatientRespRate());
        System.out.println("Enter patient's blood pressure");
        vs.setPatientBloodPressure(90.0);
        System.out.println(vs.getPatientBloodPressure());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
        int a = 1;
        if(a == 0){
            System.out.println("Enter patient weight in pounds");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight);
            System.out.println(vs.getPatientWeightPounds());
            vs.setPatientWeightKg(weight/2.21);
        }else{
            System.out.println("Enter patient weight in kg");
            double weight = 42.0;
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
            System.out.println(vs.getPatientWeightKg());
            System.out.println(vs.getPatientWeightPounds());
        }
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        System.out.println("----------------------------------------");
        System.out.println(p1.getPatientName() + "'s" + " Report:");
        if(report == true){
            System.out.println("Patient is normal.");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("Patient is abnormal.");
            System.out.println("----------------------------------------");
        }
    }
    
    public void case6(){
        Patient p1 = new Patient();
        VitalSigns vs = new VitalSigns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patient Information");
        System.out.println("Enter Patient Name");
        p1.setPatientName("Shiva");
        System.out.println(p1.getPatientName());
        System.out.println("Enter Patient Age");
        int i;
        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
        i = 1;
        if(i == 0){
            int age;
            System.out.println("Enter patient's age in months");
            p1.setPatientAge(scan.nextFloat()/12);
            System.out.println(p1.getPatientAge());
        }else if(i == 1){
            int age;
            System.out.println("Enter patient's age in years");
            p1.setPatientAge(30);
            System.out.println(p1.getPatientAge());
        }
        System.out.println("Enter patient's heart rate");
        vs.setPatientHeartRate(100);
        System.out.println(vs.getPatientHeartRate());
        System.out.println("Enter patient's respiratory rate");
        vs.setPatientRespRate(19);
        System.out.println(vs.getPatientRespRate());
        System.out.println("Enter patient's blood pressure");
        vs.setPatientBloodPressure(110.0);
        System.out.println(vs.getPatientBloodPressure());
        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
        int a = 1;
        if(a == 1){
            System.out.println("Enter patient weight in pounds");
            double weight = 111.0;
            vs.setPatientWeightPounds(weight);
            System.out.println(vs.getPatientWeightPounds());
            vs.setPatientWeightKg(weight/2.21);
        }else{
            System.out.println("Enter patient weight in kg");
            double weight = scan.nextDouble();
            vs.setPatientWeightPounds(weight*2.21);
            vs.setPatientWeightKg(weight);
            System.out.println(vs.getPatientWeightKg());
            System.out.println(vs.getPatientWeightPounds());
        }
        p1.setVitals(vs);
        boolean report = p1.isPatientNormal();
        System.out.println("----------------------------------------");
        System.out.println(p1.getPatientName() + "'s" + " Report:");
        if(report == true){
            System.out.println("Patient is normal.");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("Patient is abnormal.");
            System.out.println("----------------------------------------");
        }
    }
}
