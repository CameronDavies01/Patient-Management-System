/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system;

import patient.management.system.HospitalSystem.PatientForename;
import patient.management.system.HospitalSystem.PatientSurname;
import patient.management.system.HospitalSystem.PatientEmail;
import patient.management.system.HospitalSystem.PatientUsername;
import patient.management.system.HospitalSystem.PatientPassword;



/**
 *
 * @author camer
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatientForename objPatientForename =
                new PatientForename("Cameron");
        PatientSurname objPatientSurname =
                new PatientSurname("Davies");
        PatientEmail objPatientEmail =
                new PatientEmail("cameronrhysdavies1998@gmail.com");
        PatientUsername objPatientUsername =
                new PatientUsername("CammyD");
        PatientPassword objPatientPassword =
                new PatientPassword("Password01");
        
        String strMessage = "The patients name is " + objPatientForename.getPatientForename() 
                + " " + objPatientSurname.getPatientSurname()
                + ". The patients email is " + objPatientEmail.getPatientEmail()
                + " and their username is " + objPatientUsername.getPatientUsername()
                + ". Finally their password is " + objPatientPassword.getPatientPassword();
                System.out.println(strMessage);
                
    }
    
}
