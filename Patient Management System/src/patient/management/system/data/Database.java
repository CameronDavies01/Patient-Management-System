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
    

    
    
    
    
      
    
 
    
}
