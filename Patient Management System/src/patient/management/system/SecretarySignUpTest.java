/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system;

import patient.management.system.HospitalSystem.SecretaryAddressLine1;
import patient.management.system.HospitalSystem.SecretaryAddressLine2;
import patient.management.system.HospitalSystem.SecretaryCity;
import patient.management.system.HospitalSystem.SecretaryCountry;
import patient.management.system.HospitalSystem.SecretaryForename;
import patient.management.system.HospitalSystem.SecretarySurname;
import patient.management.system.HospitalSystem.SecretaryEmail;
import patient.management.system.HospitalSystem.SecretaryUsername;
import patient.management.system.HospitalSystem.SecretaryPassword;
import patient.management.system.HospitalSystem.SecretaryPostcode;


import javax.swing.JOptionPane;



/**
 *
 * @author camer
 */
public class SecretarySignUpTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String InputSecretaryForename = JOptionPane.showInputDialog(null, "What is your first name?");
        String InputSecretarySurname = JOptionPane.showInputDialog(null, "What is your second name?");
        String InputSecretaryEmail = JOptionPane.showInputDialog(null, "What is your email");
        String InputSecretaryUsername = JOptionPane.showInputDialog(null, "What is your username?");
        String InputSecretaryPassword = JOptionPane.showInputDialog(null, "What is your password?");
        String InputSecretaryCountry = JOptionPane.showInputDialog(null, "What country are you from?");
        String InputSecretaryCity = JOptionPane.showInputDialog(null, "What city do you live in?");
        String InputSecretaryAddressFirstLine = JOptionPane.showInputDialog(null, "What is the first line of your address?");
        String InputSecretaryAddressSecondLine = JOptionPane.showInputDialog(null, "What about the second line?");
        String InputSecretaryPostcode = JOptionPane.showInputDialog(null, "What is your postcode?");
       SecretaryForename objSecretaryForename =
                new SecretaryForename(InputSecretaryForename);
        SecretarySurname objSecretarySurname =
                new SecretarySurname(InputSecretarySurname);
        SecretaryEmail objSecretaryEmail =
                new SecretaryEmail(InputSecretaryEmail);
        SecretaryUsername objSecretaryUsername =
                new SecretaryUsername(InputSecretaryUsername);
        SecretaryPassword objSecretaryPassword =
                new SecretaryPassword(InputSecretaryPassword);
        SecretaryCountry objSecretaryCountry =
                new SecretaryCountry(InputSecretaryCountry);
        SecretaryCity objSecretaryCity =
                new SecretaryCity(InputSecretaryCity);
        SecretaryAddressLine1 objSecretaryAddressLine1 =
                new SecretaryAddressLine1(InputSecretaryAddressFirstLine);
        SecretaryAddressLine2 objSecretaryAddressLine2 =
                new SecretaryAddressLine2(InputSecretaryAddressSecondLine);
        SecretaryPostcode objSecretaryPostcode  =
                new SecretaryPostcode(InputSecretaryPostcode);
        
        String strMessage = "The patients name is " + objSecretaryForename.getSecretaryForename() 
                + " " + objSecretarySurname.getSecretarySurname()
                + ". The patients email is " + objSecretaryEmail.getSecretaryEmail()
                + " and their username is " + objSecretaryUsername.getSecretaryUsername()
                + ". Their password is " + objSecretaryPassword.getSecretaryPassword()
                + ". Finally, they live in " + objSecretaryCountry.getSecretaryCountry()
                + ", " + objSecretaryCity.getSecretaryCity()
                + ", " + objSecretaryAddressLine1.getSecretaryAddressLine1()      
                + ", " + objSecretaryAddressLine2.getSecretaryAddressLine2()   
                + ", " + objSecretaryPostcode.getSecretaryPostcode()   
                +".";    
        System.out.println(strMessage);
                
    }
    
}
