/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newlifecenter;

import Doctors.Doctor;
import Doctors.DoctorDirectory;
import Donors.Donor;
import Donors.DonorDirectory;
import Encounters.EncounterHistory;
import Medicines.Medicine;
import Medicines.MedicineDirectory;
import Patient.Patient;
import Patient.PatientDirectory;
import Patient.PersonDirectory;

/**
 *
 * @author shivaniguglani
 */
public class NewLifeCenter {

    PatientDirectory patDir;
    PersonDirectory perDir;
    DoctorDirectory docDir;
    EncounterHistory encountHist;
    DonorDirectory donorDir;
    MedicineDirectory medDir;

    public NewLifeCenter(PatientDirectory patDir, PersonDirectory perDir, DoctorDirectory docDir, EncounterHistory encountHist) {
        this.patDir = patDir;
        this.perDir = perDir;
        this.docDir = docDir;
        this.encountHist = encountHist;
        this.donorDir = donorDir;
        this.medDir = medDir;
    }

    public MedicineDirectory getMedDir() {
        return medDir;
    }

    public void setMedDir(MedicineDirectory medDir) {
        this.medDir = medDir;
    }

    public DonorDirectory getDonorDir() {
        return donorDir;
    }

    public void setDonorDir(DonorDirectory donorDir) {
        this.donorDir = donorDir;
    }

    public PatientDirectory getPatDir() {
        return patDir;
    }

    public void setPatDir(PatientDirectory patDir) {
        this.patDir = patDir;
    }

    public PersonDirectory getPerDir() {
        return perDir;
    }

    public void setPerDir(PersonDirectory perDir) {
        this.perDir = perDir;
    }

    public DoctorDirectory getDocDir() {
        return docDir;
    }

    public void setDocDir(DoctorDirectory docDir) {
        this.docDir = docDir;
    }

    public EncounterHistory getEncountHist() {
        return encountHist;
    }

