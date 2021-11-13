package javainterview;
import java.util.ArrayList;
//import java.util.Arrays;
public class TestTeamDevices {

	public static void main(String[] args) {
		Team t1=new Team();
		ArrayList<String>QADevices=t1.getDevicesList("QA");

		System.out.println("QA Devices");
		if(QADevices.size()==3) {
			System.out.println("pass for QA team Device Count");
		}
	    if(QADevices.contains("iphone 7"))
	    {
	    	System.out.println("iphone 7 is pesent");
	    }
	    t1.getDevicesList("emp");
	    //t1.launchBrowser("chrome");
//	    Object ob[]=t1.getStudentInfo("naveen");
//	    System.out.println(Arrays.toString(ob));
//	
	
	}
	
	}


