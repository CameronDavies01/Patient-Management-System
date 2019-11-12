/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system.data;

/**
 *
 * @author camer
 */
public class Database {
    private int PatientID = 0000;
    private String PatientForename = "UNKNOWN";
    private String PatientSurname = "UNKNOWN";
    private String PatientPassword = "UNKNOWN";
    private boolean PatientAccountApproval = false; 
    private byte DoctorRating = 0;
    private String PatientDoctorFeedback = "UNKNOWN"; 
    private String AppointmentDate = "00/00/0000";
    private String AppointmentTime = "00/00";
    private String AppointmentNote = "UNKNOWN";
    private String AppointmentDetails = "UNKNOWN";
    private String PrescriptionDetails = "UNKNOWN";
    private boolean PatientAccountTerminationRequestSent = false;
    
    private int AdminID = 0000;
    private String AdminForename = "UNKNOWN";
    private String AdminSurname = "UNKNOWN";
    private String AdminPassword = "UNKNOWN";
    private String AdminDoctorFeedback = "UNKNOWN";
    
    private int SecretaryID = 0000;
    private String SecretaryForename = "UNKNOWN";
    private String SecretarySurname = "UNKNOWN";
    private String SecretaryPassword = "UNKNOWN";
    
    private int DoctorID = 0000;
    private String DoctorForename = "UNKNOWN";
    private String DoctorSurname = "UNKNOWN";
    private String DoctorPassword = "UNKNOWN";
    private byte OverallDoctorRating = 0;
    private String DoctorNote = "UNKNOWN";
    private String ProposedAppointmentDate = "00/00/0000";
    private String ProposedAppointmentTime = "00/00";
    private String ProposedAppointmentNote = "UNKNOWN";
    private String ProposedAppointmentDetails = "UNKNOWN";
    
