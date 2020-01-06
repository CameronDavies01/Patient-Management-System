/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system;

import patient.management.system.HospitalSystem.AdminAddressLine1;
import patient.management.system.HospitalSystem.AdminAddressLine2;
import patient.management.system.HospitalSystem.AdminCity;
import patient.management.system.HospitalSystem.AdminCountry;
import patient.management.system.HospitalSystem.AdminForename;
import patient.management.system.HospitalSystem.AdminSurname;
import patient.management.system.HospitalSystem.AdminEmail;
import patient.management.system.HospitalSystem.AdminUsername;
import patient.management.system.HospitalSystem.AdminPassword;
import patient.management.system.HospitalSystem.AdminPostcode;


import javax.swing.JOptionPane;



/**
 *
 * @author camer
 */
public class AdminSignUpTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String InputAdminForename = JOptionPane.showInputDialog(null, "What is your first name?");
        String InputAdminSurname = JOptionPane.showInputDialog(null, "What is your second name?");
        String InputAdminEmail = JOptionPane.showInputDialog(null, "What is your email");
        String InputAdminUsername = JOptionPane.showInputDialog(null, "What is your username?");
        String InputAdminPassword = JOptionPane.showInputDialog(null, "What is your password?");
        String InputAdminCountry = JOptionPane.showInputDialog(null, "What country are you from?");
        String InputAdminCity = JOptionPane.showInputDialog(null, "What city do you live in?");
        String InputAdminAddressFirstLine = JOptionPane.showInputDialog(null, "What is the first line of your address?");
        String InputAdminAddressSecondLine = JOptionPane.showInputDialog(null, "What about the second line?");
        String InputAdminPostcode = JOptionPane.showInputDialog(null, "What is your postcode?");
        AdminForename objAdminForename =
                new AdminForename(InputAdminForename);
        AdminSurname objAdminSurname =
                new AdminSurname(InputAdminSurname);
        AdminEmail objAdminEmail =
                new AdminEmail(InputAdminEmail);
        AdminUsername objAdminUsername =
                new AdminUsername(InputAdminUsername);
       AdminPassword objAdminPassword =
                new AdminPassword(InputAdminPassword);
      AdminCountry objAdminCountry =
                new AdminCountry(InputAdminCountry);
       AdminCity objAdminCity =
                new AdminCity(InputAdminCity);
        AdminAddressLine1 objAdminAddressLine1 =
                new AdminAddressLine1(InputAdminAddressFirstLine);
        AdminAddressLine2 objAdminAddressLine2 =
                new AdminAddressLine2(InputAdminAddressSecondLine);
        AdminPostcode objAdminPostcode =
                new AdminPostcode(InputAdminPostcode);
        
        String strMessage = "The patients name is " + objAdminForename.getAdminForename() 
                + " " + objAdminSurname.getAdminSurname()
                + ". The patients email is " + objAdminEmail.getAdminEmail()
                + " and their username is " + objAdminUsername.getAdminUsername()
                + ". Their password is " + objAdminPassword.getAdminPassword()
                + ". Finally, they live in " + objAdminCountry.getAdminCountry()
                + ", " + objAdminCity.getAdminCity()
                + ", " + objAdminAddressLine1.getAdminAddressLine1()      
                + ", " + objAdminAddressLine2.getAdminAddressLine2()   
                + ", " + objAdminPostcode.getAdminPostcode()   
                +".";    
        System.out.println(strMessage);
                
    }
    
}
