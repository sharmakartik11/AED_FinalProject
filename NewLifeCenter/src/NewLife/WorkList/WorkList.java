/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.WorkList;
import NewLife.Porter.Porter;
import NewLife.WorkList.WorkRequest;
import NewLife.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shivanidatar
 */
public class WorkList{
    private List<WorkRequest> workRequestList;

    public WorkList() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public List<WorkRequest> getWorkRequestListCustomer(UserAccount account){
        List<WorkRequest> workRequestListCustomer = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getPatient() != null){
                UserAccount customerAccount = workRequest.getPatient();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListCustomer.add(workRequest);
                }
            }
        }
        return workRequestListCustomer;
    }
    
    public List<WorkRequest> getWorkRequestListGovernment(UserAccount account){
        List<WorkRequest> workRequestListGovernment = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getGovernment()!= null){
                UserAccount customerAccount = workRequest.getGovernment();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListGovernment.add(workRequest);
                }
            }
        }
        return workRequestListGovernment;
    }
    
    public List<WorkRequest> getWorkRequestListPharmaceutical(UserAccount account){
        List<WorkRequest> workRequestListPharmaceutical = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getPharmaceutical()!= null){
                UserAccount customerAccount = workRequest.getPharmaceutical();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListPharmaceutical.add(workRequest);
                }
            }
        }
        return workRequestListPharmaceutical;
    }
    
    public List<WorkRequest> getWorkRequestListHosAdmin(UserAccount account){
        List<WorkRequest> workRequestListHospitalAdmin = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getHospitalAdmin()!= null){
                UserAccount customerAccount = workRequest.getHospitalAdmin();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListHospitalAdmin.add(workRequest);
                }
            }
        }
        return workRequestListHospitalAdmin;
    }
    
    public List<WorkRequest> getWorkRequestListRestaurant(UserAccount account){
        List<WorkRequest> workRequestListRestaurant = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getPharmacy() != null){
                UserAccount restuarantAccount = workRequest.getPharmacy();
                if(restuarantAccount.getUsername().equals(account.getUsername())){
                    workRequestListRestaurant.add(workRequest);
                }
            }
        }
        return workRequestListRestaurant;
    }
    
    public List<WorkRequest> getWorkRequestListHospital(UserAccount account){
        List<WorkRequest> workRequestListHospital = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getReception()!= null){
                UserAccount hospitalAccount = workRequest.getReception();
                if(hospitalAccount.getUsername().equals(account.getUsername())){
                    workRequestListHospital.add(workRequest);
                }
            }
        }
        return workRequestListHospital;
    }
    
    public List<WorkRequest> getWorkRequestListDoctor(UserAccount account){
        List<WorkRequest> workRequestListDoctor = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getDoctor()!= null){
                UserAccount hospitalAccount = workRequest.getDoctor();
                if(hospitalAccount.getUsername().equals(account.getUsername())){
                    workRequestListDoctor.add(workRequest);
                }
            }
        }
        return workRequestListDoctor;
    }
    
    public List<WorkRequest> getWorkRequestListabAssistant(UserAccount account){
        List<WorkRequest> workRequestListLabAssistant = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getLabAssistant()!= null){
                UserAccount hospitalAccount = workRequest.getLabAssistant();
                if(hospitalAccount.getUsername().equals(account.getUsername())){
                    workRequestListLabAssistant.add(workRequest);
                }
            }
        }
        return workRequestListLabAssistant;
    }
    
    public List<WorkRequest> getWorkRequestListAmbulanceDriver(UserAccount account){
        List<WorkRequest> workRequestListAmbulanceDriver = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getAmbulanceDriver()!= null){
                UserAccount hospitalAccount = workRequest.getAmbulanceDriver();
                if(hospitalAccount.getUsername().equals(account.getUsername())){
                    workRequestListAmbulanceDriver.add(workRequest);
                }
            }
        }
        return workRequestListAmbulanceDriver;
    }
    
    public List<WorkRequest> getWorkRequestListAccount(UserAccount account){
        List<WorkRequest> workRequestListAccount = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getAccount()!= null){
                UserAccount hospitalAccount = workRequest.getAccount();
                if(hospitalAccount.getUsername().equals(account.getUsername())){
                    workRequestListAccount.add(workRequest);
                }
            }
        }
        return workRequestListAccount;
    }
    
    
    public List<WorkRequest> getWorkRequestListDeliveryMan(UserAccount account){
        List<WorkRequest> workRequestListDelivery = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getDeliverMan()!= null){              
                Porter deliveryManAccount = workRequest.getDeliverMan();
                 workRequestListDelivery.add(workRequest);
            }
        }
        return workRequestListDelivery;
    }
    
    public void addWorkRequest(WorkRequest workRequest){
       workRequestList.add(workRequest); 
    }
    
}
