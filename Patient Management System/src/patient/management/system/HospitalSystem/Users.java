/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system.HospitalSystem;

/**
 *
 * @author camer
 */
public class Users {
    protected int PatientID = 0000;
    protected  String PatientForename = "UNKNOWN";
    protected  String PatientSurname = "UNKNOWN";
    protected  String PatientUsername = "UNKNOWN";
    protected  String PatientPassword = "UNKNOWN";
    protected  String PatientEmail = "UNKNOWN";  
    protected  String PatientCountry = "UNKNOWN";
    protected  String PatientCity = "UNKNOWN";
    protected  String PatientAddressLine1 = "UNKNOWN";
    protected  String PatientAddressLine2 = "UNKNOWN";
    protected  String PatientPostcode = "UNKNOWN";
    
    protected  int SecretaryID = 0000;
    protected  String SecretaryForename = "UNKNOWN";
    protected  String SecretarySurname = "UNKNOWN";
    protected  String SecretaryUsername = "UNKNOWN";
    protected  String SecretaryPassword = "UNKNOWN";
    protected  String SecretaryEmail = "UNKNOWN";
    protected  String SecretaryCountry = "UNKNOWN";
    protected  String SecretaryCity = "UNKNOWN";
    protected  String SecretaryAddressLine1 = "UNKNOWN";
    protected  String SecretaryAddressLine2 = "UNKNOWN";
    protected  String SecretaryPostcode = "UNKNOWN";
    
    protected  int DoctorID = 0000;
    protected  String DoctorForename = "UNKNOWN";
    protected  String DoctorSurname = "UNKNOWN";
    protected  String DoctorUsername = "UNKNOWN";
    protected  String DoctorPassword = "UNKNOWN";
    protected  String DoctorEmail = "UNKNOWN";
    protected  String DoctorCountry = "UNKNOWN";
    protected  String DoctorCity = "UNKNOWN";
    protected  String DoctorAddressLine1 = "UNKNOWN";
    protected  String DoctorAddressLine2 = "UNKNOWN";
    protected  String DoctorPostcode = "UNKNOWN";
    
    protected  int AdminID = 0000;
    protected  String AdminForename = "UNKNOWN";
    protected  String AdminSurname = "UNKNOWN";
    protected  String AdminUsername = "UNKNOWN";
    protected  String AdminPassword = "UNKNOWN";
    protected  String AdminEmail = "UNKNOWN";
    protected  String AdminCountry = "UNKNOWN";
    protected  String AdminCity = "UNKNOWN";
    protected  String AdminAddressLine1 = "UNKNOWN";
    protected  String AdminAddressLine2 = "UNKNOWN";
    protected  String AdminPostcode = "UNKNOWN";

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getPatientForename() {
        return PatientForename;
    }
    

    public void setPatientForename(String PatientForename) {

        if(PatientForename != null && !PatientForename.isEmpty())
        {
        this.PatientForename = PatientForename;
    }
    }

    public String getPatientSurname() {
        return PatientSurname;
    }

    public void setPatientSurname(String PatientSurname) {
        if(PatientSurname != null && !PatientSurname.isEmpty())
        {
        this.PatientSurname = PatientSurname;
        }
    }

    public String getPatientUsername() {
        return PatientUsername;
    }

    public void setPatientUsername(String PatientUsername) {
        if(PatientUsername != null && !PatientUsername.isEmpty())
        {
        this.PatientUsername = PatientUsername;
    }
    }

    public String getPatientPassword() {
        return PatientPassword;
    }

    public void setPatientPassword(String PatientPassword) {
        if(PatientPassword != null && !PatientPassword.isEmpty())
        {
        this.PatientPassword = PatientPassword;
    }
    }

    public String getPatientEmail() {
        return PatientEmail;
    }

    public void setPatientEmail(String PatientEmail) {
        if(PatientEmail != null && !PatientEmail.isEmpty())
        {
        this.PatientEmail = PatientEmail;
    }
    }

    public String getPatientCountry() {
        return PatientCountry;
    }

    public void setPatientCountry(String PatientCountry) {
        if(PatientCountry != null && !PatientCountry.isEmpty())
        {
        this.PatientCountry = PatientCountry;
    }
    }

    public String getPatientCity() {
        return PatientCity;
    }

    public void setPatientCity(String PatientCity) {
    if(PatientCity != null && !PatientCity.isEmpty())
    {
        this.PatientCity = PatientCity;
    }
    } 

    public String getPatientAddressLine1() {
        return PatientAddressLine1;
    }

    public void setPatientAddressLine1(String PatientAddressLine1) {
    if(PatientAddressLine1 != null && !PatientAddressLine1.isEmpty())
    {
        this.PatientAddressLine1 = PatientAddressLine1;
    }
    }
    
