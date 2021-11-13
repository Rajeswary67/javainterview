package OOPINTERFACE;

public class FortisHospital extends Hospital implements USMedical, UKMedical, INDIAServices{
	@override
	public void physioServices()
	{
	System.out.println("FH..physio services");
	}
	@override
	public void oncologyServices()
	{
		System.out.println("FH..oncologyServices");
	}
    @override
    public void dentalServices()
    {
    	System.out.println("FH..dentalServices");
    }
	@override
	public void pediaServices()
	{
		System.out.println("FH..pediaServices");
	}
	@override
	public void cardioServices()
	{
		System.out.println("FH..cardioServices");
	}
	@override
	public void neuroServices()
	{
		System.out.println("FH..neuroServices");
	}
	@override
	public void orthoServices()
	{
		System.out.println("FH..orthoservices");
	}
	@override
	public void ENTServices()
	{
		System.out.println("FH..ENTServices");
	}
	//individualmethods of FORTIS HOSPITAL
	public void medicalInsurance()
	{
		System.out.println("FH..MedicalInsurance");
	}
	public void medicalTraining()
	{
		System.out.println("FH..medicalTraining");
	}
	@override
	public void emergencyServices()
	{
		System.out.println("FH..emergencyServices");
	}
	@override
	public void dermaServices()
	{
		System.out.println("FH..dermaServices");
	}
	@Override
	public void oncologyServoces() {
		System.out.println("FH..oncologyServices");
	}
	@override
	public void helpdesk()
	{
		System.out.println("FH..helpDesk");
	}
	@override
	public void billing()
	{
		System.out.println("FH..billing");
	}
	
	@override
	public void covid19Test()
	{
		System.out.println("covid19Test");
	}
	@override
	public void pandemicAnnouncement()
	{
		System.out.println("pandemicAnnouncement");
	}
	
	
	
}
