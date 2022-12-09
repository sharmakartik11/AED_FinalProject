/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLifeCenter;

import NewLife.Account.AccountDirectory;
import NewLife.AmbulanceDriver.AmbulanceDriverDirectory;
import NewLife.Doctors.DoctorDirectory;
import NewLife.Government.MunicipalityDirectory;
import NewLife.Hospital.HospitalAdminDirectory;
import NewLife.LabAssistant.LabAssistantDirectory;
import NewLife.MedicalInformation.MedicalInformationDirectory;
import NewLife.Patient.PatientDirectory;
import NewLife.Pharmaceutical.PharmaceuticalDirectory;
import NewLife.Pharmacy.PharmacyDirectory;
import NewLife.Porter.PorterDirectory;
import NewLife.Reception.ReceptionDirectory;
import NewLife.Role.Role;
import NewLife.Role.SysAdminRole;
import NewLife.WorkList.WorkList;
import java.util.ArrayList;


/**
 *
 * @author shivaniguglani
 */
public class NewLife extends Organization{
    private static NewLife business;
    private PharmacyDirectory pharmacyDirectory;
    private PatientDirectory patientDirectory;
    private PorterDirectory deliveryManDirectory;
    private HospitalAdminDirectory hospitalDirectory;
    
    private MunicipalityDirectory governmentDirectory;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private DoctorDirectory doctorDirectory;
    private ReceptionDirectory receptionDirectory;
    private AmbulanceDriverDirectory ambulanceDriverDirectory;
    private LabAssistantDirectory labAssistantDirectory;
    private AccountDirectory accountDirectory;
    private MedicalInformationDirectory medInfoDirectory;
    private WorkList workQueue;
    
    
    public NewLife(PharmacyDirectory pharmacyDirectory,MedicalInformationDirectory medInfoDirectory,AccountDirectory accountDirectory,LabAssistantDirectory labAssistantDirectory,AmbulanceDriverDirectory ambulanceDriverDirectory, PatientDirectory patientDirectory, PorterDirectory deliveryManDirectory,HospitalAdminDirectory hospitalDirectory,MunicipalityDirectory governmentDirectory,PharmaceuticalDirectory pharmaceuticalDirectory,DoctorDirectory doctorDirectory,ReceptionDirectory receptionDirectory,WorkList workQueue) {
        this.pharmacyDirectory = pharmacyDirectory;
        this.patientDirectory = patientDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.governmentDirectory = governmentDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.pharmaceuticalDirectory = pharmaceuticalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.receptionDirectory = receptionDirectory;
        this.ambulanceDriverDirectory = ambulanceDriverDirectory;
        this.labAssistantDirectory = labAssistantDirectory;
        this.accountDirectory = accountDirectory;
        this.medInfoDirectory = medInfoDirectory;
        
        this.workQueue = workQueue;
    }
    
    public static NewLife getInstance(){
        if(business==null){
            business=new NewLife();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
    }
    private NewLife(){
        super(null);
        //networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
      if(!this.getUserAccountDirectory().checkUsernameUnique(userName)){
            return false;
        }
       return true;
    }
    
}
