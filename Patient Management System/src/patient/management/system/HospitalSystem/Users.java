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
    
    protected  int SecretaryID = 0000;
    protected  String SecretaryForename = "UNKNOWN";
    protected  String SecretarySurname = "UNKNOWN";
    protected  String SecretaryUsername = "UNKNOWN";
    protected  String SecretaryPassword = "UNKNOWN";
    protected  String SecretaryEmail = "UNKNOWN";
    
    protected  int DoctorID = 0000;
    protected  String DoctorForename = "UNKNOWN";
    protected  String DoctorSurname = "UNKNOWN";
    protected  String DoctorUsername = "UNKNOWN";
    protected  String DoctorPassword = "UNKNOWN";
    protected  String DoctorEmail = "UNKNOWN";
    
    protected  int AdminID = 0000;
    protected  String AdminForename = "UNKNOWN";
    protected  String AdminSurname = "UNKNOWN";
    protected  String AdminUsername = "UNKNOWN";
    protected  String AdminPassword = "UNKNOWN";
    protected  String AdminEmail = "UNKNOWN";

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
}