    public void setEncountHist(EncounterHistory encountHist) {
        this.encountHist = encountHist;
    }
    
    
    private void populateDefaultValues(){
           //doctors             
//    public Doctor(String firstName, String lastName, String buildingName, String unitNumber, String city, 
//            String state, int zipCode, String email, String password, int ssn, int age, 
//            int doctorID, String doctorName, String speciality)

        this.docDir.addDoctor(new Doctor("Joseph" , "Tribbiani" , "Elevate" , "209" , "Cambridge" 
                ,"MA" , 02141 , "j.tribbiaini@newcare.org" , "1234" 
                , 123456780 , 55 , 10001 ,  "Dr Joseph", "GynaecologyAndObstetrics"));
        this.docDir.addDoctor(new Doctor("Richard" , "Bannet" , "Promot" , "1092" , "Boston" 
                ,"MA" , 02142 , "r.bannet@newcare.org" , "1234" 
                , 123456781 , 39 , 10002 ,  "Dr Richard", "GeneralPhysician"));
        this.docDir.addDoctor(new Doctor("Pheobe" , "Zhilov" , "Munel" , "002" , "Boston" 
                ,"MA" , 03242 , "p.zhilov@newcare.org" , "1234" 
                , 123456782 , 36 , 10003 ,  "Dr Phoebe", "Urology"));
        this.docDir.addDoctor(new Doctor("Janice" , "Chad" , "Lotus Ave" , "707" , "Boston" 
                , "MA" , 03241 , "j.chad@newcare.org" , "1234" 
                , 123456783 , 57 , 10004 ,  "Dr Janice", "Embrylogy"));
        this.docDir.addDoctor(new Doctor("Gunther" , "Quid" , "Plum Ave" , "1009" , "Boston" 
                , "MA" , 03240 , "j.chad@newcare.org" , "1234" 
                , 123456784 , 28 , 10005 ,  "Dr Gunther", "Neonatologist"));
        
        
        //medicines
        //    public Medicine(String medicineName, String medManufacturer, 
        //int medPower, int quantity, String medicineType, int medicineCost)

        this.medDir.addMedicine(new Medicine("Centrum" , "Pfizer" , 100 , 20 , "MultiVitamins" , 12));
        this.medDir.addMedicine(new Medicine("Ovidryl" , "GSK" , 20 , 1 , "Injection" , 60));
        this.medDir.addMedicine(new Medicine("Provera" , "Pfizer" , 40 , 1 , "Injection" , 45));
        this.medDir.addMedicine(new Medicine("OvaBoost" , "CVS" , 20 , 100 , "Tablet" , 33));
        this.medDir.addMedicine(new Medicine("OviCare" , "CVS" , 50 , 60 , "Tablet" , 47));
        this.medDir.addMedicine(new Medicine("ProMetrium" , "GSK" , 5000 , 60 , "Hormones" , 35));
        this.medDir.addMedicine(new Medicine("Similac" , "Similac" , 1000 , 1 , "NewBornFormula" , 47));
        this.medDir.addMedicine(new Medicine("NatalNourish" , "GSK" , 10 , 100 , "LactationAids" , 20));
        this.medDir.addMedicine(new Medicine("Adaptogen" , "CVS" , 770 , 180 , "AntiDepressants" , 102));
        this.medDir.addMedicine(new Medicine("Always Sanitary Napkins" , "Pfizer" , 00 , 28 , "SanitartMaterials" , 10));
        
        
        //donors
        //    public Donor(int donorID, String eggType, float height, float weight, String eyeColor, 
        //int IQ, String occupation, String familyDiseaseHistory, 
        //String firstName, String lastName, String buildingName, String unitNumber, String city, String state, int zipCode, String email, String password, int ssn, int age) {
        
        this.donorDir.addDonor(new Donor(001 , "Sperm" , 177 , 140 , "Blue" , 150 
                            , "EntertainmentAndMedia" , "Diabetes" , "Kian" , "Willis" 
                , "ABCD" , "102" , "Boston" , "MA" , 02141 
                , "Williskian.gmail.com" , "1234" , 102987231, 20));
        this.donorDir.addDonor(new Donor(002 , "Ovum" , 109 , 100 , "Brown" , 100 
                            , "Finance" , "Alzhiemers" , "Jayce" , "Hoffman" 
                , "ABCD" , "102" , "Boston" , "MA" , 02141 
                , "jaycehoffman.gmail.com" , "1234" , 102987232, 24));
        this.donorDir.addDonor(new Donor(003 , "Ovum" , 127 , 130 , "Grey" , 120 
                            , "Healthcare" , "None" , "Angeline" , "Waters" 
                , "ABCD" , "102" , "Boston" , "MA" , 02141 
                , "watersa.gmail.com" , "1234" , 102987233, 22));
        this.donorDir.addDonor(new Donor(004 , "Sperm" , 187 , 230 , "Brown" , 100 
                            , "Construction" , "None" , "Cameron" , "Mitchell" 
                , "ABCD" , "102" , "Boston" , "MA" , 02141 
                , "c.mitchell.gmail.com" , "1234" , 102987234, 28));
        
        //patients
        //public Patient(String firstName, String lastName, String buildingName, String unitNumber, String city, 
         //   String state, int zipCode, String email, String password, int ssn, int age, int patientID , string gender)
         
         this.patDir.addPatient(new Patient("Kaeden" , "Evans" , "333 WASHINGTON ST" , "201" , "Boston" , "MA" 
          , 02101 , "kaeden.evans@gmail.com" , 980765000 , 40 , "Male", 00001 ));
         this.patDir.addPatient(new Patient("Sam" , "Kelly" , "212 COMMERCIAL ST" , "301" , "Boston" , "MA" 
          , 02102 , "samkelly@gmail.com", 980765001 , 35 ,  "Male", 00002 ));
         this.patDir.addPatient(new Patient("Neil" , "Key" , "200 SAINT BOTOLPH ST" , "201" , "Boston" , "MA" 
          , 02103 , "neilkey20@gmail.com" , 980765002 , 50 , "Male" , 00003 ));
         this.patDir.addPatient(new Patient("Killian" , "Thornton" , "21 LYNN ST" , "401" , "Boston" , "MA" 
          , 02113 , "killiant@gmail.com"  , 980765003 , 25 , "Male" ,00004));
         this.patDir.addPatient(new Patient("Kayla" , "Read" , "1 CHESTNUT ST" , "501" , "Boston" , "MA" 
          , 02101 , "kalylar@gmail.com" , 980765004 , 50 ,  "Female" , 00005));
         this.patDir.addPatient(new Patient("Madelynn" , "Adkins" , "212 COMMERCIAL ST" , "301" , "Boston" , "MA" 
          , 02102 , "madkins@gmail.com"  , 980765005 , 29 ,  "Female" , 00006));
         this.patDir.addPatient(new Patient("Ariel" , "Sparks" , "37 LAWRENCE ST" , "0928" , "Boston" , "MA" 
          , 02116 , "arielSparks@gmail.com" , 980765006 , 36 , "Female", 00007));
         this.patDir.addPatient(new Patient("Eliza" , "French" , "70 WALTHAM ST" , "401" , "Boston" , "MA" 
          , 02115 , "Frencheliza@gmail.com" , 980765007 , 25 ,  "Female", 00010));
    }
    
    
    
}
