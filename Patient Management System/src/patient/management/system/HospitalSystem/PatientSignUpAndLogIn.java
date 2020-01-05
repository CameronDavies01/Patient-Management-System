/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system.HospitalSystem;

import javax.swing.JOptionPane;

/**
 *
 * @author camer
 */
public class PatientSignUpAndLogIn {
        public static void main(String[] args) {
        String InputPatientForename = JOptionPane.showInputDialog(null, "What is your first name?");
        String InputPatientSurname = JOptionPane.showInputDialog(null, "What is your second name?");
        String InputPatientEmail = JOptionPane.showInputDialog(null, "What is your email");
        String InputPatientUsername = JOptionPane.showInputDialog(null, "What is your username?");
        String InputPatientPassword = JOptionPane.showInputDialog(null, "What is your password?");
        String InputPatientCountry = JOptionPane.showInputDialog(null, "What country are you from?");
        String InputPatientCity = JOptionPane.showInputDialog(null, "What city do you live in?");
        String InputPatientAddressFirstLine = JOptionPane.showInputDialog(null, "What is the first line of your address?");
        String InputPatientAddressSecondLine = JOptionPane.showInputDialog(null, "What about the second line?");
        String InputPatientPostcode = JOptionPane.showInputDialog(null, "What is your postcode?");
        PatientForename objPatientForename =
                new PatientForename(InputPatientForename);
        PatientSurname objPatientSurname =
                new PatientSurname(InputPatientSurname);
        PatientEmail objPatientEmail =
                new PatientEmail(InputPatientEmail);
        PatientUsername objPatientUsername =
                new PatientUsername(InputPatientUsername);
        PatientPassword objPatientPassword =
                new PatientPassword(InputPatientPassword);
        PatientCountry objPatientCountry =
                new PatientCountry(InputPatientCountry);
        PatientCity objPatientCity =
                new PatientCity(InputPatientCity);
        PatientAddressLine1 objPatientAddressLine1 =
                new PatientAddressLine1(InputPatientAddressFirstLine);
        PatientAddressLine2 objPatientAddressLine2 =
                new PatientAddressLine2(InputPatientAddressSecondLine);
        PatientPostcode objPatientPostcode =
                new PatientPostcode(InputPatientPostcode);
        
        String strMessage = "The patients name is " + objPatientForename.getPatientForename() 
                + " " + objPatientSurname.getPatientSurname()
                + ". The patients email is " + objPatientEmail.getPatientEmail()
                + " and their username is " + objPatientUsername.getPatientUsername()
                + ". Their password is " + objPatientPassword.getPatientPassword()
                + ". Finally, they live in " + objPatientCountry.getPatientCountry()
                + ", " + objPatientCity.getPatientCity()
                + ", " + objPatientAddressLine1.getPatientAddressLine1()      
                + ", " + objPatientAddressLine2.getPatientAddressLine2()   
                + ", " + objPatientPostcode.getPatientPostcode()   
                +".";    
        System.out.println(strMessage);
                
    }
}