    private int MedicineID = 0000;
    private String MedicineName = "UNKNOWN";
    private byte MedicineInStock = 0;
    private boolean IsMedicineInStock = false;
    private boolean IsMedicineNeeded = false;
    private boolean IsMedicineOrdered = false;

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
        this.PatientForename = PatientForename;
    }

    public String getPatientSurname() {
        return PatientSurname;
    }

    public void setPatientSurname(String PatientSurname) {
        this.PatientSurname = PatientSurname;
    }

    public String getPatientPassword() {
        return PatientPassword;
    }

    public void setPatientPassword(String PatientPassword) {
        this.PatientPassword = PatientPassword;
    }

    public boolean isPatientAccountApproval() {
        return PatientAccountApproval;
    }

    public void setPatientAccountApproval(boolean PatientAccountApproval) {
        this.PatientAccountApproval = PatientAccountApproval;
    }

    public byte getDoctorRating() {
        return DoctorRating;
    }

    public void setDoctorRating(byte DoctorRating) {
        this.DoctorRating = DoctorRating;
    }

    public String getPatientDoctorFeedback() {
        return PatientDoctorFeedback;
    }

    public void setPatientDoctorFeedback(String PatientDoctorFeedback) {
        this.PatientDoctorFeedback = PatientDoctorFeedback;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(String AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

    public String getAppointmentTime() {
        return AppointmentTime;
    }

    public void setAppointmentTime(String AppointmentTime) {
        this.AppointmentTime = AppointmentTime;
    }

    public String getAppointmentNote() {
        return AppointmentNote;
    }

    public void setAppointmentNote(String AppointmentNote) {
        this.AppointmentNote = AppointmentNote;
    }

    public String getAppointmentDetails() {
        return AppointmentDetails;
    }

    public void setAppointmentDetails(String AppointmentDetails) {
        this.AppointmentDetails = AppointmentDetails;
    }

    public String getPrescriptionDetails() {
        return PrescriptionDetails;
    }

    public void setPrescriptionDetails(String PrescriptionDetails) {
        this.PrescriptionDetails = PrescriptionDetails;
    }

    public boolean isPatientAccountTerminationRequestSent() {
        return PatientAccountTerminationRequestSent;
    }

    public void setPatientAccountTerminationRequestSent(boolean PatientAccountTerminationRequestSent) {
        this.PatientAccountTerminationRequestSent = PatientAccountTerminationRequestSent;
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
        this.AdminForename = AdminForename;
    }

    public String getAdminSurname() {
        return AdminSurname;
    }

    public void setAdminSurname(String AdminSurname) {
        this.AdminSurname = AdminSurname;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    public String getAdminDoctorFeedback() {
        return AdminDoctorFeedback;
    }

    public void setAdminDoctorFeedback(String AdminDoctorFeedback) {
        this.AdminDoctorFeedback = AdminDoctorFeedback;
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
        this.SecretaryForename = SecretaryForename;
    }

    public String getSecretarySurname() {
        return SecretarySurname;
    }

    public void setSecretarySurname(String SecretarySurname) {
        this.SecretarySurname = SecretarySurname;
    }

    public String getSecretaryPassword() {
        return SecretaryPassword;
    }

    public void setSecretaryPassword(String SecretaryPassword) {
        this.SecretaryPassword = SecretaryPassword;
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
        this.DoctorForename = DoctorForename;
    }

    public String getDoctorSurname() {
        return DoctorSurname;
    }

    public void setDoctorSurname(String DoctorSurname) {
        this.DoctorSurname = DoctorSurname;
    }

    public String getDoctorPassword() {
        return DoctorPassword;
    }

    public void setDoctorPassword(String DoctorPassword) {
        this.DoctorPassword = DoctorPassword;
    }

    public byte getOverallDoctorRating() {
        return OverallDoctorRating;
    }

    public void setOverallDoctorRating(byte OverallDoctorRating) {
        this.OverallDoctorRating = OverallDoctorRating;
    }

    public String getDoctorNote() {
        return DoctorNote;
    }

    public void setDoctorNote(String DoctorNote) {
        this.DoctorNote = DoctorNote;
    }

    public String getProposedAppointmentDate() {
        return ProposedAppointmentDate;
    }

    public void setProposedAppointmentDate(String ProposedAppointmentDate) {
        this.ProposedAppointmentDate = ProposedAppointmentDate;
    }

    public String getProposedAppointmentTime() {
        return ProposedAppointmentTime;
    }

    public void setProposedAppointmentTime(String ProposedAppointmentTime) {
        this.ProposedAppointmentTime = ProposedAppointmentTime;
    }

    public String getProposedAppointmentNote() {
        return ProposedAppointmentNote;
    }

    public void setProposedAppointmentNote(String ProposedAppointmentNote) {
        this.ProposedAppointmentNote = ProposedAppointmentNote;
    }

    public String getProposedAppointmentDetails() {
        return ProposedAppointmentDetails;
    }

    public void setProposedAppointmentDetails(String ProposedAppointmentDetails) {
        this.ProposedAppointmentDetails = ProposedAppointmentDetails;
    }

    public int getMedicineID() {
        return MedicineID;
    }

    public void setMedicineID(int MedicineID) {
        this.MedicineID = MedicineID;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public byte getMedicineInStock() {
        return MedicineInStock;
    }

    public void setMedicineInStock(byte MedicineInStock) {
        this.MedicineInStock = MedicineInStock;
    }

    public boolean isIsMedicineInStock() {
        return IsMedicineInStock;
    }

    public void setIsMedicineInStock(boolean IsMedicineInStock) {
        this.IsMedicineInStock = IsMedicineInStock;
    }

    public boolean isIsMedicineNeeded() {
        return IsMedicineNeeded;
    }

    public void setIsMedicineNeeded(boolean IsMedicineNeeded) {
        this.IsMedicineNeeded = IsMedicineNeeded;
    }

    public boolean isIsMedicineOrdered() {
        return IsMedicineOrdered;
    }

    public void setIsMedicineOrdered(boolean IsMedicineOrdered) {
        this.IsMedicineOrdered = IsMedicineOrdered;
    }
    
    
    

    
    
    
    
      
    
 
    
}