    public String getPatientAddressLine2() {
        return PatientAddressLine2;
    }

    public void setPatientAddressLine2(String PatientAddressLine2) {
    if(PatientAddressLine2 != null && !PatientAddressLine2.isEmpty())
    {
        this.PatientAddressLine2 = PatientAddressLine2;
    }
    }

    public String getPatientPostcode() {
        return PatientPostcode;
    }

    public void setPatientPostcode(String PatientPostcode) {
    if(PatientPostcode != null && !PatientPostcode.isEmpty())
    {
        this.PatientPostcode = PatientPostcode;
    }
    }
    
    
    
    public int getSecretaryID() {
        return SecretaryID;
    }

    public void setSecretaryID(int SecretaryID) {
        this.SecretaryID = SecretaryID;
    }

    public String getSecretaryForename() {
        return SecretaryForename;
    }

    public void setSecretaryForename(String SecretaryForename) {
        if(SecretaryForename != null && !SecretaryForename.isEmpty())
        {
        this.SecretaryForename = SecretaryForename;
    }
    }

    public String getSecretarySurname() {
        return SecretarySurname;
    }

    public void setSecretarySurname(String SecretarySurname) {
        if(SecretarySurname != null && !SecretarySurname.isEmpty())
        {
        this.SecretarySurname = SecretarySurname;
    }
    }

    public String getSecretaryUsername() {
        return SecretaryUsername;
    }

    public void setSecretaryUsername(String SecretaryUsername) {
        if(SecretaryUsername != null && !SecretaryUsername.isEmpty())
        {
        this.SecretaryUsername = SecretaryUsername;
    }
    }

    public String getSecretaryPassword() {
        return SecretaryPassword;
    }

    public void setSecretaryPassword(String SecretaryPassword) {
        if(SecretaryPassword != null && !SecretaryPassword.isEmpty())
        {
        this.SecretaryPassword = SecretaryPassword;
    }
    }

    public String getSecretaryEmail() {
        return SecretaryEmail;
    }

    public void setSecretaryEmail(String SecretaryEmail) {
        if(SecretaryEmail != null && !SecretaryEmail.isEmpty())
        {
        this.SecretaryEmail = SecretaryEmail;
    }
    }

    public String getSecretaryCountry() {
        return SecretaryCountry;
    }

    public void setSecretaryCountry(String SecretaryCountry) {
        if(SecretaryCountry != null && !SecretaryCountry.isEmpty())
        {
        this.SecretaryCountry = SecretaryCountry;
    }
    }

    public String getSecretaryCity() {
        return SecretaryCity;
    }

    public void setSecretaryCity(String SecretaryCity) {
        if(SecretaryCity != null && !SecretaryCity.isEmpty())
        {
        this.SecretaryCity = SecretaryCity;
    }
    }

    public String getSecretaryAddressLine1() {
        return SecretaryAddressLine1;
    }

    public void setSecretaryAddressLine1(String SecretaryAddressLine1) {
        if(SecretaryAddressLine1 != null && !SecretaryAddressLine1.isEmpty())
        {
        this.SecretaryAddressLine1 = SecretaryAddressLine1;
    }
    }

    public String getSecretaryAddressLine2() {
        return SecretaryAddressLine2;
    }

    public void setSecretaryAddressLine2(String SecretaryAddressLine2) {
        if(SecretaryAddressLine2 != null && !SecretaryAddressLine2.isEmpty())
        {
        this.SecretaryAddressLine2 = SecretaryAddressLine2;
    }
    }

    public String getSecretaryPostcode() {
        return SecretaryPostcode;
    }

    public void setSecretaryPostcode(String SecretaryPostcode) {
        if(SecretaryPostcode != null && !SecretaryPostcode.isEmpty())
        {
        this.SecretaryPostcode = SecretaryPostcode;
    }
    }
    
    

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getDoctorForename() {
        return DoctorForename;
    }

    public void setDoctorForename(String DoctorForename) {
        if(DoctorForename != null && !DoctorForename.isEmpty())
        {
        this.DoctorForename = DoctorForename;
    }
    }

    public String getDoctorSurname() {
        return DoctorSurname;
    }

    public void setDoctorSurname(String DoctorSurname) {
        if(DoctorSurname != null && !DoctorSurname.isEmpty())
        {
        this.DoctorSurname = DoctorSurname;
    }
    }

    public String getDoctorUsername() {
        return DoctorUsername;
    }

    public void setDoctorUsername(String DoctorUsername) {
        if(DoctorUsername != null && !DoctorUsername.isEmpty())
        {
        this.DoctorUsername = DoctorUsername;
    }
    }

