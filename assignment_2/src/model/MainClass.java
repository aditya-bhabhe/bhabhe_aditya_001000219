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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test t1 = new Test();
        t1.case1();
        t1.case2();
        t1.case3();
        t1.case4();
        t1.case5();
        t1.case6();
//        Patient p1 = new Patient();
//        VitalSigns vs = new VitalSigns();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Patient Information");
//        System.out.println("Enter Patient Name");
//        p1.setPatientName(scan.next());
//        System.out.println("Enter Patient Age");
//        int i;
//        System.out.println("Enter 0 to enter patient's age in months or Enter 1 to enter Patient's age in years");
//        i = scan.nextInt();
//        if(i == 0){
//            int age;
//            System.out.println("Enter patient's age in months");
//            p1.setPatientAge(scan.nextFloat()/12);
//            System.out.println(p1.getPatientAge());
//        }else if(i == 1){
//            int age;
//            System.out.println("Enter patient's age in years");
//            p1.setPatientAge(scan.nextFloat());
//            System.out.println(p1.getPatientAge());
//        }
//        System.out.println("Enter patient's heart rate");
//        vs.setPatientHeartRate(scan.nextInt());
//        System.out.println("Enter patient's respiratory rate");
//        vs.setPatientRespRate(scan.nextInt());
//        System.out.println("Enter patient's blood pressure");
//        vs.setPatientBloodPressure(scan.nextDouble());
//        System.out.println("Enter 0 to enter patient's weight in pounds or Enter 1 to enter patient's weight in kg");
//        int a = scan.nextInt();
//        if(a == 0){
//            System.out.println("Enter patient weight in pounds");
//            double weight = scan.nextDouble();
//            vs.setPatientWeightPounds(weight);
//            vs.setPatientWeightKg(weight/2.21);
//            System.out.println(vs.getPatientWeightKg());
//            System.out.println(vs.getPatientWeightPounds());
//        }else{
//            System.out.println("Enter patient weight in kg");
//            double weight = scan.nextDouble();
//            vs.setPatientWeightPounds(weight*2.21);
//            vs.setPatientWeightKg(weight);
//            System.out.println(vs.getPatientWeightKg());
//            System.out.println(vs.getPatientWeightPounds());
//        }
//        p1.setVitals(vs);
//        boolean report = p1.isPatientNormal();
//        System.out.println("----------------------------------------");
//        if(report == true){
//            System.out.println("Patient is normal.");
//        }else{
//            System.out.println("Patient is abnormal.");
//        }
//        System.out.println(report);
    }
    
}
