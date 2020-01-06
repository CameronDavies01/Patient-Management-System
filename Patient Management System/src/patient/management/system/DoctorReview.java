/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system;

import patient.management.system.HospitalSystem.DoctorAddressLine1;
import patient.management.system.HospitalSystem.DoctorAddressLine2;
import patient.management.system.HospitalSystem.DoctorCity;
import patient.management.system.HospitalSystem.DoctorCountry;
import patient.management.system.HospitalSystem.DoctorForename;
import patient.management.system.HospitalSystem.DoctorSurname;
import patient.management.system.HospitalSystem.DoctorEmail;
import patient.management.system.HospitalSystem.DoctorUsername;
import patient.management.system.HospitalSystem.DoctorPassword;
import patient.management.system.HospitalSystem.DoctorPostcode;
import patient.management.system.HospitalSystem.DoctorRating;
import patient.management.system.HospitalSystem.DoctorReview;


import javax.swing.JOptionPane;



/**
 *
 * @author camer
 */
public class DoctorReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String InputDoctorForename = JOptionPane.showInputDialog(null, "What is the first name of the doctor you want to review?");
        String InputDoctorSurname = JOptionPane.showInputDialog(null, "What is the second name of the doctor you want to review?");
        String InputDoctorReview = JOptionPane.showInputDialog(null, "What is your review!");
        String InputDoctorRating = JOptionPane.showInputDialog(null, "What would you give this doctor out of 10?");
 
        DoctorForename objDoctorForename =
                new DoctorForename(InputDoctorForename);
        DoctorSurname objDoctorSurname =
                new DoctorSurname(InputDoctorSurname);
        DoctorReview objDoctorReview =
                new DoctorReview(InputDoctorReview);
        DoctorRating objDoctorRating =
                new DoctorRating(InputDoctorRating);
        
        String strMessage = "Your review for " + objDoctorForename.getDoctorForename() 
                + " " + objDoctorSurname.getPatientSurname()
                + " is " + objDoctorReview.getDoctorReview()
                + " with a rating of " + objDoctorRating.getDoctorRating() 
                +".";    
        System.out.println(strMessage);
                
    }
    
}