    public String getDoctorPassword() {
        return DoctorPassword;
    }

    public void setDoctorPassword(String DoctorPassword) {
        if(DoctorPassword != null && !DoctorPassword.isEmpty())
        {
        this.DoctorPassword = DoctorPassword;
    }
    }

    public String getDoctorEmail() {
        return DoctorEmail;
    }

    public void setDoctorEmail(String DoctorEmail) {
        if(DoctorEmail != null && !DoctorEmail.isEmpty())
        {
        this.DoctorEmail = DoctorEmail;
    }
    }

    public String getDoctorCountry() {
        return DoctorCountry;
    }

    public void setDoctorCountry(String DoctorCountry) {
        if(DoctorCountry != null && !DoctorCountry.isEmpty())
        {
        this.DoctorCountry = DoctorCountry;
    }
    }

    public String getDoctorCity() {
        return DoctorCity;
    }

    public void setDoctorCity(String DoctorCity) {
        if(DoctorCity != null && !DoctorCity.isEmpty())
        {
        this.DoctorCity = DoctorCity;
    }
    }

    public String getDoctorAddressLine1() {
        return DoctorAddressLine1;
    }

    public void setDoctorAddressLine1(String DoctorAddressLine1) {
        if(DoctorAddressLine1 != null && !DoctorAddressLine1.isEmpty())
        {
        this.DoctorAddressLine1 = DoctorAddressLine1;
    }
    }

    public String getDoctorAddressLine2() {
        return DoctorAddressLine2;
    }

    public void setDoctorAddressLine2(String DoctorAddressLine2) {
        if(DoctorAddressLine2 != null && !DoctorAddressLine2.isEmpty())
        {
        this.DoctorAddressLine2 = DoctorAddressLine2;
    }
    }

    public String getDoctorPostcode() {
        return DoctorPostcode;
    }

    public void setDoctorPostcode(String DoctorPostcode) {
    if(DoctorPostcode != null && !DoctorPostcode.isEmpty())
        {
        this.DoctorPostcode = DoctorPostcode;
    }
    }
    
    

    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int AdminID) {
        this.AdminID = AdminID;
    }

    public String getAdminForename() {
        return AdminForename;
    }

    public void setAdminForename(String AdminForename) {
        if(AdminForename != null && !AdminForename.isEmpty())
        {
        this.AdminForename = AdminForename;
    }
    }

    public String getAdminSurname() {
        return AdminSurname;
    }

    public void setAdminSurname(String AdminSurname) {
        if(AdminSurname != null && !AdminSurname.isEmpty())
        {
        this.AdminSurname = AdminSurname;
    }
    }

    public String getAdminUsername() {
        return AdminUsername;
    }

    public void setAdminUsername(String AdminUsername) {
        if(AdminUsername != null && !AdminUsername.isEmpty())
        {
        this.AdminUsername = AdminUsername;
    }
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String AdminPassword) {
        if(AdminPassword != null && !AdminPassword.isEmpty())
        {
        this.AdminPassword = AdminPassword;
    }
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String AdminEmail) {
        if(AdminEmail != null && !AdminEmail.isEmpty())
        {
        this.AdminEmail = AdminEmail;
    }
    }  

    public String getAdminCountry() {
        return AdminCountry;
    }

    public void setAdminCountry(String AdminCountry) {
        if(AdminCountry != null && !AdminCountry.isEmpty())
        {
        this.AdminCountry = AdminCountry;
    }
    }

    public String getAdminCity() {
        return AdminCity;
    }

    public void setAdminCity(String AdminCity) {
        if(AdminCity != null && !AdminCity.isEmpty())
        {
        this.AdminCity = AdminCity;
    }
    }

    public String getAdminAddressLine1() {
        return AdminAddressLine1;
    }

    public void setAdminAddressLine1(String AdminAddressLine1) {
        if(AdminAddressLine1 != null && !AdminAddressLine1.isEmpty())
        {
        this.AdminAddressLine1 = AdminAddressLine1;
    }
    }

    public String getAdminAddressLine2() {
        return AdminAddressLine2;
    }

    public void setAdminAddressLine2(String AdminAddressLine2) {
        if(AdminAddressLine2 != null && !AdminAddressLine2.isEmpty())
        {
        this.AdminAddressLine2 = AdminAddressLine2;
    }
    }

    public String getAdminPostcode() {
        return AdminPostcode;
    }

    public void setAdminPostcode(String AdminPostcode) {
        if(AdminPostcode != null && !AdminPostcode.isEmpty())
        {
        this.AdminPostcode = AdminPostcode;
    }
    }
    
    
}
