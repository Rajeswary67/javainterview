package OOPINTERFACE;

public class TestHospital {

	public static void main(String[] args) {
		
    FortisHospital fh=new FortisHospital();
    fh.cardioServices();
    fh.dentalServices();
    fh.medicalInsurance();
    fh.ENTServices();
    fh.medicalTraining();
    fh.neuroServices();
    fh.oncologyServices();
    fh.orthoServices();
    fh.pediaServices();
    fh.physioServices();
    fh.emergencyServices();
    fh.dermaServices();
    USMedical us=new FortisHospital();
    us.dentalServices();
    us.dermaServices();
    us.emergencyServices();
    us.oncologyServoces();
    us.physioServices();
   // us.cardioServices();
    //us.medicalTraining();
    UKMedical uk= new FortisHospital();
   uk.cardioServices();
    uk.emergencyServices();
    
    
    uk.pediaServices();       //FortisHospital fh1=new USMedical();
    fh.helpDesk();
    fh.billing();
    fh.covid19Test();
    fh.pandemicAnnouncement();
    
    
    
	}

}
