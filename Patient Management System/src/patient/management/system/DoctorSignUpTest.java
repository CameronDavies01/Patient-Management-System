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


import javax.swing.JOptionPane;



/**
 *
 * @author camer
 */
public class DoctorSignUpTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String InputDoctorForename = JOptionPane.showInputDialog(null, "What is your first name doctor?");
        String InputDoctorSurname = JOptionPane.showInputDialog(null, "What is your second name doctor?");
        String InputDoctorEmail = JOptionPane.showInputDialog(null, "What is your email doctor?");
        String InputDoctorUsername = JOptionPane.showInputDialog(null, "What is your username doctor?");
        String InputDoctorPassword = JOptionPane.showInputDialog(null, "What is your password doctor?");
        String InputDoctorCountry = JOptionPane.showInputDialog(null, "What country are you from doctor?");
        String InputDoctorCity = JOptionPane.showInputDialog(null, "What city do you live in doctor?");
        String InputDoctorAddressFirstLine = JOptionPane.showInputDialog(null, "What is the first line of your address doctor?");
        String InputDoctorAddressSecondLine = JOptionPane.showInputDialog(null, "What about the second line doctor?");
        String InputDoctorPostcode = JOptionPane.showInputDialog(null, "What is your postcode doctor?");
        DoctorForename objDoctorForename =
                new DoctorForename(InputDoctorForename);
        DoctorSurname objDoctorSurname =
                new DoctorSurname(InputDoctorSurname);
        DoctorEmail objDoctorEmail =
                new DoctorEmail(InputDoctorEmail);
        DoctorUsername objDoctorUsername =
                new DoctorUsername(InputDoctorUsername);
       DoctorPassword objDoctorPassword =
                new DoctorPassword(InputDoctorPassword);
        DoctorCountry objDoctorCountry =
                new DoctorCountry(InputDoctorCountry);
        DoctorCity objDoctorCity =
                new DoctorCity(InputDoctorCity);
        DoctorAddressLine1 objDoctorAddressLine1 =
                new DoctorAddressLine1(InputDoctorAddressFirstLine);
        DoctorAddressLine2 objDoctorAddressLine2 =
                new DoctorAddressLine2(InputDoctorAddressSecondLine);
        DoctorPostcode objDoctorPostcode =
                new DoctorPostcode(InputDoctorPostcode);
        
        String strMessage = "The patients name is " + objDoctorForename.getDoctorForename() 
                + " " + objDoctorSurname.getPatientSurname()
                + ". The patients email is " + objDoctorEmail.getDoctorEmail()
                + " and their username is " + objDoctorUsername.getDoctorUsername()
                + ". Their password is " + objDoctorPassword.getDoctorPassword()
                + ". Finally, they live in " + objDoctorCountry.getDoctorCountry()
                + ", " + objDoctorCity.getDoctorCity()
                + ", " + objDoctorAddressLine1.getDoctorAddressLine1()      
                + ", " + objDoctorAddressLine2.getDoctorAddressLine2()   
                + ", " + objDoctorPostcode.getDoctorPostcode()   
                +".";    
        System.out.println(strMessage);
                
    }
    
}
