/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.WorkList;

import NewLife.MedicalInformation.MedicalInformation;
import NewLife.Account.Account;
import NewLife.AmbulanceDriver.AmbulanceDriver;
import NewLife.Doctors.Doctor;
import NewLife.Government.Municipality;
import NewLife.Hospital.HospitalAdmin;
import NewLife.LabAssistant.LabAssistant;
import NewLife.Patient.Patient;
import NewLife.Pharmaceutical.Pharmaceutical;
import NewLife.Pharmacy.Pharmacy;
import NewLife.Porter.Porter;
import NewLife.Reception.Reception;
import NewLife.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author shivanidatar
 */
public abstract class WorkRequest extends UserAccount{
    private String message;
    private String zoomLink;
    private String testType;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    private Patient patient;
    private Pharmacy pharmacy;
    private Porter deliverMan;
    private Reception reception;
    private Doctor doctor;
    private Municipality government;
    private HospitalAdmin hospitalAdmin;
    private LabAssistant labAssistant;
    private AmbulanceDriver ambulanceDriver;
    private Account account;
    private Pharmaceutical pharmaceutical;
    private MedicalInformation medInfo;
    private String status;
    private String bill;
    private Date requestDate;
    private Date resolveDate;
  
    
    public WorkRequest(){
        requestDate = new Date();
    }
    
     public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Municipality getGovernment() {
        return government;
    }

    public void setGovernment(Municipality government) {
        this.government = government;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    public void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
    
    
    

    public MedicalInformation getMedInfo() {
        return medInfo;
    }

    public void setMedInfo(MedicalInformation medInfo) {
        this.medInfo = medInfo;
    }    
       
    public HospitalAdmin getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(HospitalAdmin hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public LabAssistant getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistant labAssistant) {
        this.labAssistant = labAssistant;
    }

    public AmbulanceDriver getAmbulanceDriver() {
        return ambulanceDriver;
    }

    public void setAmbulanceDriver(AmbulanceDriver ambulanceDriver) {
        this.ambulanceDriver = ambulanceDriver;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient customer) {
        this.patient = customer;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Porter getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(Porter deliverMan) {
        this.deliverMan = deliverMan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pharmaceutical getPharmaceutical() {
        return pharmaceutical;
    }

    public void setPharmaceutical(Pharmaceutical pharmaceutical) {
        this.pharmaceutical = pharmaceutical;
    }
    
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return this.message;
    }
}
